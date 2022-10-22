package Ejercicio_clase;
import java.util.Scanner;
import java.lang.Math;
public class calculadora {
    public static void main(String[] args) {
        int op,num1,num2,total;
        Scanner leer=new Scanner(System.in);
        String usuario;
        String contraseña;
        System.out.println("Por favor ingrese el usuario" );
        usuario=leer.nextLine();
        System.out.println("Por favor ingrese la contraseña" );
        contraseña=leer.nextLine();

        if((usuario == "j") && contraseña == "1" || (usuario == "tcabrera") && (contraseña == "qwerty2022"))
        {
        System.out.println("Menu opciones \n 1.Suma \n 2.Resta \n 3.Multiplicacion \n 4.Division \n 5.Raiz Cuadrada \n 6.Potencia \n Ingrese el numero de la opcion a realizar");
        op=leer.nextInt();
        System.out.println("Ingrese el valor del numero1");
        num1=leer.nextInt();
        System.out.println("Ingrese el valor del numero1");
        num2=leer.nextInt();
        switch(op){
            case 1:
            total=num1+num2;
            System.out.println("El valor de la suma es "+ total);
            break;
            case 2:
            total=num1-num2;
            System.out.println("El valor de la resta es "+ total);
            break;
            case 3:
            total=num1*num2;
            System.out.println("El valor de la multiplicacion es "+ total);
            break;
            case 4:
            total=num1/num2;
            System.out.println("El valor de la division es "+ total);
            break;
            case 5:
            double resultado = Math.sqrt(num1);
            double resultado2 = Math.sqrt(num2);
            System.out.println("La raíz cuadrada de " + num1 + " es " + resultado);
            System.out.println("La raíz cuadrada de " + num2 + " es " + resultado2); 
            break;
            case 6:
            double result = Math.pow(num1,num2);
            System.out.println("La potencia es "+ result); 
            break;
        }
        }
    else if((usuario.equalsIgnoreCase("jfajardo")) && (contraseña != "12345678#") || (usuario == "tcabrera") && (contraseña != "qwerty2022")){
        System.out.println("Tu contraseña no es correcta");
    }
    else if((usuario != "jfajardo") && (contraseña == "12345678#") || (usuario != "tcabrera") && (contraseña != "qwerty2022")){
       System.out.println("Usuario no existe, no esta registrado");
    }
    else if((usuario != "jfajardo") && (contraseña != "12345678#") || (usuario != "tcabrera") && (contraseña != "qwerty2022")){
       System.out.println("Credenciales accesos incorrectos");
    }
        leer.close();
    }
}
