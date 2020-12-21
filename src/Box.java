import java.util.Arrays;

public class Box {
    double width;
    double height;
    double depth;
}
class Boxdemo{

    public static void main(String[] args) {
        double vol;
        Box b=new Box();
        b.width=100;
        b.height=20;
        b.depth=10;
        vol=b.width*b.height*b.depth;
        System.out.println("volume is " +
                ""+ vol);

    }
}
