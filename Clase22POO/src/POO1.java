/*
Clase22

Programación orientada a objetos 1

A la hora de programar hay dos tipos de lenguajes de 
programación

	1. Antiguos <- orientados a procedimientos
	2. Modernos <- orientados a objeto

	
orientado a procedimientos

	Fortran, Cobol, basic en sus versiones antiguas
	
	desventajas:
	unidades de código muy grandes 
	aplicaciones complejas. Código dificil de decifrar
	Poco reutilizable
	En fallos es muy probable que el código caiga
	Código espagueti <- goto <- saltos entre lineas de código hacia arriba, abajo. Dificil de interpretar por el programador
	Dificil de depurar por otros programadores


orientado a objetos

	Cambio en la forma de pensar e interpretar la progración
	
	Antes los programas eran muy largos y dificil de encontrar
	errores o agregar cosas
	Programas complicados de reutilizar
	
	Intento de simplificar la programación
	Darle al código mismo comportamientos que los objetos de la vida real
	
	Características de los objetos de la vida real
	
	
Trasladar la naturaleza de los objetos de la vida real al código de programación
	
	tienen rasgos o características<- propiedades
	tiene funcionalidades <- comportamiento <- que puede hacer un objeto
	estado
	
	Ejemplo <- coche
	
		estado: parado, circulando, aparcado
		propiedades: rojo, azul, tamaño, peso
		comportamientos: arrancar, frenar, acelerar, girar
	
Ejemplos
	c++, java, visual.net ...

Ventajas
	Programas divididos en trozos, partes, modulos o clases
	modularización
	
	muy reutilizable. Herencia
	Las partes de un objeto puede ser reutilizable en otro
	proyecto <- herencia <- poder reutilizar las partes de un
	objeto en otro.
	
	si existe fallo en alguna linea del código, el programa
	continuará con su funcionamiento. Tratamiento de 
	Excepciones <- si se estropeea una parte de un objeto
	puede repararse mientras el objeto sigue funcionando
	no deja de funcionar de golpe <- los errores se pueden
	controlar
	
	Encapsulamiento
	objetos independientes encapsulados. Tienen relación
	pero funciona por si mismo
	forman un todo y funciona en armonía
	
	
	Modularización
	dividir un programa en diferentes partes independientes
	que se conectan entre sí formando un todo
	Si cometes un error en un módulo es módulo no funcionará
	Pero el resto del programa funcionará
	Es sencillo intentar localizar errores
	
	
	UN PROGRAMA ESCRITO EN JAVA ES UN GRUPO DE CLASES UNIDAS ENTRE SÍ
	PARA QUE EL PROGRAMA FUNCIONE CÓMO UNA UNIDAD .
	
	
VOCABULARIO DE LA POO

	CLASE
	OBJETO
	EJEMPLAR DE CLASE. INSTANCIA DE CLASE. EJEMPLARIZAR UNA CLASE. INSTANCIAR UNA CLASE
	MODULARIZACIÓN
	ENCAPSULAMIENTO / ENCAPSULACIÓN
	HERENCIA
	POLIMORFISMO	


CLASES Y OBJETOS
	
	CLASE
	Es un modelo donde se redactan las características
	comunes de un grupo de objetos
	Cosas comunes en las estructuras en los objetos <- coches
	plataforma
	ruedas
	motor
	...
	A partir de un modelo se pueden crear objetos
	basados en ese modelo
	la clase es un modelo que tienen en común los objetos
	es cómo la forma y el objeto el relleno
	
	clase   obj1   obj2    obj3
	***     |***|  ||***|| |-|***|-|
	
	propiedades o atributos
	comportamientos o acciones
	estado
	
Programar coche <- pseudocódigo

Accediendo a propiedades de objeto desde código (pseudocódigo)
	
	Renault.color = "rojo";
	Renault.peso = 1500;
	Renault.ancho = 2000;
	Renault.alto = 900;
	
Accediendo a comportamientos de objeto desde código (pseudocódigo)

	Renault.arranca();
	Renault.frena();
	Renault.gira();
	Renault.acelera();
	
Con la nomenclatura del punto puedo acceder a propiedades y funciones

	nombre.propiedad=valor;
	nombre.metodo; <- funciones en un objeto o comportamientos en un objeto
	
ASÍ CÓMO UN CONDUCTOR PUEDE DIRIGIR LAS ACCIONES DE UN COCHE,
UN PROGRAMADOR PUEDE PROGRAMAR LAS ACCIONES DE UN PROGRAMA
PARA QUE DE MANERA AUTOMÁTICA SE COMPORTE DEPENDIENDO DE LA
INTERACCIÓN DEL USUARIO CON EL SISTEMA

LA PROGRAMACIÓN ES AUTOMATIZAR ACCIONES EN BASE DE UN LENGUAJE
LÓGICO INDEPENDIENTE A CUALQUIER CAMPO, SON ACCIONES LÓGICAS QUE UNIDAS
DE MANERA MODULAR Y CON UNA INTENCIÓN PODEMOS AUTOMATIZAR UN SISTEMA INFORMÁTICO



*/

/*
Crear un paquete es organizar nuestro código
en carpetas
Sin mayúsculas
Sin espacios en blanco
*/

/*
public class POO1 {

	public static void main(String[] args) {
		
		

	}

}
*/






/*

Fuentes:
Curso Java. POO1. Video 27
https://www.youtube.com/watch?v=XmUz5WJmJVU&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=27
Curso Java. POO2. Video 28
https://www.youtube.com/watch?v=ZY5pwm92cWQ&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=28

*/