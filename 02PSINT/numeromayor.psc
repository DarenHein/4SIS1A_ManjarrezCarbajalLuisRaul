//Desarrolle un algoritmo que permita leer tres valores y almacenarlos en las variables A, B y C respectivamente. 
//El algoritmo debe imprimir cual es el mayor y cuál es el menor. Recuerde constatar que los tres valores introducidos por el teclado sean valores distintos. 
//Presente un mensaje de alerta en caso de que se detecte la introducción de valores iguales. 
// que el usuario digite 3 numeros cuardados en memoria y diga cual es el mayor y si todos son iguales 
//alumno : luis raul manjarrez carbajal 
Algoritmo numeromayor
	definir a,b,c como enteros 
	
	escribir "Ingresa un numero"; 
	leer a;
	escribir "Ingresa un numero"; 
	leer b; 
	escribir "Ingresa un numero "; 
	leer c
	
	si (a>b) o (a>c) Entonces
		escribir  "El numero mayor es :",a; 
	FinSi
	si (b>a) o (b>c) Entonces
		escribir "El numero mayor es :" ,b;
		
	FinSi
	si (c>a) o (c>b) Entonces
		escribir "El numero mayor es :" ,c; 
		
	FinSi
	si (a=b) y (a=c) Entonces
		escribir "Los numeros son iguales : ", a ", ",b ", ",c; 
	FinSi
	
FinAlgoritmo