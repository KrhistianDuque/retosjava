package secuenciales;
import java.util.Scanner;
import java.util.Random;
public class reto_7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random r = new Random();
        int contador=0;
        int apost=0;
        int gano=0;
        String seguir="s";
        int valorDado = r.nextInt(2)+1;
        System.out.println("Ingresar valor global");
        int global=leer.nextInt();

        while(seguir.equalsIgnoreCase("s")){
        System.out.println("Apuesta por jugada");
        apost=leer.nextInt();

        System.out.println("ingrese 1 para elegir cara o 2 para elegir sello ");
        int valorUsuario=leer.nextInt();
        if(valorUsuario == valorDado){
            System.out.println("Gano");
            gano=gano+apost;
            global=global+apost;
            System.out.println("Valor ganado: "+apost+" global: "+(global));
        }
        else{
            System.out.println("Perdio");
            global=global-apost;
            System.out.println("Valor ganado: "+apost+" global: "+(global));
        }
        contador=contador+1;
        System.out.println("Desea seguir jugando?");
        leer.nextLine();
        seguir=leer.nextLine();
    }
    System.out.println("Veces Jugadas: "+contador);
    System.out.println("Valor ganado: "+gano);
    System.out.println("Valor total: "+(global));

    leer.close();

    }

}
