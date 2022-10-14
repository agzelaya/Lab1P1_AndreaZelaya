package lab1_andreazelaya;
import java.util.Scanner;

public class Lab1_AndreaZelaya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("_ Bienvenido al sistema de calculo de promedio _");
        System.out.print("Ingrese su nombre: ");// se ingresa el nombre del usuario
        String nombre = leer.nextLine();
        
        // Se ingresan las notas de cuatro clases
        System.out.print("Ingrese la nota final de la primera clase: ");
        double primeraClase = leer.nextDouble();
        
        System.out.print("Ingrese la nota final de la segunda clase: ");
        double segundaClase = leer.nextDouble();
        
        System.out.print("Ingrese la nota final de la tercera clase: ");
        double terceraClase = leer.nextDouble();
        
        System.out.print("Ingrese la nota final de la cuarta clase: ");
        double cuartaClase = leer.nextDouble();
        
        // se calcula el promedio
        double sumaClase = primeraClase + segundaClase + terceraClase + cuartaClase;
        double promedio = sumaClase / 4;
        
        //se imprime el calculo del promedio
        System.out.println("_ " + nombre + " el promedio de las cuatro clases es: " + promedio);
               
                
    }
    
}
