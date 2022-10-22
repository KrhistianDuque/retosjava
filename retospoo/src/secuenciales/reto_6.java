package secuenciales;
import java.util.Scanner;
import java.util.Random;
public class reto_6 {
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    int acumulador=0;
    int cambio;
    System.out.println("Desea registrar un producto? s para Si");
    String seguir=leer.nextLine();
    while(seguir.equalsIgnoreCase("s")){
        System.out.println("Por favor ingrese el precio del producto");
        int dato1=leer.nextInt();
        System.out.println("Por favor ingrese la cantidad del producto");
        int dato2=leer.nextInt();
        acumulador=(dato1 * dato2)+acumulador;
        System.out.println("Compra total es de: "+acumulador);
        System.out.println("Desea registrar otro producto? s para Si o otra tecla para No.");
        leer.nextLine();
        seguir=leer.nextLine();
    }
    Random r = new Random();
    int valorbolita = r.nextInt(4-1)+1;
    if(acumulador>=50000){
        System.out.println("Tu compra ha sido mayor a los 50.000 aplica el juego de la bolita");
            if(valorbolita == 1){
                System.out.println("Se genero la bolita azul 30%");
                System.out.println("Su compra total es de:"+(acumulador*0.30));
                System.out.println("Ingrese el valor por el cual va a pagar");
                cambio=leer.nextInt();
                System.out.println("Su cambio es de: "+(acumulador-cambio));
            }
            else if(valorbolita == 2){
                System.out.println("Se genero la bolita blanca (gratis)");
                System.out.println("Su compra es gratis");
            }
            else if(valorbolita == 3){
                System.out.println("Se genero la bolita roja 10%");
                System.out.println("Su compra total es de:"+(acumulador*0.10));
                System.out.println("Ingrese el valor por el cual va a pagar");
                cambio=leer.nextInt();
                System.out.println("Su cambio es de: "+(acumulador-cambio));
                
            }
            else if(valorbolita == 4){
                System.out.println("Se genero la bolita amarillo  50%");
                System.out.println("Su compra total es de:"+(acumulador*0.50));
                System.out.println("Ingrese el valor por el cual va a pagar");
                cambio=leer.nextInt();
                System.out.println("Su cambio es de: "+(acumulador-cambio));
                
            }
    }
    else{
        System.out.println("No aplica compra mayor a 50000");
        System.out.println("Ingrese el valor por el cual va a pagar");
        cambio=leer.nextInt();
        System.out.println("Su cambio es de: "+(acumulador-cambio));
    }
    leer.close();
    }
}
