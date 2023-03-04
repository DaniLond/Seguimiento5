import java.util.ArrayList;

public class BST {
    private Node root;


    public void construirBst( ArrayList<String> array){
        int indexCentral=0;
        String elemCentral= "";
        if(array.size() == 1 ){
            Node node= new Node(array.get(0));
            add(node);
            return;
        }
        ArrayList<String> arrayDerecho= new ArrayList<String>();
        ArrayList<String> arrayIzquierdo= new ArrayList<String>();

        if (array.size() % 2 == 0) {
            indexCentral = ((int) array.size() / 2) - 1;
        } else {
            indexCentral= (int) array.size()/2;
        }

        elemCentral= array.get(indexCentral);
        Node node= new Node(elemCentral);
        add(node);

        for (int i=0; i < array.size()/2; i++){
            arrayIzquierdo.add(array.get(i));
        }
        for (int i= indexCentral+1; i < array.size(); i++ ){
            arrayDerecho.add(array.get(i));
        }

        construirBst(arrayDerecho);
        construirBst(arrayIzquierdo);

    }


    public void arbolBST(ArrayList<String> array){
        int indexCentral=0;
        String elemCentral= "";
        ArrayList<String> arrayDerecho= new ArrayList<String>();
        ArrayList<String> arrayIzquierdo= new ArrayList<String>();

        if (array.size() % 2 == 0) {
            indexCentral = ((int) array.size() / 2) - 1;
        } else {
            indexCentral= (int) array.size()/2;
        }

        elemCentral= array.get(indexCentral);
        Node node= new Node(elemCentral);
        add(node);

        for (int i=0; i < indexCentral; i++){
            arrayIzquierdo.add(array.get(i));
        }
        for (int i= indexCentral+1; i < array.size(); i++ ){
            arrayDerecho.add(array.get(i));
        }

        construirBst(arrayDerecho);
        construirBst(arrayIzquierdo);
    }



    public void add(Node node) {
        if (root == null) {
            root = node;
        } else {
            add(root , node);
        }
    }

    private void add(Node current, Node node){
        // Ejemplo A comparado con S da negativo
        if(node.getKey().compareTo(current.getKey()) < 0){
            // meter a la izquierda
            if (current.getLeft() == null){
                current.setLeft(node);
            }else{
                add(current.getLeft(), node);
            }
        }else if (node.getKey().compareTo(current.getKey()) > 0){
            // meter a la derecha
            if (current.getRight() == null){
                current.setRight(node);
            }else {
                add(current.getRight() , node);
            }
        }else {
            //No hacer nada (si son iguales)
        }
    }


    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node current){
        if (current== null){
            return;
        }
        inOrder(current.getRight());
        System.out.println(current.getKey());
        inOrder(current.getLeft());
    }
}
