package code.decorator;

/**
 * @author dgm
 * @describe "上色，类比ConcreteDecorator"
 * @date 2020年5月16日
 */
public class ColorDecorator extends ImageDecorator {
	String color;
	
	public ColorDecorator(String color, PhotoImage target) {
		super(target);
		this.color = color;
	}

	@Override
	public String getDescription() {
		return target.getDescription() + ", 上色(" + color + ")";
	}
}