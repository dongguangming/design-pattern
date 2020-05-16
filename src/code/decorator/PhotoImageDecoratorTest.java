package code.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 
 * @author dgm
 * @describe "装饰模式（装饰的是图片图像）测试"
 * @date 2020年5月16日
 */
public class PhotoImageDecoratorTest {

	public static void main(String[] args) throws IOException {
		//先生成图像对象，然后着色，装订，最后打印
		PrintDecorator image = new PrintDecorator("彩色激光打印要高清", 19, 11,
				new FrameDecorator("镶金装框",new ColorDecorator("天空式蓝色", new PhotoImageWrapper(
						"蒙娜丽莎的微笑", "1968/ifd.00042.jpg"))));
		System.out.println(image);
		       
        InputStream inputStream = new FileInputStream("f:\\InstallCert.java");
        InputStream bis = new BufferedInputStream(inputStream);
        InputStream in = new DataInputStream(bis);
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br  = new BufferedReader(isr);
        String line = null;
        while ((line = br.readLine()) != null) {
            //将文本打印到控制台
            System.out.println(line);
        }
        
        //BufferedReader br = new BufferedReader(new InputStreamReader(new DataInputStream(
        //new BufferedInputStream(new FileInputStream("f:\\InstallCert.java")))));
	}

	private static void addToPrintOrder(PrintDecorator image) {
		System.out.println(image);
	}
}