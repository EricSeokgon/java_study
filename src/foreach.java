/**
 * Created by Administrator on 2015-04-26.
 */
public class foreach {
    public static void main(String[] args) {
        String[] neumers = {"one","two","three"};
        for (int i = 0; i <neumers.length ; i++) {
            System.out.println(neumers[i]);
        }
        for (String num:neumers){
            System.out.println(num);
        }
    }
}
