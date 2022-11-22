import java.util.Scanner;

public class cajero {
    Scanner sc = new Scanner(System.in);
    //ATRIBUTOS DE MI CAJERO
    String nombre_titular;
    String num_cta;
    String num_ced;
    double SaldoBanco;

    // constructor de la clase cajero
    public cajero() {
        nombre_titular = "Roberto Shiao";
        num_ced = "1751361245";
        num_cta = "226485465";
        SaldoBanco = 0;
    }

    // meotodo para mostrar menu del cajero
    public int mostrarMenu(cajero cj) {
        int opcion;
        System.out.println("\t\t=====  COOPERATIVA EPN =======");
        System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
        System.out.println("| 1 - CONSULTA\t\t\t 2 - RETIRO");
        System.out.println("| 3 - DEPOSITO");
        System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
        System.out.print("\n Seleccione una opcion  (1- 4): ");
        opcion = sc.nextInt();
        return opcion;
    }

    //metodo para depositar
    public void depositar() {
        double cant;
        System.out.print("Cantidad a depositar: ");
        cant = sc.nextDouble();
        Double EnBanco = SaldoBanco + cant;
        setSaldoBanco(EnBanco);
        System.out.println("Su saldo: " + getSaldoBanco());
    }

    //metodo para retirar
    public void retirar() {
        double cant;
        System.out.print("Cantidad a retirar: ");
        cant = sc.nextDouble();
        if (cant < SaldoBanco) {
            Double EnBanco = SaldoBanco - cant;
            setSaldoBanco(EnBanco);
            System.out.println("Su saldo: " + getSaldoBanco());
        } else {
            System.out.println("Su saldo es insuficiente");
        }
    }

    //setters y getters de los atributoss
    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getNombre_titular() {
        return nombre_titular;
    }

    public void setNombre_titular(String nombre_titular) {
        this.nombre_titular = nombre_titular;
    }

    public String getNum_cta() {
        return num_cta;
    }

    public void setNum_cta(String num_cta) {
        this.num_cta = num_cta;
    }

    public String getNum_ced() {
        return num_ced;
    }

    public void setNum_ced(String num_ced) {
        this.num_ced = num_ced;
    }

    public double getSaldoBanco() {
        return SaldoBanco;
    }

    public void setSaldoBanco(double saldoBanco) {
        SaldoBanco = saldoBanco;
    }
}
