package code.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * 
 * @author dgm
 * @describe "序列化单例测试"
 * @date 2020年5月13日
 */
public class SingletonSerializedTest {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        SerializedSingleton instanceOne = SerializedSingleton.getSingletonInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                "SerializedSingleton.txt"));
        out.writeObject(instanceOne);
        out.close();
        
        //反序列化对象
        ObjectInput in = new ObjectInputStream(new FileInputStream(
                "SerializedSingleton.txt"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();
        System.err.println("相等否： "+(instanceOne==instanceTwo));
        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
    }

}