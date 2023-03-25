package learn001.test008annotation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StarProxy {
    public static Skill getProxy(Star s){
        return (Skill) Proxy.newProxyInstance(s.getClass().getClassLoader(),
                s.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("收首付款");
                        Object rs= method.invoke(s,args);
                        System.out.println("收尾款");
                        return rs;
                    }
                });
    }
}
