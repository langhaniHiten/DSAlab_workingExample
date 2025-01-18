
class ChildrenSumProperty{
    static class TreeNode {
        int data;
        TreeNode left, right;
        TreeNode(int item) {
            data = item;
            left = right = null;
        }
    }
    TreeNode root;
    boolean checkChildrenSumProperty(TreeNode node){
        if (node == null) {
            return true;
        }
        if (node.left == null && node.right == null) {
            return true;
        }
        int leftData = (node.left !=null) ? node.left.data : 0;
        int rightData = (node.right !=null) ? node.right.data : 0;
        if (node.data !=leftData +rightData) {
            return false;
        }
        return checkChildrenSumProperty(node.left) && checkChildrenSumProperty(node.right);
    }
    public static void main(String[] args) {
        ChildrenSumProperty tree = new ChildrenSumProperty();
        tree.root = new TreeNode(10);
        tree.root.left = new TreeNode(4);
        tree.root.right = new TreeNode(6);
        tree.root.left.left = new TreeNode(2);
        tree.root.left.right = new TreeNode(2);
        tree.root.right.left = new TreeNode(3);
        tree.root.right.right = new TreeNode(3);
        System.out.println("Does the tree satisfy the children sum property"
                + tree.checkChildrenSumProperty(tree.root));
        tree.root = new TreeNode(16);
        tree.root.left = new TreeNode(3);
        tree.root.right = new TreeNode(4);
        System.out.println("Does the tree satisfy the children sum property"
                + tree.checkChildrenSumProperty(tree.root));
    }
}
