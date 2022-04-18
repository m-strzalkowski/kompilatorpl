package pl.plpl.Debuger;

import org.antlr.v4.runtime.tree.ParseTreeListener;
import pl.plpl.parser.plplListener;

import java.lang.reflect.Method;

public class ListenerInvocationHandlerForDebugger extends InvocationHandlerForDebugger{
    public ListenerInvocationHandlerForDebugger(Object target, DebugerKompilatora debugger) {
        super(target, debugger);
        for(Method method: plplListener.class.getDeclaredMethods())
        {
            this.methods.put(method.getName(), method);
            System.err.println(method.getName());
        }
        for(Method method: ParseTreeListener.class.getDeclaredMethods())
        {
            this.methods.put(method.getName(), method);
            System.err.println(method.getName());
        }
    }
}
