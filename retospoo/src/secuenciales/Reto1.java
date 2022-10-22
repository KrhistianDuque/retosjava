package secuenciales;
import java.util.Scanner;
public class Reto1 {    
    public static void main(String[] args) {
    System.out.println("Por favor ingrese los grados Fahrenheit (°F)");
    double temperatura,resul;
    Scanner leer=new Scanner(System.in);
    temperatura=leer.nextInt();
    resul=(temperatura-32)/1.8;
    System.out.println("La temperatura  (grados Centígrados) es "+resul);
    leer.close();
    }
}
