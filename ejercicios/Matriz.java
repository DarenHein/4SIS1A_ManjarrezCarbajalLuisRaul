import java.util.Scanner;

public class Matriz{
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);

        int vector [][] , nFilas,ncolum;

        System.out.println(" ingresa el numero de filas ");
        nFilas = entrada.nextInt();
        System.out.println("Ingresen el numero de columnas ");
        ncolum = entrada.nextInt();

        vector = new int [nFilas][ncolum];//importante

        for (int i=0 ; i<nFilas ; i++){
            for(int j=0; j<ncolum; j++ ){
                System.out.print("Ingresa los elementos de la matriz ["+i+"]["+j+"] : " );
                vector[i][j] = entrada.nextInt();
            }
        }

        for(int i=0 ; i<nFilas ; i++){
            for(int j=0; j<ncolum; j++){
                System.out.print(vector[i][j]);
            }
            System.out.println("");
        }
    
    
    }   



        
}