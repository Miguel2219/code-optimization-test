import java.util.Scanner; //se llama a la funcion de escaner de la libreria de java
public class AgeValidation {
    public static void main(String[] args) {
        Scanner escaner=new Scanner(System.in);
        System.err.println("Enter Age");
        int age = escaner.nextInt();
        final int age_limit=18;
        
        if (age >= age_limit) {
            System.out.println("Access granted");
        }else {
            System.out.println("Access denied");
        }
        
    }
}
    
