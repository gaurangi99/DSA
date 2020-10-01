public class Tree {
	int ctr = 0;

	public void preorder(TreeNode root) {
		if (root != null) {
			System.out.println(root.val);
			preorder(root.left);
			preorder(root.right);
		}
	}

	public void inorder(TreeNode root) {
		if (root != null) {
			inorder(root.left);
			System.out.println(root.val);
			inorder(root.right);
		}
	}

	public void postorder(TreeNode root) {
		if (root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.val);
		}
	}

	public void countIter(TreeNode root) {
		if (root != null) {
			ctr++;
			countIter(root.left);
			countIter(root.right);
		}
		System.out.println(ctr);
	}

	public int count(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return 1 + count(root.left) + count(root.right);
	}

	public int max(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return Math.max(root.val, Math.max(max(root.left), max(root.right)));
	}

	public int sum(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return root.val + sum(root.left) + sum(root.right);
	}

	public boolean isLeaf(TreeNode node) {
		if (node == null) {
			return false;
		}
		return node.left == null && node.right == null;
	}

	public int countLeaf(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (isLeaf(root)) {
			return 1;
		}
		return countLeaf(root.left) + countLeaf(root.right);
	}

	public int maxHeight(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			if (isLeaf(root)) {
				return 1;
			} else {
				return 1 + Math.max(maxHeight(root.left), maxHeight(root.right));
			}
		}
	}

	public boolean search(TreeNode root, int val) {
		if (root == null) {
			return false;
		} 
		if (root.val == val) {
			return true;
		}
		return search(root.left,val) || search(root.right,val);
	}
}
