package code.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 
 * @author dgm
 * @describe "序列化单例"
 * @date 2020年5月13日
 */
public class SerializedSingleton implements Serializable{

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton(){}
    
    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }
    
    public static SerializedSingleton getSingletonInstance(){
        return SingletonHelper.instance;
    }
    
    private Object readResolve() throws ObjectStreamException{
    	  //instead of the object we're on,
    	  //return the class valiable INSTANCE
    	  return getSingletonInstance();//SingletonHelper.instance;
    }
    
    public void showMessage(String msg){
	      System.out.println("我是一个序列化单例的方法调用,"+msg);
   }   
}