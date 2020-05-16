package code.decorator;

/**
 * 
 * @author dgm
 * @describe "打印图像，类比ConcreteDecorator"
 * @date 2020年5月16日
 */
public class PrintDecorator extends ImageDecorator {
	private String desc;
	private double printWidth, printHeight;
	
	public PrintDecorator(String desc,double printWidth, double printHeight, PhotoImage target) {
		super(target);
		this.desc = desc;
		this.printWidth = printWidth;
		this.printHeight = printHeight;
	}

	@Override
	public String getDescription() {
		return target.getDescription() + desc+ " " + String.format("(%4.1f x %4.1f in)", getPrintWidth(), getPrintHeight());
	}

	public double getPrintWidth() {
		return printWidth;
	}

	public void setPrintWidth(double printWidth) {
		this.printWidth = printWidth;
	}

	public double getPrintHeight() {
		return printHeight;
	}

	public void setPrintHeight(double printHeight) {
		this.printHeight = printHeight;
	}
}