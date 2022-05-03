/*
Clase 01
Introducción

JRE 
Es el entorno de ejecución de Java, uno de los elementos de la maquina virtual de
Java. Es obligatorio instalarlo porque Java al ser un lenguaje multiplataforma,
lo cual significa que puede ejecutarse en cualquier sistema operativo, implica que
un programa tiene que ser compilado y luego interpretado. Para interpretarlo se es
necesario del JRE y la maquina virtual de Java

Compilar ¿Qué es?
Compilar es el proceso de transformación o traducción desde un lenguaje digitado
en un lenguaje de programación entendible por un ser humano a código máquina entendido por la máquinas. Este lenguaje máquina o binario son 0 y 1, es decir, aucencia
o precencia de energia. 

Al compilar archivos que solo se ejecutarán en Windows tendrán la extención .exe
Ahora si queremos que sea aplicable otras plataformas habrá que, entonces, a crear
versiones diferentes para cada una de las plataformas dónde queremos que se ejecute.

Programador -> Version 1 -> Ejecutable Windows -> Usuario Windows
            -> Versión 2 -> Ejecutable Linux   -> Usuario Linux
            -> Versión 2 -> Ejecutable Mac     -> Usuario Mac
 
La solución de Java
Cómo dice en artículo ¿Qué es la máquina virtul de Java o Java Virtual Marchine? de CampusMVP.es:

"""

	Para entendernos, la JVM es una abstracción de una máquina real, que es capaz de 
	entender el Byte Code creado por el compilador de Java y traducirlo en instrucciones
	nativas equivalente que a su vez el sistema operativo actual es capaz de entender,
	ejecutando realmente la aplicación.

"""

Esto significa que los sistemas operativos tienen instalado una máquina virtual de Java
en que tiene la finalidad de poder entender el archivo Bytecode (no máquina) generado
por la compilación de los archivos java, independiente de la plataforma. Una vez allí,
se interpreta por la máquina virtual de Java, precisamente con el JRE (entorno de 
ejecución de Java), pudiendo, finalmente, realizar la ejecución de Java en cualquier
sistema operativo, insistiendo, que tenga instalado la JVM.

Conclusión
Por lo tanto, para resumir, lo que diferencia a Java de otros lenguajes es que, al 
compilar no se está generando un código máquina directamente, sino que, se está
compilando a un archivo intermedio llamado bytecode que es entendio por la máquina
virtual de Java instalados en los sistemas operativos. Al suceder esto, la JVM
interpretará el código bytecode a código máquina con el JRE para poder ejecutar
el programa en cualquier plataforma que tenga instalado el JVM y el JRE.

Por último, cabe aclarar que el JDK o el kit de desarrollo de Java llevan consigo un 
conjunto de herramientas para poder trabajar con Java y compilar Java a Bytecode con javac, para
luego con el JRE y la JVM interpetar el código máquina .class y ejecutarlo. 


Codigo fuente  ---->    Bytecode     ------->          código máquina
  
archivos.java  ----> archivos.class  ------->  archivo interpetado en tiempo real

       compilacion javac      interpretacion JVM y JRE
                                 java archivo.class

Por esta razón podemos entender la frase: Con Java compilamos una vez y ejecutamos donde
queramos.

"""

	El secreto del "Write once, write everywhere" es, precisamente, la existencia 
	de la JVM, que es la base de toda la filosofía de la plataforma Java.


"""

Con esto sobre la mesa podemos ilustrar lo siguiente:


Programador -> Única version 1 -> javac compilación -> Bytecode -> JRE -> Usuario Windows
                                                                -> JRE -> Usuario Linux
                                                                -> JRE -> Usuario Mac
Notas adicionales:
Java es neutro respecto a arquitecturas



Fuentes:

¿Qué es la máquina virtual de Java o Java Virtual Marchine? - campusmvp.es
https://www.campusmvp.es/recursos/post/que-es-la-maquina-virtual-de-java-o-java-virtual-machine.aspx

Curso Java, Instalación JRE y Eclipse. Video 2 - Pildoras informáticas
https://www.youtube.com/watch?v=F0ILFYl8YgI&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=2

Curso Java, Introducción. Video 3 - Pildoras informáticas
https://www.youtube.com/watch v=cJEzUxkYurk&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=3
*/
