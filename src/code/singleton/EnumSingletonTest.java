package code.singleton;

/**
 * 
 * @author dgm
 * @describe "枚举单例测试"
 * @date 2020年5月14日
 */
public class EnumSingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
		EnumSingleton otherEnumSingleton = EnumSingleton.INSTANCE;
		EnumSingleton secondEnumSingleton = EnumSingleton.OTHER_INSTANCE;

		System.err.println("枚举型单例对象相等否： "+(enumSingleton==otherEnumSingleton));
	    System.out.println("enumSingleton hashCode="+enumSingleton.hashCode());
	    System.out.println("otherEnumSingleton hashCode="+otherEnumSingleton.hashCode());
		System.err.println("枚举型单例对象相等否： "+(enumSingleton==secondEnumSingleton));
	}
}
