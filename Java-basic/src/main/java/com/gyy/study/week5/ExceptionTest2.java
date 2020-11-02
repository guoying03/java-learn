package com.gyy.study.week5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName ExceptionTest2
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/2
 **/
public class ExceptionTest2 {
    public static void main(String[] args) throws IOException {
        //在方法调用处捕获异常，这样做的好处是，即使出现异常，也不会影响其他代码的运行
        try {
            byte[] b = readFile("D:/QQ/photo/2.jpg");
            System.out.println(b.length);
        }catch (IOException e) {
            System.out.println("出现IO异常！！");
        }
        System.out.println("其他代码");

    }
    /**
     *用throws关键字在方法签名处声明异常
     *
     * @param path: 文件路径
     * @return b:字节数组
     * @throws IOException
     */
    public static byte[] readFile(String path) throws IOException{
        File file = new File(path);
        byte[] b = new byte[(int) file.length()];
        InputStream is = new FileInputStream(file);
        int result = is.read(b);
        System.out.println(result);
        is.close();
        return  b;

    }
}
