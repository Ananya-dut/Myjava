import java.util.*;
public class arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1=new ArrayDeque<>();//syntax
        //inserting an element
//        ad1.add(6);
//        ad1.add(56);
//        ad1.add(9);
//        ad1.addFirst(5);
//        ad1.offerFirst(10);
//        System.out.println(ad1);
        //inserting at end
//        ad1.add(6);
//        ad1.add(56);
//        ad1.add(9);
//        ad1.addLast(5);
//        ad1.offerLast(10);
//        System.out.println(ad1);
        //accessing the 1st element
//        ad1.add(6);
//        ad1.add(56);
//        ad1.add(9);
//        ad1.add(10);
//        ad1.add(91);
//        ad1.add(19);
//        System.out.println(ad1.getFirst());
//        System.out.println(ad1.peekFirst());
//accessing the last element
//        ad1.add(6);
//        ad1.add(56);
//        ad1.add(9);
//        ad1.add(10);
//        ad1.add(91);
//        ad1.add(19);
//        System.out.println(ad1.getLast());
//        System.out.println(ad1.peekLast());
        //removing the 1st element
//        ad1.add(6);
//        ad1.add(56);
//        ad1.add(9);
//        ad1.add(10);
//        ad1.add(91);
//        ad1.add(19);
//        ad1.pollFirst();
//        ad1.removeFirst();
//        System.out.println(ad1);
        //removing the last element
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.add(10);
        ad1.add(91);
        ad1.add(19);
        ad1.pollLast();
        ad1.removeLast();
        System.out.println(ad1);
    }
}
