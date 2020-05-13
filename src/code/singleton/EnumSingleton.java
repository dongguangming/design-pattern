package code.singleton;

/**
 * 
 * @author dgm
 * @describe "枚举单例"
 * @date 2020年5月13日
 */
public enum  EnumSingleton {
	    INSTANCE,
	    OTHER_INSTANCE;
	    public void showMessage(String msg){
		      System.out.println("我是一个枚举型单例的方法调用,"+msg);
	    }  
}
