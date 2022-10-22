package secuenciales;
import java.util.Scanner;
import java.util.Random;

public class reto_4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random r = new Random();
        int valorJuego = r.nextInt(3-1)+1;
        System.out.println("Por favor ingrese 1=Tijera - 2=Papel - 3=Piedra");
        int valorUsuario=leer.nextInt();
        System.out.println(valorJuego);
        if(valorJuego == valorUsuario){
            System.out.println("Tuvieron un empate");
        }
        else if(valorJuego == 1 && valorUsuario == 2){
            System.out.println("Perdiste maquina obtuvo tijera vence a papel");
        }
        else if(valorJuego == 1 && valorUsuario == 3){
            System.out.println("Ganaste maquina obtuvo tijera pierde con Piedra");
        }
        else if(valorJuego == 2 && valorUsuario == 1){
            System.out.println("Ganaste maquina obtuvo Papel pierde con Tijera");
        }
        else if(valorJuego == 2 && valorUsuario == 3){
            System.out.println("Perdiste maquina obtuvo papel vence a Piedra");
        }
        else if(valorJuego == 3 && valorUsuario == 1){
            System.out.println("Perdiste maquina obtuvo Piedra vence a Tijera");
        }
        else if(valorJuego == 3 && valorUsuario == 2){
            System.out.println("Ganaste maquina obtuvo Piedra pierde con Papel");
        }
        else{
            System.out.println("Valor invalido");
        }
        leer.close();
    }
}
