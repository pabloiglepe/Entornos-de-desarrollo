# Entornos-de-desarrollo
Ejercicio UD02.5. Proyecto Maven - Eclipse

1. En primer lugar lo que he hecho es instalar Maven en mi equipo y añadirlo a las variables de entorno y al path. Luego de eso me he asegurado que funcionaba ejecutando el comando: `mvn --version`


2. Para el ejercicio 2, antes de crear el proyecto Maven, he resuelto el cómo hacer la sucesión de Fibonacci en java. En mi caso he utilizado recursividad.
	- Una vez resuelto el algortimo, he creado el proyecto en Maven siguiendo las reglas de nombrado dadas. En mi caso lo he creado por terminal usando el comando:
			`mvn archetype:generate -DgroupId=es.iessoterohernandez.daw.endes -DartifactId=fibonacci -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.5 -DinteractiveMode=false`
		- Luego de crear el proyecto he desarrollado el código fuente en la clase Fibonacci.java que se encuentra dentro del src/main/java.

	- Una vez he desarrollado el código fuente, por terminal le he indicado la ruta del proyecto fibonacci: `cd C:\Users\trendingpc\Desktop\WP_Entorno\fibonacci` y he generado el artefacto de salida: `mvn package`.

3. Para el ejercicio 3:
	-Para instalar el proyecto con la clase Fibonacci en el repositorio local, en primer luegar me he colocado sobre el proyecto con la clase Fibonacci: `cd C:\Users\trendingpc\Desktop\WP_Entorno\fibonacci` y después de eso, lo he instalado ejecutando el comando: `mvn install`.

 	-Para crear el nuevo proyecto llamado fibonacciMain, he ejecutado el siguiente comando por terminal siguiendo las reglas de nombrado dadas: `mvn archetype:generate -DgroupId=es.iessoterohernandez.daw.endes -DartifactId=fibonacciMain -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.5 -DinteractiveMode=false`, luego de eso, para utilizar el artefacto de la clase fibonacci, he agregado la dependencia del proyecto fibonacci al proyecto fibonacciMain, para ello he abierto el archivo pom.xml del proyecto fibonacciMain y copiado lo siguiente:

```xml
<dependencies>
   	<dependency>
		<groupId>es.iessoterohernandez.daw.endes</groupId>
		<artifactId>fibonacci</artifactId>
		<version>1.0-SNAPSHOT</version>
	</dependency>
...
</dependencies>
```

   -Una vez añadida la dependencia al pom.xml de fibonacciMain, he utilizado el código fuennte de fibonacci en fibonacciMain para resolvver el ejercicio.

4. Lo que he hecho en primer lugar es informarme sobre como se utiliza la librería iText y sobre cómo se implementaría en un proyecto maven. he aprendido gracias a un video de YouTube (he usado la versión 5 de dicha librería para realizar el programa): `https://www.youtube.com/watch?v=PO4mwNzpwJA&ab_channel=DiscoDurodeRoer`.
   
-Para crear un nuevo proyecto llamado HelloWorldPdf, he ejecutado el siguiente comando por terminal siguienndo las reglas de nombrado dadas: `mvn archetype:generate -DgroupId=es.iessoterohernandez.daw.endes -DartifactId=fibonacciMain -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.5 -DinteractiveMode=false`. Después de crear el proyecto, he copiado las dependencias de la librería iText que he sacado de su página oficial:
```xml
<dependencies>
	<dependency>
		<groupId>com.itextpdf</groupId>
		<artifactId>itextpdf</artifactId>
		<version>5.5.13.4</version>
	</dependency>
...
</dependencies>
```
-Una vez añadida la librería, he desarrollado el código fuente.
	-Luego de eso, he compilado el código: `mvn compile`, he construido el proyecto (gennerado el artefacto): `mvn package` y lo he ejecuado para crear el archivo pdf.



   



