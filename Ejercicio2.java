import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        // Array
        int[] nota;
        nota = new int[10];
        
        // Contadores
        int mayorNota = 0, menorNota = 0;
        
        for(int i = 0; i < 10; i++){
            System.out.print("Ingrese la nota[" + (i+1) + "]: ");
            nota[i] = teclado.nextInt();
            if(nota[i] >= 7){
                mayorNota++;
            }
            else {
                menorNota++;
            }
        }
        
        System.out.println("Alumnos con nota 7 o mayor: " + mayorNota);
        System.out.println("Alumnos con nota 6 o menos: " + menorNota);
    }
}
