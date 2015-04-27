/**
 * Created by Administrator on 2015-04-26.
 */
public class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Animal cat= new Animal();
        cat.setName("boby");
        System.out.println(cat.name);
    }

}
