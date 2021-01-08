 interface Printable {
    void print();
}
interface Showable{
    void show();
}
class Exampledemo implements Printable,Showable{
    @Override
    public void print() {
        System.out.println("Hi.......");

    }

    @Override
    public void show() {
        System.out.println("Bye......");
    }

    public static void main(String[] args) {
        Exampledemo obj=new Exampledemo();
        obj.print();
        obj.show();
    }
}

