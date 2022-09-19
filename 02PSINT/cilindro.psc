Funcion volumc()
	definir r, h Como Real;
	p=3.1416;
	definir volumen Como Real;
	escribir "   Volumen de un Cilindro " 
	escribir "Ingresa el radio : " ;
	leer r;
	escribir "Ingresa la altura : ";
	leer h;
	volumen= p*r*r*h;
	escribir "El volumen del cilindro es : " volumen;
	
Fin Funcion

Funcion areac()
	definir r, h Como Real;
	p=3.1416;
	definir area Como Real;
	escribir "   Area de un Cilindro " ; 
	escribir "Ingresa el radio : " ;
	leer r;
	escribir "Ingresa la altura : ";
	leer h;
	area = (2*p*r*r)+(2*p*r*h);
	escribir " el area del cilindro es : " , area "cm2";
Fin Funcion


// area y volumen de un cilindro 
// alumno : luis raul manjarrez carbajal 
Algoritmo cilindro 
	definir op como entero;
	escribir " Hola escoja la opcion deseada" ;
	escribir "1. Area de un cilindro";
	escribir "2. Volumen de un cilindro";
	leer op;
	Segun op Hacer
		caso 1:
			Limpiar Pantalla
			areac();
		caso 2:
			Limpiar Pantalla
			volumc();
		De Otro Modo:
			escribir "opcion invalida" ;
	Fin Segun
	
FinAlgoritmo
