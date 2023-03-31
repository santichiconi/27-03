package pkg27.pkg03;
import java.util.Scanner
/**
 *
 * @author chuPac
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = leer.nextLine();

        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();
        System.out.println("Tu nombre es: " + nombre + " y tu edad es de: " + edad + " años");
}
}
   
            
    

