# Beverages pricing refactoring kata

## Objetivo
Este proyecto calcula los precios de las bebidas ofrecidas en nuestra cafetería.

Quisiéramos que añadieras un suplemento opcional de canela a todo el catálogo existente de bebidas.
Este suplemento tendra un precio de 0.05€. 


## Consejo / Pista
Quizá quieras refactorizar el código primero.

## Proyectos base

El repositorio contiene dos proyectos base sobre los que se puede realizar la kata (uno en Java y otro en .NET Core con C#).
Además se proporcionan otras plantillas en otros lenguajes. Animamos a quien quiera colaborar con una plantilla que no dude en hacerlo.

### .NET Core

El proyecto esta realizado en .NET Core 2.2, por lo que necesitarás tener instalado el SDK correspondiente ([descarga](https://dotnet.microsoft.com/download)). No obstante, puedes usar otra versión de .NET Core si lo deseas.

La solución consta de dos proyectos:
 - `Beverages`: proyecto de libreria con las clases principales.
 - `Beverages.Tests`: proyecto con test unitarios sobre las clases del proyecto `Beverages`. Para los test se utiliza xUnit.


Para ejecutar los test, basta con ejecutar en consola el comando `dotnet test` en la ruta de la solución.

La solución se puede abrir con los IDE habituales.


### Java

El proyecto esta realizado en Java 1.8 ([descarga](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)) con Maven ([descarga](https://maven.apache.org/download.cgi)), por lo que necesitarás tener instalada la versión de Java correspondiente y Maven en tu equipo.

El proyecto consta de dos paquetes:
- `Package beverages`: contiene las clases principales.

- `Package unit_tests`: contiene los test unitarios sobre las clases del paquete anterior. Para los test se utiliza JUnit.

Para ejecutar los test, basta con ejecutar en consola el comando `mvn test` en la ruta donde se ubica el fichero `pom.xml`.

El proyecto se puede abrir con los IDE habituales.


### Otros lenguajes

Existen plantillas proporcionadas por colaboradores en otro lenguajes como Scala, con las que también podeís realizar la kata.
No dudeis en abrir una PR si quereis contribuir con plantillas en otros lenguajes.

## Soluciones

En el repositorio hemos habilitado una carpeta `solutions` en las que podeís aportar vuestras soluciones que hayáis implementado en la kata y asi compartir y discutir diferentes aproximaciones/soluciones.

Cualquiera puede clonar el repositorio, crear una nueva carpeta con su solución dentro de la carpeta correspondiente (`dotnet-core`, `java`, `scala` u otra si os atreveis con otro lenguaje 😜) y posteriormente abrir una PR contra este repositorio. Os animamos a subir vuestra solución o comentar las soluciones de otros.

***Nota**: es importante que cada solución este en una carpeta nueva y con un nombre no existente todavía.*
