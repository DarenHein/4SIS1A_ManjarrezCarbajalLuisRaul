//elabora un programa que realice el area y perimetro de un 
// rectabgulo el perimetro y area de un triangulo 
// el volumen de un esfera y el volumen de un cilindro 
//alumno : luis raul manjarrez carbajal 
import java.util.Scanner; 
public class Area{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in); 
        int op; 
        int op2; 
        int op3; 
        int op4; 
        int area;
        int perimetro; 
        int b;
        int h; 
        do{
            System.out.println("\t\t MENU PRINCIPAL "); 
            System.out.println("\nLee las opciones y escoje la de tu agrado : "); 
            System.out.println(" 1 rectangulo"); 
            System.out.println(" 2 Triangulo "); 
            System.out.println(" 3 Esfera"); 
            System.out.println(" 4 Cilindro"); 
            System.out.println("Digita su opcion : "); 
            op2 = entrada.nextInt(); 
            switch(op2){
                case 1:
                System.out.println("\t\t RECTANGULO"); 
                System.out.println("\n Lee las opciones y escoje la de tu agrado : "); 
                System.out.println("1 area"); 
                System.out.println("2 perimetro"); 
                System.out.println("Digite su opcion : "); 
                op3 = entrada.nextInt(); 
                switch(op3){
                    case 1 :
                    System.out.println("\t\t AREA DE UN RECTANGULO"); 
                    System.out.println("\n Ingresa la altura"); 
                    h = entrada.nextInt(); 
                    System.out.println("Ingresa la base : ");
                    b = entrada.nextInt(); 
                    area = b * h; 
                    System.out.println("El area del rectangulo es : " + area);   
                    break; 
                    case 2:
                    System.out.println("\t\t PERIMETRO DE UN RECTANGULO "); 
                    System.out.println("Ingresa base "); 
                    b = entrada.nextDouble(); 
                    System.out.println("Ingresa el altura : "); 
                    h = entrada.nextDouble(); 
                    perimetro = 2 * (b+h); 
                    System.out.println(" El perimetro del rectangulo es : " + perimetro ); 
                    break; 
                    default:
                    System.out.println("opcion invalida"); 
                    break; 
                } // aqui nos quedamos 
                break; 
                case 2 :
                System.out.println("\t\tTRIANGULO");
                System.out.println("lee las opciones y escoje la de tu agrado : "); 
                System.out.println("1 area "); 
                System.out.println("2 perimetro"); 
                System.out.println("Digita tu opcion : "); 
                op4 = entrada.nextInt(); 
                switch(op4){
                    case 1 :
                    System.out.println("\t\tAREA DE UN TRIANGULO "); 
                    System.out.println("Ingresa la base  "); 
                    b = entrada.nextDouble(); 
                    System.out.println("Ingresa la altura"); 
                    h = entrada.nextDouble(); 
                    area = ((b * h)/2); 
                    System.out.println("el area del triangulo es : " + area);  
                    break; 
                    case 2 :
                    System.out.println("PERIMETRO DE UN TRIANGULO ");
                    System.out.println("");  

                    break;  

                }


                break; 
            }
            System.out.println("Desea regresar al menu principal ?"); 
            System.out.println(" 1 si "); 
            System.out.println(" 2 no "); 
            System.out.println("Digite su opcion : " ); 
            op = entrada.nextInt(); // para repetir el menu principal 

        }while(op != 2); 

    }
}