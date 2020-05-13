package code.singleton;

/**
 * 
 * @author dgm
 * @describe "线程安全的单例"
 * @date 2020年5月13日
 */
public class ThreadSafeSingleton {

private static ThreadSafeSingleton instance;
    
    private ThreadSafeSingleton(){}
    
    public static synchronized  ThreadSafeSingleton getSingletonInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
    public void showMessage(String msg){
	      System.out.println("我是一个线程安全的单例的方法调用,"+msg);
    }  
}
