# Entornos-de-desarrollo
Ejercicio UD02.5. Proyecto Maven - Eclipse

1. En primer lugar lo que he hecho es instalar Maven en mi equipo y añadirlo a las variables de entorno y al path. Luego de eso me he asegurado que funcionaba ejecutando el comando: `mvn --version`


2. Para el ejercicio 2, antes de crear el proyecto Maven, he resuelto el cómo hacer la sucesión de Fibonacci en java. En mi caso he utilizado recursividad.
	- Una vez resuelto el algortimo, he procedido a crear el proyecto en Maven siguiendo las reglas de nombrado dadas en el enunciado. En mi caso lo he creado por terminal usando el comando:
			`mvn archetype:generate -DgroupId=es.iessoterohernandez.daw.endes -DartifactId=fibonacci -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.5 -DinteractiveMode=false`
		- Luego de crear el proyecto he desarrollado el código fuente en la clase Fibonacci.java que se encuentra dentro del src/main/java.

	- Una vez he desarrollado el código fuente, por terminal le he indicado la ruta del proyecto fibonacci: `cd C:\Users\trendingpc\Desktop\WP_Entorno\fibonacci`, he generado el artefacto de salida: `mvn package`.

3. Para el ejercicio 3:
	-Para instalar el proyecto con la clase Fibonacci en el repositorio local, en primer luegar me he colocado sobre el proyecto con la clase Fibonacci: `cd C:\Users\trendingpc\Desktop\WP_Entorno\fibonacci` y después de eso, lo he instalado ejecutando el comando: `mvn install`.

 	-Para crearr el nuevo proyecto llamado fibonacciMain, he ejecutado el siguiente comando: `mvn archetype:generate -DgroupId=es.iessoterohernandez.daw.endes -DartifactId=fibonacciMain -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.5 -DinteractiveMode=false`, luego de eso, para utilizar el artefacto de la clase fibonacci, hay que agregar la dependencia del proyecto fibonacci al proyecto fibonacciMain, para ello abrimos el archivo pom.xml y copiamos lo siguiente:

```xml
   <dependency>
<groupId>es.iessoterohernandez.daw.endes</groupId>
<artifactId>fibonacci</artifactId>
<version>1.0-SNAPSHOT</version>
</dependency>
...
<7dependencies>
```
   



