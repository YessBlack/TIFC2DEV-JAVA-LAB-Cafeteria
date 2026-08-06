# Práctica de Java - Sistema de Caja Registradora

Este proyecto es una práctica de programación en Java que implementa un sistema de caja registradora. A través de una serie de ejercicios, se cubren los conceptos fundamentales del lenguaje como variables, tipos de datos, operadores, estructuras de control (if-else, switch, while, do-while, for) y arrays.

## Estructura del Proyecto

- `Main.java` - Contiene los ejercicios 1 al 6 sobre conceptos básicos de Java
- `CajaRegistradora.java` - Ejercicio 7 de debugging
- `Parte2_SistemaTurno.java` - Implementación completa de un sistema de turno con procesamiento de pedidos, validación de inventario y reportes

## Ejercicios Desarrollados

### Ejercicio 1 — Variables y tipos de dato

Pregunta: ¿Por qué usas double para el precio y no int? ¿Qué pasaría si declaras el precio como int y le asignas 3.50?

Uso double para el precio porque la guía indica que debe ser un decimal. Puedo usar double o float, pero de manera estándar para ser más precisos uso double. Con float tengo 7 dígitos, por tanto si tengo precios con muchos dígitos decimales puedo perder precisión. Double (15-16 dígitos) tiene mucho más margen.

### Ejercicio 2 — Operadores

Pregunta: ¿Qué operador usaste para determinar si aplica el descuento? ¿Qué tipo de dato devuelve ese operador?

Se usó el operador mayor que (`>`) para evaluar si el subtotal es mayor que 30000 y esta comparación devuelve un tipo de dato boolean.

### Ejercicio 3 — switch

Pregunta: ¿En qué situación preferirías usar switch en lugar de una cadena de if-else? ¿Hay algún caso en este ejercicio donde el switch no sería la mejor opción?

Prefiero usar switch cuando evaluo una sola variable sin comparaciones, solo opciones o casos concretos donde conozco las opciones, por ejemplo la categoría del producto (B, F, C, P). Mientras que el if-else lo usaría cuando tengo condiciones de este tipo `subtotal > 30000`, o cuando necesito combinar varias condiciones a la vez, cosas así es bueno el if-else.

En este ejercicio, si por ejemplo nos pidieran aplicar un descuento cuando el precio del producto sea mayor a $10.000, ahí el switch no serviría, porque eso ya es una comparación de rango y no una igualdad exacta como la categoría, entonces tocaría usar if-else.

### Ejercicio 4 — while

Pregunta: ¿Qué ocurre si la condición del while nunca se vuelve falsa? ¿Cómo lo prevendrías en este caso?

Si la condición del while nunca se vuelve falsa nunca logra salir del bucle y se vuelve un bucle infinito. En este caso prevendría el bucle infinito asegurándome que la condición en algún punto se vuelva false. En este caso, deberíamos refrescar la variable del inventario para que decremente hasta que no cumpla la condición inicial.

### Ejercicio 5 — do-while

Pregunta: ¿Por qué do-while es más apropiado que while aquí? Describe con tus palabras la diferencia en el orden de ejecución.

Es más apropiado porque necesitamos ejecutar al menos una vez el ingreso del monto, debe solicitarse una vez. Con while debemos cumplir la condición antes de entrar, por eso, por la naturaleza de este ejercicio, es mejor do-while. Con do-while, pedimos el monto, luego validamos y decidimos si entramos en bucle o no para solicitarlo otra vez en caso de no ser válido el valor. Con while, para hacer que funcione, deberíamos pedir primero el monto y luego hacer el while para iniciarlo.

### Ejercicio 6 — for y arrays

Pregunta: ¿Por qué usas for aquí y no while? ¿Qué tiene el for que lo hace más conveniente cuando conoces el número de elementos?

Uso for aquí porque es lo más natural. While no proporciona por ejemplo el índice para acceder a las posiciones del arreglo, debería hacerlo manual. Mientras que for sí lo provee y es más controlado que si lo hago manual, puedo generar más errores.

### Ejercicio 7 — Debugging

Pregunta: ¿Cuántos errores encontraste? Clasifica cada uno: ¿es un error de compilación o un error lógico? ¿Cómo los distingues?

Veo 3 errores:
1. `int cantidadVendida = "5";` - Error de compilación, asignamos un string a una variable de tipo entero
2. `double total = cantidadVendida * precioUnitario` - Error de compilación, falta un punto y coma al final de la sentencia
3. `if (aplicaDescuento = true)` - Error lógico, no estamos comparando, estamos asignando porque usamos un solo igual

La manera más fácil de verlos es porque el IDE te ayuda a verlos, sin embargo, también con la herramienta de debugging puedes verlo.

## Cómo Ejecutar el Proyecto

Para ejecutar los ejercicios, puedes compilar y ejecutar cada archivo Java individualmente:

```bash
# Ejecutar los ejercicios 1-6
javac Main.java
java Main

# Ejecutar el ejercicio de debugging
javac CajaRegistradora.java
java CajaRegistradora

# Ejecutar el sistema de turno completo
javac Parte2_SistemaTurno.java
java Parte2_SistemaTurno
```

O puedes ejecutarlo directamente desde tu IDE favorito (IntelliJ IDEA, Eclipse, NetBeans, etc.)
