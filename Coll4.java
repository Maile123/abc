import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;

public class Coll4 {
    public static void main(String[] args) {
        HashSet<Integer> num=new  HashSet<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        System.out.println("HashSet"+num);

        System.out.println("HashSet:"+ num.remove(3));

        HashSet<Integer> evennum= new HashSet<Integer>();
        evennum.add(6);
        evennum.add(8);
        evennum.addAll(num);
        System.out.println("HashSet:"+evennum);
        Iterator<Integer> iterator= evennum.iterator();
        System.out.println("using iterater");
        while(iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print(",");
        }






    }




}
