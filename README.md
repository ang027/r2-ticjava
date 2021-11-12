# r2-ticjava
practica java

RETO 1
💰 CRIPTOMONEDAS  💰

Carlos, Andrés y Juan son 3 amigos, cuyas transacciones del año se ven reflejadas en el siguiente cronograma: 
Enero: Se anuncia la nueva criptomoneda MisionTicCoin, expertos están a la expectativa de su evolución.
Febrero: Juan se entera de esta nueva criptomoneda, y decide invertir todo su dinero (en dólares).
Marzo: Andrés y Carlos se burlan de Juan por invertir todo su dinero.
Abril: Carlos sospecha que a Juan le irá bien, entonces decide invertir 4 dólares a espaldas de Andrés
Mayo: El conocido empresario Elon Musk menciona a MisionTicCoin en su cuenta de twitter, se espera que se valorice en el mercado.
Junio: Andrés se entera que Carlos invirtió dinero sin decirle, así que para vengarse le raya el carro.  
Julio: Andrés ve a Juan con un apartamento nuevo, así que decide invertir cinco veces lo que invierta Juan.
Agosto: Para pagarle el arreglo del carro, Andrés y Carlos llegan a un acuerdo de que todo lo que invierta Carlos será descontado de lo que invierta Andrés.
Septiembre: Carlos ve a Juan de vacaciones en Europa, así que decide invertir el doble de lo que invierta Andrés
Octubre: Juan cree que es momento de dejar de invertir dólares en esta criptomoneda, así que se retira.
Noviembre: Andrés y Carlos se burlan de Juan por querer dejar de invertir en su mejor momento.
Diciembre: Se anuncia que China ha bloqueado a MisionTicCoin, por lo cual su precio se desploma.
La mamá de Juan está preocupada, así que lo contrata a usted para que diseñe un algoritmo que, dada la cantidad de dólares invertidos por Andrés, calcule en qué categoría de inversión se encuentra su hijo según al siguiente tabla:

Si el dinero invertido está entre 0 y 20 dólares la categoría de inversión es uno
Si el dinero invertido está entre 21 y 30 dólares la categoría de inversión es dos
Si el dinero invertido está entre 31 y 50 dólares la categoría de inversión es tres
Si el dinero invertido es mayor a 50 dólares la categoría de inversión es cuatro
Nota: Tenga en cuenta que solo interesa el valor en dólares, sin contar centavos.

Entrada:
Una línea con el valor invertido por Andrés

Salida:
Una primera línea con la cantidad de dólares invertidos por Andrés, Carlos y  Juan
Una segunda línea con la categoría de inversión de Juan

Ejemplo 1
Entrada               

Salida

5

5 14 3

uno


RETO 2

🎥 MisiónTicFLIX 🎥


Se requiere crear un programa en Java para administrar el nuevo servicio de streaming MisiónTicFlix, el cual va a contar con un catálogo de varias películas y series siguiendo estas especificaciones:

Para todos los productos del catálogo se desea guardar el nombre, el género, el año de lanzamiento y el rating (un número decimal de 1 a 10)
Para las películas se debe guardar adicionalmente la duración en minutos de esta.
Para las series se debe guardar adicionalmente el número de temporadas que tiene.


Funcionalidades:

El programa debe leer diversos comandos, por consola, para ejecutar una de las 3 funcionalidades:

agregarProducto():

Se puede añadir un producto de tipo película al catálogo con el comando "1" enviando los datos de la siguiente forma:

    1&Película&nombre&género&año_lanzamiento&rating&duración

Se puede añadir un producto de tipo serie al catálogo con el comando "1" enviando los datos de la siguiente forma:

    1&Serie&nombre&género&año_lanzamiento&rating&temporadas


listarProductos():

Con el comando “2” se debe mostrar la frase : “***Catálogo MisiónTicFLIX***” seguida con todos los productos en el orden en el que fueron agregados.

Si el producto es una canción se debe mostrar como se indica en el siguiente ejemplo:

\tPelícula - nombre: El Laberinto del Fauno
\tgénero: Fantasía
\taño: 2006
\trating: 7.3
\tduración: 120

Si el producto es una serie se debe mostrar como se indica en el siguiente ejemplo:

\tSerie - nombre: Mr Robot
\tgénero: Drama
\taño: 2015
\trating: 9.2
\ttemporadas: 4


Recuerde que \t representa una tabulación.


salir

Con el comando “3” la ejecución del programa debe acabar.

RETO 3

Se desea crear una tienda virtual de virus informáticos en Java. En donde se tenga un catálogo de virus para poder ser vendidos o intercambiados. 


Información importante:

Cada virus se identificara con un ID (un número)
Todos los virus tienen su propia categoría (troyano, adware, gusano, spyware o ransomware)
Para saber la categoría del virus se debe acceder(con el ID del virus) a la posición en  el listado de categorías. 

