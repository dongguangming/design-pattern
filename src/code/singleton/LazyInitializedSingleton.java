package code.singleton;

/**
 * 
 * @author dgm
 * @describe "延迟初始化实例"
 * @date 2020年5月13日
 */
public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;
    
    private LazyInitializedSingleton(){}
    
    public static LazyInitializedSingleton getSingletonInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
    public void showMessage(String msg){
	      System.out.println("我是一个延迟初始化单例的方法调用,"+msg);
    }
}
