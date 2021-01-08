public class Example1 {
    int x;
    static String name="Priya";
    //creating  constructor
    public Example1(){
        x=5;
        System.out.println("This is constructor block");
    }
    //creating non_static method
    public void print(){
        System.out.println("This is non_static block");
    }
    //creating static block
    static void change(){
        System.out.println("This is Static block");
        name="Priyanka";
        System.out.println(name);
    }

    public static void main(String[] args) {
        //main block
        System.out.println("This is Main block");
        Example1 obj=new Example1();
        System.out.println(obj.x);
        obj.print();
        Example1.change();

    }
}
