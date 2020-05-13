package code.singleton;
/**
 * 
 * @author dgm
 * @describe ""
 * @date 2020年5月13日
 */
public class SingleObject {
	 //创建 SingleObject 的一个对象
	   private static SingleObject instance = new SingleObject(0);
	 
	   //让构造函数为 private，这样该类就不会被实例化
	   private SingleObject(int i){
		      System.out.println("我是一个单例"+i);
	   }
	 
	   //获取唯一可用的对象
	   public static SingleObject getSingletonInstance(){
	      return instance;
	   }
	 
	   public void showMessage(String msg){
	      System.out.println("我是一个单例的方法调用,"+msg);
	   }
}
