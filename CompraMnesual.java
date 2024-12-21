import java.util.Scanner;
public class CompraMnesual {
    public static void main(String[]javi) { 
        double costo=150;
        double Menudeo=0.60;
        double mes=0;
        double ganV=0;
        int ventas=0;
        Scanner scanner=new Scanner(System.in);
        String comprador;
        int cantidad;
        double pV;
        System.out.println("Ventas Mensuales");
        System.out.println("--------------------------------------------");
        do {
            System.out.print("Ingrese el nombre del comprador: ");
            comprador = scanner.nextLine();
            System.out.print("¿Cuántas sudaderas va a comprar "+comprador+"? ");
            cantidad= scanner.nextInt();
            pV=costo;
            ganV=pV*cantidad; 
           mes=mes+ganV;
            System.out.println("Comprador:"+comprador);
            System.out.println("Cantidad: "+cantidad+"prendas");
            System.out.println("Precio por unidad="+pV);
            System.out.println("Ganancia de la venta="+ganV);
            System.out.println("-------------------------------------------");
            scanner.nextLine(); 
            System.out.print("¿Desea realizar otra vente? (Presione '1' para continuar");
        } while (scanner.nextLine().equals("1"));
        System.out.println("Ganancias Totales del Mes: $" +mes);
    }
}
