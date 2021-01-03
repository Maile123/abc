//HashMap class...

import java.util.HashMap;
import java.util.Map;

public class Coll3 {
    public static void main(String[] args) {

        HashMap<String,Integer> num= new HashMap<>();       //creating HashMap

        num.put("India",1);
        num.put("Australia",2);
        num.put("japan",3);
        num.put("Srilanka",4);
        num.put("China",5);

        for (Map.Entry m:num.entrySet())
            System.out.println("ForEach loop: " +m);

        System.out.println(num.keySet());

        System.out.println(num.values());

        System.out.println("Copying HashMap:" +num.clone());
    }
}



//import java.util.*;
//
//public class Coll3 {
//    public static void main(String[] args) {

//        HashMap<Integer,String> hm=new HashMap<Integer,String>();

//        hm.put( 1,"anu");
//        hm.put(2,"vani");
//
//        for(Map.Entry m : hm.entrySet()){

//            if("Vani".equalsIgnoreCase(m.getValue().toString()))

//            System.out.println(m.getKey()+" "+m.getValue());
//        }
//    }
//}
