package code.singleton;

/**
 * 
 * @author dgm
 * @describe "线程安全双重检测的单例"
 * @date 2020年5月13日
 */
public class ThreadSafeDoubleCheckSingleton {

    private static ThreadSafeDoubleCheckSingleton instance;
    
    private ThreadSafeDoubleCheckSingleton(){}
    
    public  static   ThreadSafeDoubleCheckSingleton getSingletonInstance(){
    	 if(instance == null){
    	        synchronized (ThreadSafeDoubleCheckSingleton.class) {
    	            if(instance == null){
    	                instance = new ThreadSafeDoubleCheckSingleton();
    	            }
    	        }
    	    }
    	    return instance;
    }
    
    public void showMessage(String msg){
	      System.out.println("我是一个线程安全双重检测单例的方法调用,"+msg);
    }  
}
