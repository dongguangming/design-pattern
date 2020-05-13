package code.singleton;

/**
 * 
 * @author dgm
 * @describe "内部静态辅助类"
 * @date 2020年5月13日
 */
public class InnerHelperSingleton {

    private InnerHelperSingleton(){}
    
    private static class SingletonHelper{
        private static final InnerHelperSingleton INSTANCE = new InnerHelperSingleton();
    }
    
    public static InnerHelperSingleton getSingletonInstance(){
        return SingletonHelper.INSTANCE;
    }
    
    public void showMessage(String msg){
	      System.out.println("我是一个内部静态辅助类的单例的方法调用,"+msg);
    }  
}
