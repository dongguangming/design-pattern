package code.factory;

/**
 * 
 * @author dgm
 * @describe "pad平板"
 * @date 2020年5月12日
 */
public class Pad extends Computer {

	private String ram;
	private String hdd;
	private String cpu;
	
	public Pad(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}
}