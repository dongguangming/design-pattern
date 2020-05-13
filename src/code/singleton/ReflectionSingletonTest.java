package code.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 
 * @author dgm
 * @describe "反射单例"
 * @date 2020年5月13日
 */
public class ReflectionSingletonTest {
	 public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

		// 获取唯一可用的对象
		SingleObject object = SingleObject.getSingletonInstance();
		// 显示消息
		object.showMessage("正常流程");

		// 获取Class对象
		Class<?> singltonClass = null;
		SingleObject otherObject = null;
		try {
			singltonClass = Class.forName("code.singleton.SingleObject", false,
					SingletonPatternDemo.class.getClassLoader());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// 已经确定有Class对象，实际情况需要做判断类加载是否成功，获取所有构造器
		Constructor<?>[] allConstructors = singltonClass
				.getDeclaredConstructors();// getConstructors();
		System.out.println("所有构造器个数：" + allConstructors.length);
		for (Constructor<?> constructor : allConstructors) {
			System.out.println("构造器：" + constructor);
			if (!constructor.isAccessible()) {
				System.out.println("我是一个私有构造器");
				constructor.setAccessible(true);
			}
			// 用获取到的构造器实例化对象
			otherObject = (SingleObject) constructor.newInstance(1);

			// 通过“参数化”获取类里的方法
			Method method = singltonClass
					.getMethod("showMessage", String.class);
			// 执行方法
			method.invoke(otherObject, "不正常流程");
		}
		
		 System.err.println(object == otherObject);
	     System.out.println("object hashCode="+object.hashCode());
	     System.out.println("reflection Object hashCode="+otherObject.hashCode());
		}
}
