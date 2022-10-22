package Ejercicio_clase;
import java.util.Scanner;
public class Notas {
    public static void main(String[] args) {
        int cont=1;
        float nota=0;
        Scanner leer=new Scanner(System.in);
        for(int i=1;i<=4;i++){

            System.out.println("Por favor ingrese la nota numero: "+cont);
            nota=leer.nextFloat();
            nota=nota+nota/4;
            cont=cont+1;    
        }
        if(nota>=0.0 && nota<=2.9){

            System.out.println(nota+" Reprobaste la asignatura");
        }
        else if(nota>=3.0 && nota<=4.0){
            System.out.println(nota+" Pasaste raspando la asignatura");
        }
        else if(nota>4.0){
            System.out.println(nota+" Aprobaste con buenos resultados");
        }
        leer.close();
    }
}
