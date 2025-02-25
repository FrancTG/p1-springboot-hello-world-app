# Ejercicio 1: Introducción a Spring Boot
Ejercicio introductorio al uso de Spring Boot
<br>

* **Editor:**
Franc Tauste González<br>
* **Docker:**
https://hub.docker.com/repository/docker/franctg/spring-boot-demoapp
<br>

* **GitHub:**
https://github.com/FrancTG/p1-springboot-hello-world-app
<br>

## Cambiando el nombre en el HomeController

En el primer ejercicio del apartado **5. Changing the App**, se nos pide que en el **Root Controller** cambiemos el nombre que aparece de Juan por el nuestro.
<br>
Si nos dirigimos a la carpeta **/Controller** encontraremos que el Root Controller es la clase **HomeController** porque podemos encontrar el mensaje que estamos buscando.
<br>
Así pues, sustituimos el nombre de Juan por el nuestro en el String que devuelve la función. 


## Implementaciones

Para realizar las implementaciones creamos un nuevo Controlador y Servicio llamados **DemoController** y **DemoService**, además, para mostrar los resultados añadiremos una página con un formulario para rellenar las implementaciones y otra página para mostrar la solución.

### 1. Palabras palíndromas 

Para saber si una palabra es palíndroma, realizamos un bucle que recorra
la mitad de la palabra (N = Tamaño palabra / 2) carácter por carácter y recorremos
esta palabra tanto desde la primera letra hasta el centro como la última letra hasta el centro
al mismo tiempo y vamos coparando ambas letras, si algúna no coincide no es palíndroma.

### 2. Números pares

Si queremos comprobar si un número es **par** podremos hacer uso del simbolo **%**,
que nos permite conocer el resto de una división. En este caso **si el resto de una
división entre 2 es 0 quiere decir que este número es par**.

### 3. Raíz cuadrada

La raíz cuadrada en Java se puede obtener importando la librería de **Math**, que 
incluye multiples funciones matemáticas pero la función que nos interesa se llama
**Math.sqrt()**, que espera el valor con el que calculará la raíz cuadrada y nos 
devuelve el resultado que podemos comprobar para saber si es correcto.

### 4. Calculadora

En este caso es una calculadora sencilla que calcula una serie de números y operaciones en linea, sin paréntesis ni operaciones complejas.

Para realizar esta función primero **eliminamos todos los espacios en blanco** del String. Luego, **recorremos el String en un bucle para buscar el primero numéro** de la operación hasta encontrar un simbolo de operación (+, -, *, /), lo que nos indicará el final del primer número. El primer número lo guardamos en una variable llamada **result** que usaremos para realizar las operaciones que se encuentran.

Ahora este siguiente proceso lo haremos en **otro bucle hasta el final del string**, lo que permite el uso de varias operaciones en linea.

**Guardamos el último simbolo de operación** encontrado para realizar la operación posteriormente, **buscamos el siguiente número** hasta que aparezca otro simbolo de operación (o final del string), que nos indica el final de ese número y **realizamos la operación**.