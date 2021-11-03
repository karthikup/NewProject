package com.btc.trees;

public class MainClass {

	public static void main(String[] args) 
	{
		BinarySearchTree t = new BinarySearchTree();
		t.insert(10, "ten");
		t.insert(4, "four");
		t.insert(3, "three");
		t.insert(5, "five");
		t.insert(11, "Eleven");
		t.insert(12, "Twevel");
		System.out.println("Post-order Traversal : ");
		t.printPostOrder();
		System.out.println();
		System.out.println("In-order Traversal : ");
		t.printInorder();
		System.out.println();
		System.out.println("Pre-oder Traversal : ");
		t.printPreOrder();
	}

}
