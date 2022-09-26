//ELABORA UN PROGRAMA QUE CONVIERTA TEMPERATURA EN GRADOS 
//FAHRENHEIT, EN GRADOS CELSIUS, KELVINE Y RANKINE. .
//( SE PODRÁ ELEGIR QUE CONVERSIÓN DESEA REALIZAR)
//alumno : luis raul manjarrez carbajal 
import java.util.Scanner;
public class Temperatura{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in); 
        int op;
        int op2;
        int op3;  
        int op4; 
        int op5;  
        int op6; 
        double c; 
        double f; 
        double k; 
        double r; 
         do{
            System.out.println("\t\tCONVERTIDOR"); 
        System.out.println("\nLee las opciones y escoje la de tu agrado :");
        System.out.println("1 Celsius"); 
        System.out.println("2 Fahrenheit");
        System.out.println("3 Kelvin"); 
        System.out.println("4 Rankin"); 
        op = entrada.nextInt(); 
        switch(op){
            case 1:
            System.out.println("\t\t CELSIUS"); 
            System.out.println("\nLee las opciones y elije la de tu agrado : "); 
            System.out.println(" 1 Celsius a Fahrenit"); 
            System.out.println(" 2 Celsius a Kelvin"); 
            System.out.println(" 3 Celsius a Rankin"); 
            System.out.println(" Digita tu opcion : ");
            op2 = entrada.nextInt(); 
            switch(op2){
                case 1 :
                System.out.println("\t\t CELSIUS A FAHRENHEIT"); 
                System.out.println("Ingresa los grados Celsius : "); 
                c = entrada.nextDouble(); 
                f = (1.8 * c) + 32;
                System.out.println("Los grados celsius " + c + " a Farenheit son " + f);  
                break; 
                case 2:
                System.out.println("\t\t CELSIUS A KELVIN"); 
                System.out.println("Ingresa los grados en Celsius : "); 
                c = entrada.nextDouble(); 
                k = c + 273.15; 
                System.out.println("Los grados Celsius " + c + "a Kelvin son : " + k); 
                break; 
                case 3:
                System.out.println("\t\t CELSIUS A RANKIN"); 
                System.out.println("Ingresa los grados en Celsius : "); 
                c = entrada.nextDouble(); 
                r = (1.8 * c)+ 491.67;  
                System.out.println("Los grados Celsius " + c +" a Rankin son : " +r);  
                break; 
                default:
                System.out.println("opcion invalida");
                break; 
            } 
            break;

            case 2 : 
            System.out.println("\t\t FAHRENHEIT"); 
            System.out.println("Lee las opciones y escoje la de tu agrado : "); 
            System.out.println(" 1 Fahrenheit a Celsius"); 
            System.out.println(" 2 Fahrenheit a Kelvin "); 
            System.out.println(" 3 Fahrenheir a Rankin"); 
            System.out.println(" Digite su opcion : "); 
            op3 = entrada.nextInt(); 
            switch(op3){
                case 1 :
                System.out.println("\t\t FAHRENHEINT A CELSIUS"); 
                System.out.println("Ingresa los grados en Fahrenheit : "); 
                f = entrada.nextDouble();
                c = (f-32)/1.8;
                System.out.println("Los grados Fahrenheit " + f + " a Celsius es : "+ c );   
                break; 
                case 2 :
                System.out.println("\t\t FAHRENHEIT A KELVIN ");
                System.out.println("Ingresa los grados en Fahrenheit : ");
                f = entrada.nextDouble(); 
                k = (((f - 32)/1.8)+273.15); 
                System.out.println("Los grados Fahrentheit " +f+ " a Kelvin son : " +k); 
                break;
                case 3:
                System.out.println("\t\t FAHRENHEIT A RANKIN"); 
                System.out.println("Ingresa los grados en Fahrenheint : "); 
                f = entrada.nextDouble(); 
                r = (f + 459.67);
                System.out.println("Los grados Fahrenheit "+f+" a Rankin son : "+r);   
                break;  
                default:
                System.out.println("opcion invalida"); 
                break; 
            }
            break; 
            case 3: 
            System.out.println("\t\t KELVIN"); 
            System.out.println("Lee las opciones y escoje la de tu agrado : "); 
            System.out.println(" 1 Kelvin a Celsius "); 
            System.out.println(" 2 Kelvin a Fahrenheit "); 
            System.out.println(" 3 Kelvin a Rankin"); 
            System.out.println(" Digita tu opcion "); 
            op4 = entrada.nextInt(); 
            switch(op4){
                case 1:
                System.out.println("\t\t KELVIN A CELSIUS"); 
                System.out.println("Ingresa los grados en Kelvin :"); 
                k = entrada.nextDouble(); 
                c = k-273.15; 
                System.out.println("Los grados kelvin : "+ k+ " a Celsius : "+ c);  
                break; 
                case 2:
                System.out.println("\t\t KELVIN A FAHRENHEIT"); 
                System.out.println("Ingresa los datos en Kelvin : "); 
                k = entrada.nextDouble();  
                f = (((k-273.15)*1.8)+32); 
                System.out.println("Los grados Kelvin : " + k + " a Fahrenhein son : " +f); 
                break; 
                case 3:
                System.out.println("\t\tKELVIN A RANKIN");
                System.out.println("Ingresa los datos en kelvin : "); 
                k = entrada.nextDouble(); 
                r = 3*k; 
                System.out.println("Los grados Kelvin " + k + " a Rankin son : " + r );   
                break; 
                default:
                System.out.println("Opcion invalida ");  
                break;
            }
            break; 
            case 4 :
            System.out.println("\t\t RANKIN"); 
            System.out.println("Lee las opciones y escoje la de tu agrado : "); 
            System.out.println("1 Rankin a Celsius "); 
            System.out.println("2 Rankin a Fahrenhein"); 
            System.out.println("3 Rankin a kelvin "); 
            op5 = entrada.nextInt(); 
            switch(op5){
                case 1 :
                System.out.println("\t\tRANKIN A CELCIUS"); 
                System.out.println("Ingresa los datos en Rankin : "); 
                r = entrada.nextDouble(); 
                c = 0.55*( r - 491.67); 
                System.out.println("Los grados en Rankin : "+ r + " a Celcius son : "+c);  
                break; 
                case 2 :
                System.out.println("\t\tRANKIN A FAHRNHEIN"); 
                System.out.println("Ingresa los datos en Rankin : "); 
                r = entrada.nextDouble(); 
                f = r - 459.67; 
                System.out.println("Los datos en Rankin " + r + "a Fahrenhein son : "+ r ); 
                break; 
                case 3 :
                System.out.println("\t\tRANKIN A KELVIN"); 
                System.out.println("Ingresa los datos en Rankin : "); 
                r = entrada.nextDouble(); 
                k = 0.55*r; 
                System.out.println("Los datos Rankin : " + r + " a kelvin son " +k);  
                break; 
                default:
                System.out.println("opcion invalida");  
                break; 
            }
            break; 
            default: 
            System.out.println("opcion invalida"); 
            break;
           

        }
        System.out.println("Desea volver a repetir la operacion ?"); 
        System.out.println("1 si"); 
        System.out.println("2 no"); 
        op6 = entrada.nextInt(); 
        }while(op6!=2); 
    }
} 