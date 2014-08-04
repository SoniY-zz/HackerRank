package com.hackerrank;
import java.util.Scanner;

public class TreeHeight {

	private static class Node {
		Node left, right;
		int data;

		Node(int newData) {
			left = right = null;
			data = newData;
		}
	}

	private static Node insert(Node node, int data) {
		if (node == null) {
			node = new Node(data);
		} else {
			if (data < node.data) {
				node.left = insert(node.left, data);
			} else {
				node.right = insert(node.right, data);
			}
		}
		return (node);
	}

	private static Node addRandomElement(Node node, int data, int index) {
		if (node == null) {
			node = new Node(data);
		} else {
			if (index <= 2) {
				node.left = addRandomElement(node.left, data, index);
			} else {
				node.right = addRandomElement(node.right, data, index);
			}

		}
		return (node);
	}

	/* Write your custom functions here */
	static int diameterOfTree(Node root) {
		if (root == null)
			return 0;

		int rootDiameter = getHeight(root.left) + getHeight(root.right) + 1;
		int leftDiameter = diameterOfTree(root.left);
		int rightDiameter = diameterOfTree(root.right);

		return Math.max(rootDiameter, Math.max(leftDiameter, rightDiameter));
	}

	public static int getHeight(Node root) {
		if (root == null)
			return 0;
		return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Node _root = null;
		int root_i = 0, root_cnt = 0, root_num = 0;
		int isBst = in.nextInt();
		root_cnt = in.nextInt();
		for (root_i = 0; root_i < root_cnt; root_i++) {
			root_num = in.nextInt();
			if (isBst == 0) {
				_root = addRandomElement(_root, root_num, root_i);
			} else {
				_root = insert(_root, root_num);
				System.out.println(_root.data);
			}
		}
		System.out.println(diameterOfTree(_root));
		in.close();
		return;
	}

}
