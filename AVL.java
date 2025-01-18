
class AVLNode {
    int value;
    AVLNode left, right;
    int height;

    public AVLNode(int value) {
        this.value = value;
        this.left = this.right = null;
        this.height = 1;
    }
}
public class AVLTree {
    private AVLNode root;
    private int height(AVLNode node) {
        return (node == null) ? 0 : node.height;
    }
    private int getBalance(AVLNode node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }
    private AVLNode rightRotate(AVLNode y) {
        AVLNode x = y.left;
        AVLNode T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        return x;
    }
    private AVLNode leftRotate(AVLNode x) {
        AVLNode y = x.right;
        AVLNode T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        return y;
    }
    private AVLNode leftRightRotate(AVLNode node) {
        node.left = leftRotate(node.left);
        return rightRotate(node);
    }
    private AVLNode rightLeftRotate(AVLNode node) {
        node.right = rightRotate(node.right);
        return leftRotate(node);
    }
    public AVLNode deleteNode(AVLNode root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.value) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.value) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null || root.right == null) {
                AVLNode temp = (root.left != null) ? root.left : root.right;
                root = temp;
            } else {
                AVLNode temp = minValueNode(root.right);
                root.value = temp.value;
                root.right = deleteNode(root.right, temp.value);
            }
        }

        if (root == null) {
            return root;
        }
        root.height = 1 + Math.max(height(root.left), height(root.right));
        int balance = getBalance(root);
        if (balance > 1 && getBalance(root.left) >= 0) {
            return rightRotate(root);
        }
        if (balance < -1 && getBalance(root.right) <= 0) {
            return leftRotate(root);
        }
        if (balance > 1 && getBalance(root.left) < 0) {
            return leftRightRotate(root);
        }
        if (balance < -1 && getBalance(root.right) > 0) {
            return rightLeftRotate(root);
        }
        return root;
    }
    private AVLNode minValueNode(AVLNode node) {
        AVLNode current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }
    public void inorderTraversal(AVLNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.value + " ");
            inorderTraversal(root.right);
        }
    }

    e (int key) {
        root = deleteNode(root, key);
    }
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        tree.root = tree.deleteNode(tree.root, 50);
        tree.root = tree.deleteNode(tree.root, 30);
        tree.root = tree.deleteNode(tree.root, 20);
        tree.root = tree.deleteNode(tree.root, 40);
        tree.root = tree.deleteNode(tree.root, 70);
        tree.root = tree.deleteNode(tree.root, 60);
        tree.root = tree.deleteNode(tree.root, 80);
        System.out.println("Inorder traversal of the AVL tree after deletion:");
        tree.inorderTraversal(tree.root);
    }
}
