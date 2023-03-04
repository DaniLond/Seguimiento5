public class Node {
    // Enlaces
    private Node right;
    private Node left;

    private String key;

    public Node(String key) {
        this.key = key;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Node getRight() {
        return right;
    }

    public Node getLeft() {
        return left;
    }

    public String getKey() {
        return key;
    }
}
