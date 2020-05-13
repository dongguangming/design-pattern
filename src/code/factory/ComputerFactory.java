package code.factory;

/**
 * 
 * @author dgm
 * @describe "生产产品的工厂，类似富士康"
 * @date 2020年5月12日
 */
public class ComputerFactory {

	public static Computer getComputer(ComputerType type,  String ram, String hdd, String cpu){

		/*if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
		else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);
		else if("MobilePhone".equalsIgnoreCase(type)) return new MobilePhone(ram, hdd, cpu);
		else if("Pad".equalsIgnoreCase(type)) return new Pad(ram, hdd, cpu);

		return null;
		*/
		
		Computer product = null;
		switch (type) {
		case PC:
			product = new PC(ram, hdd, cpu);
			break;
		case SERVER:
			product = new Server(ram, hdd, cpu);
			break;
		case MOBILEPHONE:
			product = new MobilePhone(ram, hdd, cpu);
			break;
		case PAD:
			product = new Pad(ram, hdd, cpu);
			break;
		}

		return product;
	}
}
