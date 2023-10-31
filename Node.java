public class Node {

    private int document;
    private String name;
    private Node left;
    private Node right;

    public Node(int document, String name) {
        this.document = document;
        this.name = name;
        this.left = null;
        this.right = null;
    }

    public int getDocument() {
        return document;
    }

    public void setDocument(int document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

}
