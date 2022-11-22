import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //obejeto cajero
        cajero cj = new cajero();
        String op;
        int casos;
        do {
            casos = cj.mostrarMenu(cj);
            switch (casos) {
                case 1:
                    System.out.println("\t\tCuenta de ahorros EPN");
                    System.out.println("\nNombre del titular: " + cj.getNombre_titular());
                    System.out.println("Numero de cedeula del titutar: " + cj.getNum_ced());
                    System.out.println("Numero de cuenta: " + cj.getNum_cta());
                    System.out.println("---------------------------------------");
                    System.out.println("TOTAL EN LA CUENTA: " + cj.getSaldoBanco());
                    break;
                case 2:
                    System.out.println("\t\t R E T I R O S");
                    cj.retirar();
                    break;
                case 3:
                    cj.depositar();
                    break;
                default:
                    System.out.println("°° OPCION NO EXISTENTE EN EL ATM °°");

            }
            System.out.print("\nDeseas continuar en la opciones del ATM?? (s/n):");
            op = sc.next().toLowerCase();
        } while (op.equals("s"));

    }
}

