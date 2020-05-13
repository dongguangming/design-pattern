package code.singleton;

/**
 * 
 * @author dgm
 * @describe "饿汉式初始化单例"
 * @date 2020年5月13日
 */
public class EagerInitializedSingleton {
    
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    
    //注意是私有构造器，防止客户端使用
    private EagerInitializedSingleton(){}

    //全局访问方式获取单实例
    public static EagerInitializedSingleton getSingletonInstance(){
        return instance;
    }
    
    public void showMessage(String msg){
	      System.out.println("我是一个饿汉式初始化单例的方法调用,"+msg);
    }
}