class BinaryTree {
    static class TreeNode {
        int data;
        TreeNode left, right;
        TreeNode(int item) {
            data = item;
            left = right = null;
        }
    }
    TreeNode root;
    int calculateHeight(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            int leftHeight = calculateHeight(node.left);
            int rightHeight = calculateHeight(node.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
    int getHeight() {
        return calculateHeight(root);
    }
    public static void main(String[] args) {
        BinaryTree tree1 = new BinaryTree();
        tree1.root = new TreeNode(2);
        tree1.root.left = new TreeNode(3);
        tree1.root.right = new TreeNode(4);
        tree1.root.left.left = new TreeNode(5);
        tree1.root.left.right = new TreeNode(6);
        System.out.println("Height of the binary tree is: " +tree1.getHeight());
    }
}
