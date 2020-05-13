package code.factory;

/**
 * 
 * @author dgm
 * @describe "测试工厂生产的产品合格吗"
 * @date 2020年5月12日
 */
public class TestFactory {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(ComputerType.PC,"2 GB","500 GB","2.4 GHz");
		Computer server = ComputerFactory.getComputer(ComputerType.SERVER,"16 GB","1 TB","2.9 GHz");
		Computer pad = ComputerFactory.getComputer(ComputerType.PAD,"8 GB","320 GB","3.0 GHz");
		Computer phone = ComputerFactory.getComputer(ComputerType.MOBILEPHONE,"8 GB","128 GB","2.8 GHz");

		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);
		System.out.println("Factory pad Config::"+pad);
		System.out.println("Factory mobilePhone Config::"+phone);
		
	}
}
