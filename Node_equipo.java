
public class Node {
	
	private int idequipo;
    private String nombre;
    private Node left;
    private Node right;
    
    public Node(int idequipo, String nombre) {
        this.setIdequipo(idequipo);
        this.setNombre(nombre);
        this.setLeft(null);
        this.setRight(null);
    }

	public int getIdequipo() {
		return idequipo;
	}

	public void setIdequipo(int idequipo) {
		this.idequipo = idequipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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



