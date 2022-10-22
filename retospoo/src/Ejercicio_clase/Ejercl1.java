package Ejercicio_clase;
import java.util.Scanner;
public class Ejercl1 {
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    int presu = 100000;
    int des=0;
    String seguir ="s";
    for(int i=0;i>4;i++){
         while (seguir.equalsIgnoreCase("s")){
            System.out.println("Desea ingresar un gasto presione s");
            String deci=leer.nextLine();
             if(deci.equalsIgnoreCase("s")){
                System.out.println("Ingrese el valor del gasto");
                
                des=leer.nextInt();
                des=des-presu;
            }
        System.out.println("Su valor del gasto fue: "+des+" Su saldo total es de: "+presu);
        System.out.println("Desea registrar otro gasto presione S");
        deci=leer.nextLine();
        }
      }
      System.out.println("El presupuesto total fue: "+presu);
      leer.close();
    }
}