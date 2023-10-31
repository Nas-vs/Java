import java.util.Scanner;

public class BinarySearchTree {

	private static int numeroid;
	private static String nombreequipo;
	private Node root;
	
	public static void main(String[] args) {
		
		BinarySearchTree arboldatos = new BinarySearchTree();
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Ingrese el nombre del equipo : ");
	    String nombre = sc.nextLine();
	    
		
		System.out.println("Ingrese el id del equipo : ");
		int idequipo = sc.nextInt();
		
		System.out.println("El nombre del equipo es: " + nombre);
		System.out.println("El nombre del equipo es: " + idequipo);
		
		arboldatos.insert(new Node(idequipo,nombre));
		
		
		
	   }
	
    public BinarySearchTree() {
        this.setRoot(null);
    }
    
    public void insert(int idequipo, String nombre) {
        Node newNode = new Node(idequipo, nombre);
        insert(newNode);
    }
    

	private void insert(Node newNode) {
		// TODO Auto-generated method stub
		
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	

	public int getNumeroid() {
		return getNumeroid();
	}

	public void setNumeroid(int numeroid) {
		BinarySearchTree.numeroid = numeroid;
	}

	public String getNombreequipo() {
		return getNombreequipo();
	}

	public void setNombreequipo(String nombreequipo) {
		BinarySearchTree.nombreequipo = nombreequipo;
	}
	

	
}
