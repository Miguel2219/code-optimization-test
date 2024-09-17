import java.util.Scanner;
public class TaxCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de productos");
        int cantidadProductos=sc.nextInt();
        float [] preciosProducts= new float[cantidadProductos];
        float [] tasaProductos =new float[cantidadProductos];
        float tasaTotal=0;
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println("Ingrese el precio del producto "+(i+1));
            float preciosProducto=sc.nextFloat();
            preciosProducts[i]=preciosProducto;

        }
        for (int j= 0; j < cantidadProductos; j++) {
            System.out.println("Ingrese la tasa del producto "+(j+1));
            float tasaProducto=sc.nextFloat();
            tasaProductos[j]=tasaProducto;

        }

        for (int h = 0; h < cantidadProductos; h++) {
            float tasa;
            tasa=preciosProducts[h]*tasaProductos[h];
            tasaTotal+=tasa;

        }
        System.out.println("El total de la tasa es: "+tasaTotal);
        
        if (tasaTotal > 50) {
            System.out.println("High total tax: " + tasaTotal);
        } else {
            System.out.println("Low tax");
        }
    }
}
