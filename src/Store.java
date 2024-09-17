import java.util.Scanner;
public class Store {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        float [] preciosProductos= new float [3];
        int [] cantidades= new int [3];
        float totalSales = total1 + total2 + total3;
        final int numeroProductos=3;

        for (int j = 0; j < numeroProductos; j++) {
            System.out.println("Ingrese el precio del producto "+j);
            float producto=escaner.nextInt();
            preciosProductos[j-1]=producto;

            
        }
        for (int i = 0; i<numeroProductos; i++) {
            System.out.println("Ingrese la cantidad el producto "+i);
            int cantidad=escaner.nextInt();
            cantidades[i-1]=cantidad;

        }
        for (int h = 0; h < cantidades.length; h++) {
            



        }
        

        if (totalSales > 50) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
