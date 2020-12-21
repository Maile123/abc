public class Box1 {
    double width;
    double height;
    double depth;
    Box1()
    {
        System.out.println(" new constractor ");
         width=100;
         height=20;
         depth=20;
    }
    double volume()
    {
        return  width*height*depth;
    }
}
class Boxdemo1{
    public static void main(String[] args) {
        double vol;
        Box1 b=new Box1();
        vol=b.volume();
        System.out.println("volume is "+vol);

    }
}
