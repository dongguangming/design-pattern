package code.decorator;

/**
 * 
 * @author dgm
 * @describe "类比ConcreteComponent"
 * @date 2020年5月16日
 */
public class PhotoImageWrapper extends PhotoImage {

	// 图像标题
	String title;
	// 图片文件名
	String fileName;
	// 图像宽高
	int pixWidth, pixHeight;

	public PhotoImageWrapper() {
		// Empty; used in Decorators.
	}

	public PhotoImageWrapper(String title, String fileName) {
		super();
		this.title = title;
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		return getDescription();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getPixWidth() {
		return pixWidth;
	}

	public void setPixWidth(int width) {
		this.pixWidth = width;
	}

	public int getPixHeight() {
		return pixHeight;
	}

	public void setPixHeight(int height) {
		this.pixHeight = height;
	}

	@Override
	public String getDescription() {
		return getTitle();
	}
}
