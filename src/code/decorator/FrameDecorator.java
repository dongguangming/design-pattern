package code.decorator;

/**
 * 
 * @author dgm
 * @describe "图像装框，类比ConcreteDecorator"
 * @date 2020年5月16日
 */
public class FrameDecorator extends ImageDecorator {

	private String desc;
	public FrameDecorator(String desc, PhotoImage target) {
		super(target);
		this.desc = desc;
	}

	@Override
	public String getDescription() {
		return target.getDescription() + ", "+desc+", ";
	}
}