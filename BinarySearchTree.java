
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class BinarySearchTree {

    TreeNode root;

    BinarySearchTree() {
        root = null;
    }

    // insertion

    void insert(int data) {
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }
        if (root.data > data) {
            root.left = insertRec(root.left, data);
        } else {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    // deletion

    // view

    void inOrder() {
        inOrderRec(root);
    }

    void inOrderRec(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderRec(root.left);
        System.out.print(root.data + " --> ");
        inOrderRec(root.right);
    }

    public static void main(String[] args) {
        BinarySearchTree obj = new BinarySearchTree();

        obj.insert(5);
        obj.insert(3);
        obj.insert(1);
        obj.insert(4);
        obj.insert(7);
        obj.insert(6);
        obj.insert(8);
        obj.inOrder();
    }
}
