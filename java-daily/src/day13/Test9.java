package day13;

/**
 * @ClassName Test9
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/1
 **/
public class Test9 {
    public static void main(String[] args) {
        String s = "qweRY123";
        System.out.println(s + "密码是否合法:" + isV(s));
    }

    public static boolean isV(String pwd){
        if (pwd.length() < 8){
           return false;
        }

        int countA = 0;
        char[] chars = pwd.toCharArray();
        for (int i = 0; i < chars.length; i++){
            char ch = chars[i];
            //2个 大写字符
            if (ch >= 'A' && ch <= 'Z'){
                countA++;
            }

            //字母数字
            if ((ch < '0' || ch > '9') && (ch < 'A' || ch > 'Z') && (ch < 'a' || ch > 'z'))
            {
                return false;
            }
        }
        if (countA < 2){
            return false;
        }
        return true;
    }
}
