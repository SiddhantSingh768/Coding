import java.util.Comparator;
class Mirror{
static class node{
	int val;
	node left;
	node right;
}
static node createNode(int val){
	node newNode = new node();
	newNode.val = val;
	newNode.left = null;
	newNode.right = null;
	return newNode;
}
static void preorder(node root){
	if (root == null){
		return;
	}
	System.out.print(root.val + " ");
	preorder(root.left);
	preorder(root.right);
}

// mirrorify function takes two trees,original tree and a mirror tree It recurses on both the trees, but when original tree recurses on left,
// mirror tree recurses on right and vice-versa
static node mirrorify(node root){
	if (root == null){
		return null;
	}
	// Create new mirror node from original tree node
	node mirror = createNode(root.val);
	mirror.right = mirrorify(root.left);
	mirror.left = mirrorify(root.right);
	return mirror;
}
public static void main(String args[]){
	node tree = createNode(8);
	tree.left = createNode(5);
	tree.right = createNode(10);
	tree.left.left = createNode(3);
	tree.left.right = createNode(6);
	tree.right.right = createNode(11);
	// Print inorder traversal of the input tree
	System.out.print("Inorder of original tree: ");
	preorder(tree);
	node mirror = null;
	mirror = mirrorify(tree);
	// Print inorder traversal of the mirror tree
	System.out.print("\nInorder of mirror tree: ");
	preorder(mirror);
}
}

