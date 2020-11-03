package day14;

/**
 * @ClassName AnonymityOuter
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/3
 **/
public interface AnonymityOuter {
    void hi();
}
class AnonymityTest{
    public static void main(String[] args) {
        AnonymityOuter anonymityOuter = new AnonymityOuter() {
            @Override
            public void hi() {
                System.out.println("Hi,AnonymityOuter.");
            }
        };
        anonymityOuter.hi();
    }
}
