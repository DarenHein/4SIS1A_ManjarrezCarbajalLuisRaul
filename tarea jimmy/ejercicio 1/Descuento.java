//EL PROGRAMA DEBE SOLICITAR LA EDAD DEL USUARIO. SI ÉSTA ES MAYOR DE 65, AL PRECIO DEL ABONO SE LE APLICA UN DESCUENTO DEL 40%. SI LA EDAD ES MENOR QUE 21, SE PREGUNTA AL USUARIO SI SUS PADRES SON SOCIOS. SI LA RESPUESTA ES AFIRMATIVA, 
//SE LES APLICA UN DESCUENTO DEL 45%; EN CASO CONTRARIO, SE LES APLICA UN 25%. 
// alumno : Luis raul Manjarrez carbajal 
import java.util.Scanner; 
public class Descuento{
   public static void main(String args[]){
    
    String sexo; 
    int op; 
    int op2; 
    int edad;
    String nombre; 
    do{
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Hola Digita tu nombre : "); 
        nombre = entrada.nextLine();  
        System.out.println("Digita tu edad : "); 
        edad = entrada.nextInt(); 
    
    if (edad>65){
        
        System.out.println("Hola "+ nombre + "\nEdad : " + edad);
        System.out.println(nombre +" Su descuento es del %40 ");  
    }
    if(edad<21){
        System.out.println("hola " + nombre + "\nEdad : " + edad); 
        System.out.println("Tus padres son socios ?"); 
        System.out.println("1 si"); 
        System.out.println("2 no");
        System.out.println(nombre + "Digita tu opcion : "); 
        op = entrada.nextInt(); 
        switch(op){
            case 1 :
            System.out.print(nombre + "El descuento es de : %45");  
            break; 
            case 2:
            System.out.println(nombre + "El descuento es de : %25");  
            break; 
            default :
            System.out.println("Opcion Invalida ");  
            break; 
        }
    }
    System.out.println("\nDeseas repetir la operacion ?");
    System.out.println("1 si "); 
    System.out.println("2 no "); 
    System.out.println("Digita tu opcion : "); 
    op2 = entrada.nextInt(); 

    }while(op2!=2); 
   }
}