package day7;

import java.io.*;
import java.util.Arrays;

/**
 * @ClassName FileReadDemo
 * @Description 文件读取练习--用InputStream和OutputStream来实现文件的复制**
 * 抽象类在JDK中的大量使用：IO流
 * 学习IO流
 * @Author GYY
 * @Date 2020/10/26
 **/
public class FileReadDemo {
    public static void main(String[] args) throws IOException{
        //创建一个文件File对象，注意需要显示抛出异常（IOException是编译时异常）
        //可以用try catch 捕获，也可以在方法签名处使用 throws 抛出
        File file = new File("D:/QQ/photo/2.jpg");
        //创建一个字节输入流，此处有上转型对象
        InputStream is = new FileInputStream(file);
        //准备和文件大小一致的字节数组
        byte[] b = new byte[(int) file.length()];
        //通过字节输入流将文件读入数组
        is.read(b);
        //准备输出文件对象
        File outputFile = new File("D:/QQ/photo/1014.jpg");
        //准备输出流
        OutputStream os = new FileOutputStream(outputFile);
        //通过字节输出流将数组b的内容写到目标文件
        os.write(b);
        //关闭流
        is.close();
        os.close();
        //到这结束实现了将2.jpg复制到D盘，D盘中多了一个1014.jpg图片

    }
}
