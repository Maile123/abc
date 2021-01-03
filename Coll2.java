//ArrayList allows duplicates also and allows only one attribute

//import java.util.ArrayList;
//import java.util.Collections;

//
//public class Coll2 {
//    public static void main(String[] args) {

//        ArrayList<String> obj =new ArrayList<String>();

//        ArrayList<Integer> nbr =new ArrayList<Integer>(); {

//            obj.add("Bannana");
//             obj.add("Bannana");
//              obj.add("Orange");
//               obj.add("Grapes");
//                obj.add("BlackCherry");

//                nbr.add(1);
//                nbr.add(2);
//                nbr.add(2);

//                Collections.sort(obj);

//               for (String i: obj)
//
//               System.out.println(i);

//               for(Integer j: nbr)

//            System.out.println(j);
//            System.out.println("Is Bannana is present in ArrayList: ");
//            System.out.println(obj.contains("Bannana"));
//        }
//    }
//}






import java.util.ArrayList;

    class Coll2 {
        public static void main(String[] args) {

            // create an arraylist
            ArrayList<Integer> number = new ArrayList<>();

            number.add(1);
            number.add(3);
            number.add(5);

            System.out.println("ArrayList: " + number);

            System.out.println("size of ArrayList is: " + number.size());

            System.out.println("Returning list status: " + number.isEmpty());

            System.out.println("Sublist:" + number.subList(1, 2));

            System.out.println("position of 3 is: " + number.indexOf(3));

            // create copy of number
//        ArrayList<Integer> cloneNumber = (ArrayList<Integer>)number.clone();

            System.out.println("Cloned ArrayList: " + number.clone());

            Integer[] arr = new Integer[(number.size())];

            number.toArray(arr);

            System.out.println("Sending numbers into Array type: ");

            for (Integer item : arr)

                System.out.print(item + " ");
        }
    }
