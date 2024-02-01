import java.util.*;
public class linkedlist {
    public static void main(String[] args) {
       LinkedList<Integer> l1=new LinkedList<>();
       //adding element in linked list
        l1.add(11);
        l1.add(22);
        l1.add(33);
        l1.add(44);
        l1.add(55);
        l1.add(77);
        l1.add(5,66);//inserts 66 at index 5
        System.out.println("l1 linked list:"+l1);
        //Removing an element from the linked list
//        l1.remove(2);//removes element present at 2nd index
//        System.out.println("l1 linked list after:"+l1);
        //changing an element of linked list
//        l1.set(2,10);//changes element present at 2nd index means 33 changes to 10
//        System.out.println("l1 linked list after:"+l1);
        //inserting an element at the last of the linked list
//        l1.addLast(100);//inserting 100 at the end of l1
//        System.out.println("l1 linked list after inserting element at last index:"+l1);
        //inserting an element at the first of the linked list
//        l1.addFirst(0);
//        System.out.println("l1 linked list after inserting element at first index:"+l1);
        System.out.println(l1.contains(77));
        System.out.println(l1.indexOf(22));
        System.out.println(l1.lastIndexOf(77));
//        l1.clear();
//        System.out.println("after clearing the linked list of l1:"+l1);
        for(int i=0;i<l1.size();i++) {
            System.out.print(l1.get(i));
            if (i == l1.size() - 1) {
                break;
            }
            else {
                System.out.print(", ");
            }
        }
    }
}
