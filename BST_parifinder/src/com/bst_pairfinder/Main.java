package com.bst_pairfinder;
/**
 * Driver class for running the application
 */
public class Main {

	public static void main(String[] args) {
		BinarySearchTree bst = BSTUtils.sampleBST();

		BSTPairFinder pairFinder = new BSTPairFinder(bst, 120);

		pairFinder.findPairs();

	}

}
