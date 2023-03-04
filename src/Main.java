import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los nombres");
        String names = scanner.nextLine();
        String[] array = names.split(" ");

        ArrayList<String> alist = new ArrayList<>();
        Collections.addAll(alist, array);

        BST bst= new BST();
        bst.arbolBST(alist);
        bst.inOrder();
        System.out.println("La profundida es: " + bst.profundida());
    }
}