package day19;

/**
 * @ClassName Card
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/8
 **/
public class Card {
    //点数
    private String ds;
    //花色
    private String hs;

    public Card (String ds, String hs){
        this.ds = ds;
        this.hs = hs;
    }
    public void showCard(){
        System.out.println(ds + hs);
    }
}
