package b_stack;

import b_stack.practice.ArrayListStack;
import b_stack.practice.ArrayStack;
import b_stack.practice.LinkedListStack;
import b_stack.practice.Stack;

public class StackApplication {
    public static void main(String[] args) {
//        Stack<String> stack = new Stack<>();
//
//        System.out.println(stack);
//        System.out.println(stack.size());
//        System.out.println(stack.empty());
//        System.out.println();
//
//        stack.push("딸기");
//        stack.push("포도");
//
//        System.out.println(stack);
//        System.out.println(stack.size());
//        System.out.println(stack.empty());
//        System.out.println(stack.peek());
//        System.out.println();

        //Stack 구현 및 테스트
//        Stack<String> stack = new ArrayStack<String>(String.class, 5);
//        stack.push("딸기");
//        stack.push("포도");
//        stack.pop();
//        System.out.println(stack);
//        System.out.println(stack.size());
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.contains("딸기"));
//        System.out.println(stack.peek());
//        System.out.println();

//        //ArrayListStack 구현 및 테스트
//        Stack<String> stack = new ArrayListStack<>(5);
//        stack.push("딸기");
//        stack.push("포도");
//        stack.push("복숭아");
//        stack.pop();
//
//        System.out.println(stack);
//        System.out.println(stack.size());
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.contains("딸기"));
//        System.out.println(stack.peek());
//        System.out.println();

        //LinkedListStack 구현 및 테스트
        Stack<String> stack = new LinkedListStack<>();
        stack.push("딸기");
        stack.push("포도");
        stack.push("복숭아");
        stack.pop();

        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.contains("딸기"));
        System.out.println(stack.peek());
        System.out.println();
    }
}
