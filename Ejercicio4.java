import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        int cantidad;
        int coorX, coorY;
        String[] coordenadasTotal;
        //Contadores
       int cuadrante1, cuadrante2, cuadrante3, cuadrante4;
       cuadrante1 = 0;
       cuadrante2 = 0;
       cuadrante3 = 0;
       cuadrante4 = 0;
        
        System.out.print("Cantidad de coordenadas: ");
        cantidad = teclado.nextInt();
        
        coordenadasTotal = new String[cantidad];
        
        for(int i = 0; i < cantidad; i++)
        {
            System.out.print("[" + (i+1) + "] Ingrese coordenada X: ");
            coorX = teclado.nextInt();
            System.out.print("[" + (i+1) + "] Ingrese coordenada Y: ");
            coorY = teclado.nextInt();
            
            if(coorY >= 0){
                if(coorX >= 0){
                    cuadrante1++;
                } else{
                    cuadrante2++;
                }
            } else if(coorY < 0) {
                if(coorX >= 0){
                    cuadrante4++;
                } else {
                    cuadrante3++;
                }
            }
            
            coordenadasTotal[i] = "{" + coorX + ", " + coorY + "}";
        }
        System.out.println("---- Resultdos ----");
        
        System.out.println("Coordenadas ingresadas:");
        for(int i = 0; i < cantidad; i++)
        {
            System.out.print(coordenadasTotal[i] + " ");
        }
        System.out.println("\nCoordenadas en cuadrante I: " + cuadrante1);
        System.out.println("Coordenadas en cuadrante II: " + cuadrante2);
        System.out.println("Coordenadas en cuadrante III: " + cuadrante3);
        System.out.println("Coordenadas en cuadrante IV: " + cuadrante4);
        
                
    }
}
