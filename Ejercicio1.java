import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        int numero1, numero2;
        
        System.out.print("Ingrese el primer número: ");
        numero1 = teclado.nextInt();
        System.out.print("Ingrese el segundo número: ");
        numero2 = teclado.nextInt();
        
        if(numero1 % numero2 == 0){
            System.out.println("Los números son divisibles entre sí.");
        } else {
            System.out.println("Los números no son divisibles entre sí.");
        }
    }
}
