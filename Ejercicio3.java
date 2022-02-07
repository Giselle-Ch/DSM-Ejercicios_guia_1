import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        // Contadores
        int contPar = 0, contImpar = 0;
        
        do{
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = teclado.nextInt();
            
            if(numero % 2 == 0){
                contPar++;
            }
            else {
                contImpar++;
            }
        }while(numero != 0);
        
        System.out.println("Cantidad de números pares: " + contPar);
        System.out.println("Cantidad de números impares: " + contImpar);
    }
}
