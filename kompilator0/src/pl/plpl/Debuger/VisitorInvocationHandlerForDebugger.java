package pl.plpl.Debuger;

import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import pl.plpl.parser.plplListener;
import pl.plpl.parser.plplVisitor;

import java.lang.reflect.Method;

public class VisitorInvocationHandlerForDebugger extends InvocationHandlerForDebugger{
    public VisitorInvocationHandlerForDebugger(Object target, DebugerKompilatora debugger) {
        super(target, debugger);
        for(Method method: plplVisitor.class.getDeclaredMethods())
        {
            this.methods.put(method.getName(), method);
            //System.err.println(method.getName());
        }
        for(Method method: ParseTreeVisitor.class.getDeclaredMethods())
        {
            this.methods.put(method.getName(), method);
            //System.err.println(method.getName());
        }
    }
}
