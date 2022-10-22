package Ejercicio_clase;
import java.util.Scanner;

public class For_1 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int referencia=0,subtotal=0,total=0;
        for(int i=1;i<=5;i++){
            System.out.println("Ingrese la cantidad del producto");
            int cantidad=leer.nextInt();
            System.out.println("Ingrese el precio del producto");
            int precio=leer.nextInt();
            subtotal=cantidad*precio;
            referencia=referencia+1;
            total=total+subtotal;
            System.out.println("La cantidad del producto es de "+cantidad+" su precio es "+precio+" TOTAL: "+total);
            
        }
        System.out.println("Por favor ingrese el billete con el que pagara");
        int cambio=leer.nextInt();
        int vueltas = cambio - total;
        leer.nextLine();///limpieza de buffer
        System.out.println("Cuenta con un telefonia movil exito");
        String deci=leer.nextLine();
        if(deci.equals("s")){
            System.out.println("La cantidad de minutos por su compra es de "+ referencia);
        }
        System.out.println("el total de su compra es de: "+total);
        System.out.println("Su cambio es de "+vueltas);
        leer.close();
    }
}
