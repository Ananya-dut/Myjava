import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();//syntax, in bracket you can add constructor
        ArrayList<Integer> l2=new ArrayList<>();
        //add element
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(6);
        l1.add(5,5);//inserts 5 at the 5th index in l1
        l1.add(3);
       l1.set(1,566);
       for(int i=0;i<l1.size();i++){
           System.out.print(l1.get(i));
//           System.out.print(", ");
       }
//        l2.add(11);
//        l2.add(12);
//     l2.add(13);
//     l2.add(14);
        //System.out.println("arraylist before:"+l1);
        //removing element
        //l1.remove(0);
       // System.out.println("arraylist after remove the value at index 0:"+l1);
//checking if an element is containing in the arraylist or not
//        System.out.println("l1 arraylist:"+l1);
        //System.out.println("l1 list contains 7:"+l1.contains(7));
       // System.out.println("l1 list contains 4:"+l1.contains(4));
        //merging two arraylist
       // System.out.println("l2 arraylist:"+l2);
       // l1.addAll(l2);//by default add after l1 element the l2 elements are added
        //System.out.println("l1 arraylist after merging with l2:"+l1);
        //add l2 element as user wish by defining the index position
       // l1.addAll(0,l2);//index position at 0
        //System.out.println("l1 arraylist after merging with l2:"+l1);
        //finding the index number of a particular value at first occurrence
        System.out.println("the first occurrence of 3 in l1 is at index: "+l1.indexOf(3));
        //finding the index number of a particular value at last occurrence
        System.out.println("the last occurrence of 3 in l1 is at index:"+l1.lastIndexOf(3));
    }
}
