import java.util.Scanner;
public class TaxCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de productos");
        final int cantidadProductos=3;
        float [] preciosProducts= new float[cantidadProductos];
        float [] tasaProductos =new float[cantidadProductos];
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println("Ingrese el precio del producto"+(i+1));
            float preciosProducto=sc.nextFloat();
            preciosProducts[i]=preciosProducto;

        }
        for (int j= 0; j < cantidadProductos; j++) {
            System.out.println("Ingrese la tasa del producto 1"+(j+1));
            float tasaProducto=sc.nextFloat();
            tasaProductos[j]=tasaProducto;

        }

        float tasa1=preciosProducts[0]+tasaProductos[0];
        float tasa2=preciosProducts[1]+tasaProductos[1];
        float tasa3=preciosProducts[2]+tasaProductos[2];
        float totalTax=tasa1+tasa2+tasa3;
        
        if (totalTax > 50) {
            System.out.println("High total tax: " + totalTax);
        } else {
            System.out.println("Low tax");
        }
    }
}
