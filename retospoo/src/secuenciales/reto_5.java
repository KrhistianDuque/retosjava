package secuenciales;
import java.util.Scanner;

public class reto_5 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String dato1=leer.nextLine();
        System.out.println("Ingrese su Apellido: ");
        String dato2=leer.nextLine();
        String nombrecompleto =dato1+dato2;
        System.out.println ("total letras nombre : " + dato1.length() + " total letras apellido: " + dato2.length());
        System.out.println("Mayus y Minus: "+dato1.toUpperCase()+" "+dato2.toLowerCase());
        System.out.println("Variable nombrecompleto: "+nombrecompleto);
        String sSubCadena = dato1.substring(0,2);
        System.out.println(sSubCadena+dato2);
        leer.close();
    }
}
