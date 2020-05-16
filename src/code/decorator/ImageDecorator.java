package code.decorator;

/**
 * 
 * @author dgm
 * @describe "图像装饰，类比Decorator"
 * @date 2020年5月16日
 */
public abstract class ImageDecorator extends PhotoImage {
	protected PhotoImage target;
	
	public ImageDecorator(PhotoImage target) {
		this.target = target;
	}
	
	@Override
	public String getDescription() {
		return target.getDescription();
	}
	
	@Override
	public String toString() {
		return getDescription();
	}
}