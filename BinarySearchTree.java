import java.util.ArrayList;

public class BinarySearchTree {

    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int document, String name) {
        Node newNode = new Node(document, name);
        insert(newNode);
    }

    private void insert(Node newNode) {
        if (root == null) {
            root = newNode;
        } else {
            Node currentNode = root;
            while (true) {
                if (newNode.getDocument() < currentNode.getDocument()) {
                    if (currentNode.getLeft() == null) {
                        currentNode.setLeft(newNode);
                        break;
                    } else {
                        currentNode = currentNode.getLeft();
                    }
                } else {
                    if (currentNode.getRight() == null) {
                        currentNode.setRight(newNode);
                        break;
                    } else {
                        currentNode = currentNode.getRight();
                    }
                }
            }
        }
    }

    public void InOrder() {
        InOrder(root);
    }

    private void InOrder(Node node) {
        if (node != null) {
            InOrder(node.getLeft());
            System.out.println("Documento: " + node.getDocument() + ", Nombre: " + node.getName());
            InOrder(node.getRight());
        }
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Insertar datos en el árbol de búsqueda binaria
        bst.insert(7170, "Nasly Valencia");
        bst.insert(8021, "Jeniffer Rodriguez");
        bst.insert(5210, "Luis Ramirez");

        // Recorrer el árbol de búsqueda binaria en orden
        bst. InOrder();
    }
}
