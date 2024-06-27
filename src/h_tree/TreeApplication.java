package h_tree;

import h_tree.practice.BinarySearchTree;

public class TreeApplication {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.order();
        System.out.println();
        System.out.println(tree.search(40));
        System.out.println(tree.search(90));
        tree.delete(20);
        tree.delete(50);
        tree.order();
    }
}
