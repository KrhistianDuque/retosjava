package secuenciales;
import java.util.Scanner;
import java.util.Random;
public class reto_3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random r = new Random();
        int valorDado = r.nextInt(2)+1;
        System.out.println("ingrese 1 para elegir cara o 2 para elegir sello ");
        System.out.println(valorDado);
        int valorUsuario=leer.nextInt();
        if(valorUsuario == valorDado){
            System.out.println("Gano");
        }
        else{
            System.out.println("Perdio");
        }
        leer.close();
    }
}
