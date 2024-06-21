package a_linkedlist;

import a_linkedlist.practice.List;
import a_linkedlist.practice.SinglyLinkedList;

import java.util.LinkedList;

public class ListApplication {
    public static void main(String[] args) {
//        // 자바에서 제공하는 LinkedList 테스트
//        List<String> list = new LinkedList<>();
//
//        // addFirst(), addLast() 메소드
//        list.addFirst("사과");
//        list.addFirst("딸기");
//        list.addLast("포도");
//        list.addLast("키위");
//
//        list.add(1, "수박");
//
//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println();
//
//        // get(), contains() 테스트
//        System.out.println(list.get(0));
//        System.out.println(list.contains("딸기"));
//        System.out.println(list.contains("바나나"));
//        System.out.println();
//
//        // removeFirst() 메소드 테스트
//        list.removeFirst();
//
//        System.out.println(list);
//        System.out.println();
//
//        // removeLast() 메소드 테스트
//        list.removeLast();
//
//        System.out.println(list);
//        System.out.println();
//
//        // remove() 메소드 테스트
//        list.remove(0);
//
//        System.out.println(list);
//        System.out.println();
//
//        list.remove("포도");
//
//        System.out.println(list);
//        System.out.println();


        // SinglyLinkedList 테스트
        List<String> list = new SinglyLinkedList<>();
        list.addFirst("사과");
        list.addFirst("딸기");
        list.addFirst("바나나");

        System.out.println(list);
        System.out.println("size: " + list.size());
        System.out.println();

        list.addLast("포도");
        list.addLast("키위");

        System.out.println(list);
        System.out.println("size: " + list.size());
        System.out.println();

        list.add(5, "수박");
        list.add(2, "복숭아");
        System.out.println(list);
        System.out.println("size: " + list.size());
        System.out.println();

        System.out.println(list.get(0));
        System.out.println(list.get(3));
        System.out.println(list.get(5));
        System.out.println();

        System.out.println(list.contains("딸기"));
        System.out.println(list.contains("두리안"));
        System.out.println();

        list.removeFirst();
        list.removeLast();
        list.remove(3);
        list.remove("키위");
        System.out.println(list);
        System.out.println("size: " + list.size());
        System.out.println();
    }
}
