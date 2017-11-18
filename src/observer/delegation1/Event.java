package observer.delegation1;

import java.lang.reflect.Method;

public class Event {
    private Object object;
    private String methodName;
    private Object [] params;
    private Class [] paramTypes;

    public Event(Object object,String methodName,Object...objects ){
        this.object=object;
        this.methodName=methodName;
        this.params=objects;
        contractParamTypes(this.params);
    }

    private void contractParamTypes(Object [] params){
        if(params==null){
            return;
        }
        paramTypes=new Class[params.length];
        for(int i=0;i<params.length;i++){
            paramTypes[i]=params[i].getClass();
        }
    }

    // EventHandler通过nofityx()调用该方法，
    //该方法通拿到每一个具体的传入的对象和传入的方法名，经过反射调用对应的方法
    public void invoke() throws Exception{
        Method method =object.getClass().getMethod(methodName, paramTypes);
        if(method==null){
        }else{
            method.invoke(object, params);
        }
    }

}

