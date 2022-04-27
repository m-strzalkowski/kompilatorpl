package pl.plpl.Debuger;

import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import pl.plpl.parser.plplListener;
import pl.plpl.parser.plplVisitor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class InvocationHandlerForDebugger implements InvocationHandler {

    private final DebugerKompilatora debugger;

    final Map<String, Method> methods = new HashMap<>();

    private Object target;
int i=0;
    public InvocationHandlerForDebugger(Object target, DebugerKompilatora debugger) {
        this.target = target;
        this.debugger = debugger;

        for(Method method: target.getClass().getDeclaredMethods()) {
            this.methods.put(method.getName(), method);
            //System.err.println(method.getName());
        }
        i=0;

    }
    public Object getTarget(){return target;}

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {

        long start = System.nanoTime();

        if(!("enterEveryRule".equals(method.getName()) || "exitEveryRule".equals(method.getName())))
        debugger.krok(target, !(method.getName().contains("exit")), method, args);

        //System.out.println("target:"+target+" args:"+ Arrays.toString(args)+ "method:"+ method.getName());
        Object result = methods.get(method.getName()).invoke(target, args);

        long elapsed = System.nanoTime() - start;
        //if(!("enterEveryRule".equals(method.getName()) || "exitEveryRule".equals(method.getName())))
        //debugger.krok(target, false, method, args);

        //System.out.println("Executing "+ method.getName()+" finished in "+ elapsed+" ns, i="+i++);

        return result;
    }
}