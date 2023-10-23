import java.util.*;
class Node {
	int data;
	Node left, right;

	Node(int x)
	{
		data = x;
		left = right = null;
	}
}
class Main {
	static Node insert(Node root, int x)
	{
		if (root == null)
			return new Node(x);
		if (x < root.data)
			root.left = insert(root.left, x);
		else if (x > root.data)
			root.right = insert(root.right, x);
		return root;
	}
	static int countPairs(Node root1, Node root2, int x)
	{
		Set<Integer> set = new Hashset<>();
		Stack<Node> stack = new Stack<>();
		Node curr = root2;

		while (curr != null || !stack.empty()) {
			while (curr != null) {
				stack.push(curr);
				curr = curr.left;
			}

			curr = stack.pop();
			set.add(curr.data);
			curr = curr.right;
		}
		int count = 0;
		curr = root1;

		while (curr != null || !stack.empty()) {
			while (curr != null) {
				stack.push(curr);
				curr = curr.left;
			}
			curr = stack.pop();
			if (set.contains(x - curr.data))
				count++;
			curr = curr.right;
		}
		return count;
	}
	public static void main(String[] args)
	{
		Node root1 = null, root2 = null;
		root1 = insert(root1, 5);
		root1 = insert(root1, 3);
		root1 = insert(root1, 7);
		root1 = insert(root1, 2);
		root1 = insert(root1, 4);
		root1 = insert(root1, 6);
		root1 = insert(root1, 8);

		root2 = insert(root2, 10);
		root2 = insert(root2, 6);
		root2 = insert(root2, 15);
		root2 = insert(root2, 3);
		root2 = insert(root2, 8);
		root2 = insert(root2, 11);
		root2 = insert(root2, 18);
		int x = 16;
		int count = countPairs(root1, root2, x);
		System.out.println("Count of pairs with sum " + x
						+ " is " + count);
	}
}
