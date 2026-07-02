# Problema 1 - Escaleras (Programación Dinámica)
 

## Descripción



Este proyecto resuelve el problema de las escaleras utilizando Programación Dinámica.
El objetivo es calcular cuántas formas diferentes existen para llegar exactamente al escalón \*\*N\*\*, considerando que en cada movimiento solo se puede avanzar:


- 1 escalón

- 2 escalones



Además, el programa muestra la tabla DP generada durante la ejecución.



## Lenguaje



- Java


## Cómo ejecutar


#1. Compilar el programa:



bash

javac EscalerasDP.java



#2. Ejecutar el programa:



bash

java EscalerasDP


# 3. Ingresar el número de escalones cuando el programa lo solicite.

## Ejemplo



#Entrada
 
 5


#Salida

 Formas posibles: 8

Tabla DP:
[1, 1, 2, 3, 5, 8]




# Problema 2 - Cambio mínimo de monedas (Programación Dinámica)


## Descripción



Este proyecto resuelve el problema del cambio mínimo de monedas utilizando Programación Dinámica.

Dado un conjunto de monedas y una cantidad objetivo, el programa determina:


- La cantidad mínima de monedas necesarias.

- Una combinación válida de monedas.

- La tabla DP generada durante la ejecución.



## Cómo ejecutar



1. Compilar el programa:


bash

javac CambioMonedasDP.java




#2. Ejecutar el programa:



bash

java CambioMonedasDP




#3. Ingresar:

- La cantidad de tipos de monedas.

- Las denominaciones de las monedas.

- La cantidad objetivo.



## Ejemplo



### Entrada




Cantidad de tipos de monedas: 3

Ingrese las monedas:

1 3 4

Cantidad objetivo: 6




### Salida




Cantidad mínima de monedas: 2

Combinación: 3 + 3

Tabla DP:

[0, 1, 2, 1, 1, 2, 2]





## Autor



- Karlo Ayala

 

