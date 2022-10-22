package secuenciales;
import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int edad,peso;
        System.out.println("Ingrese el numero de meses del bebe");
        edad=leer.nextInt();
        System.out.println("Ingrese el peso del bebe");
        peso=leer.nextInt();
        int dosisvacuna=(peso+10/edad*10)/8;
        System.out.println("Su dosis para la vacuna es de: "+dosisvacuna);
        leer.close();

    }
}
