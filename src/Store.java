import java.util.Scanner;
public class Store {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingrese el numero de productos comprados");
        int numeroProductos=escaner.nextInt();        
        float [] preciosProductos= new float [numeroProductos];
        int [] cantidades= new int [numeroProductos];
        float totalCompra=0;

        for (int j = 0; j < numeroProductos; j++) {
            System.out.println("Ingrese el precio del producto "+(j+1));
            float producto=escaner.nextInt();
            preciosProductos[j]=producto;

            
        }
        for (int i = 0; i<numeroProductos; i++) {
            System.out.println("Ingrese la cantidad el producto "+(i+1));
            int cantidad=escaner.nextInt();
            cantidades[i]=cantidad;

        }
        for (int h = 0; h < cantidades.length; h++) {
            float subtotal=0;
            subtotal=preciosProductos[h]*cantidades[h];
            totalCompra+=subtotal;
        }
        if (totalCompra > 50) {
            System.out.println(totalCompra+" Good sales performance");
        } else {
            System.out.println(totalCompra+" Low sales performance");
        }
    }
}
