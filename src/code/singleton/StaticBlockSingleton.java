package code.singleton;

/**
 * 
 * @author dgm
 * @describe "静态代码块初始化"
 * @date 2020年5月13日
 */
public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;
    
    private StaticBlockSingleton(){}
    
    //在静态代码块初始化进行异常处理
    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("创建单实例时发生了异常");
        }
    }
    
    public static StaticBlockSingleton getSingletonInstance(){
        return instance;
    }
    
    public void showMessage(String msg){
	      System.out.println("我是一个静态代码块初始化单例的方法调用,"+msg);
    }
}