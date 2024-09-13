import java.util.Scanner;
public class Store {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        float [] preciosProductos= new float [3];
        int [] cantidades= new int [3];
        final int numeroProductos=3;

        for (int j = 1; j <= numeroProductos; j++) {
            System.out.println("Ingrese el precio del producto "+j);
            float producto=escaner.nextInt();
            preciosProductos[j-1]=producto;

            
        }
        for (int i = 1; i<=numeroProductos; i++) {
            System.out.println("Ingrese la cantidad el producto "+i);
            int cantidad=escaner.nextInt();
            cantidades[i-1]=cantidad;

        }
    
        float total1 = (preciosProductos[0])*cantidades[0];
        float total2 = (preciosProductos[1])*cantidades[1];
        float total3 = (preciosProductos[2]*cantidades[2]);
        float totalSales = total1 + total2 + total3;

        if (totalSales > 50) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
