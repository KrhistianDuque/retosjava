package Ejercicio_clase;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        final double PI=3.1416;
        double radio,area;
        radio=leer.nextDouble();
        area=PI*radio*radio;
        System.out.println("El area del radio "+radio+"Su area es "+area);
        leer.close();
    }
}
 