public class Methodoverloading {
    public void display(int a)
    {
        System.out.println("Argument a is integer:"+a);
    }
    public void display(String b){
        System.out.println("Argument b is String:"+b);
    }

    public static void main(String[] args) {
        Methodoverloading obj=new Methodoverloading();
        obj.display(1);
       obj.display("hi...");
    }
}
