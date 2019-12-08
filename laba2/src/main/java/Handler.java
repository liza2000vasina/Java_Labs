
import java.lang.reflect.*;
import java.util.EmptyStackException;

public class Handler implements InvocationHandler {

    public Handler(){
        throw new UnsupportedOperationException();
    }

    public Object invoke(Object proxy, Method method, Object [] args) throws Exception {
        if(!method.getName().equals("setArray")){
            return method.invoke(proxy,args);
        } else{
            throw new EmptyStackException();
        }
    }
}
