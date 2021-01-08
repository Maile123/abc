////import java.util.LinkedList;
////
////class Coll5 {
////    public static void main(String[] args) {
////        LinkedList<String> obj=new LinkedList<>();
////        obj.add("Red");
////        obj.add("Orange");
////        obj.add("Yellow");
////        obj.add("Green");
////        obj.add("Red");
////        System.out.println("LinkedList Elements"+obj);
////        for(String i:obj)
////            System.out.println(i);
////
////
////
////    }
////
////}
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//class Coll5{
//    public static void main(String[] args) {
//        Queue<String>  animal = new LinkedList<>();
//        animal.add("Dog");
//        animal.add("Cat");
//        animal.add("Cow");
//        System.out.println(animal);
//        //peek method
//        System.out.println(animal.peek());
//        //poll method
//
//        System.out.println(animal.poll());
//        System.out.println(animal);
//        //offer method
//        System.out.println(animal.offer("Pig"));
//        System.out.println(animal);
//    }
//}


import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

class Coll5{
    public static void main(String[] args) {
        Deque<Integer> num= new LinkedList<>();
        num.add(2);
        num.add(4);
        num.add(6);
        num.add(8);
        System.out.println(num);
        Iterator<Integer>  iterator= num.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next());
            System.out.println(",");
        }
        num.addFirst(1);
        System.out.println(num);
        num.addLast(5);
        System.out.println(num);
        System.out.println(num.getLast());
        System.out.println(num);

    }
}