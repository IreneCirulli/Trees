package com.company;

public class Main {

    public static void main(String[] args) {
        BinaryTree trees = new BinaryTree();

        trees.adds("D");
        trees.adds("B");
        trees.adds("A");
        trees.adds("C");
        trees.adds("F");
        trees.adds("E");
        trees.adds("G");

        System.out.println("Tree Structure");
        System.out.println("==============");
        System.out.println();
        System.out.println(trees);

        System.out.println();

        System.out.println("Preorder Traversal");
        System.out.println("==================");
        System.out.println(trees.preOrderTraversal());

        System.out.println();
        System.out.println("Inorder Traversal");
        System.out.println("=================");
        System.out.println(trees.inOrderTraversal());

        System.out.println();
        System.out.println("Postorder Traversal");
        System.out.println("===================");
        System.out.println(trees.postOrderTraversal());

        BinaryTree tree1 = new BinaryTree();
        tree1.adds("Q");
        tree1.adds("C");
        tree1.adds("T");
        tree1.adds("J");
        tree1.adds("M");
        tree1.adds("E");

        System.out.println();

        System.out.println("Tree Structure");
        System.out.println("==============");
        System.out.println();
        System.out.println(tree1);
        System.out.println();
        System.out.println("Traversal");
        System.out.println("==================");
        System.out.println(tree1.Traversal());
    }
}
