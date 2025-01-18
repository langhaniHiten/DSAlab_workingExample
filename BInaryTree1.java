
import java.util.LinkedList;
import java.util.Queue;
class BinaryTree1{
    static class TreeNode {
        int data;
        TreeNode left, right;
        TreeNode(int item) {
            data = item;
            left = right = null;
        }
    }
    TreeNode root;
    boolean isFullTree(TreeNode node) {
        if (node ==null) {
            return true;
        }
        if (node.left ==null && node.right ==null) {
            return true;
        }
        if (node.left !=null && node.right !=null) {
            return isFullTree(node.left) && isFullTree(node.right);
        }
        return false;
    }
    boolean isCompleteTree(TreeNode node) {
        if (node == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        boolean isLeaf = false;
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current.left != null) {
                if (isLeaf) {
                    return false;
                }
                queue.add(current.left);
            } else {
                isLeaf = true;
            }
            if (current.right != null) {
                if (isLeaf) {
                    return false;
                }
                queue.add(current.right);
            } else {
                isLeaf = true;
            }
        }
        return true;
    }
    boolean isBothFullAndComplete() {
        return isFullTree(root) && isCompleteTree(root);
    }
    public static void main(String[] args) {
        BinaryTree1 tree = new BinaryTree1();
        tree.root = new TreeNode(9);
        tree.root.left = new TreeNode(0);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(3);
        tree.root.right.left = new TreeNode(2);
        System.out.println("Is the tree a Full Tree"+tree.isFullTree(tree.root));
        System.out.println("Is the tree a Complete Tree"+tree.isCompleteTree(tree.root));
        System.out.println("Is the tree both Full and Complete"+tree.isBothFullAndComplete());
    }
}
