package Ejercicio_clase;
import java.util.Scanner;
public class per {
    public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
        int contm=0,conth=0,nop=0;
        for(int i=1;i<=10;i++){
            System.out.println("Presione H para Hombre o M para Mujer");
            String se=Leer.nextLine();
            if(se.equalsIgnoreCase("h")){
                conth=conth+1;
            }
            else if(se.equalsIgnoreCase("m")){
                contm=contm+1;
            }
            else{
             System.out.println("DATO No permitido");
             nop=nop+1;
            }
            System.out.println("Mujeres: "+contm+" Hombre: "+conth);
        }
        System.out.println("El total fue Hombres: "+conth+" Mujeres: "+contm+" No validos: "+nop);
    
        Leer.close();
    }
    
}
