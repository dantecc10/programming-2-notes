# Temperatura.java

El archivo `Temperatura.java` define una clase para convertir temperaturas entre Celsius y Fahrenheit.
La clase imprime un menú que solicita una temperatura con su escala, y devuelve la temperatura convertida a la escala contraria, es decir de Celsius a Fahrenheit y viceversa.
La temperatura `999` permite salir del programa.

## Constructor

### `Temperatura()`

El constructor público `Temperatura()` genera el menú dentro del que se controla el programa.

Dentro hay un bucle `while`, que sigue los siguientes pasos:
1. Lee la entrada del usuario con un objeto `input` de la clase `Scanner`.
2. Entra a otro bucle `while` anidado.
3. Verifica si la entrada es válida mediante el método `isValid`, hasta que la entrada no sea valida, se permanece en el ciclo `while` anidado.
4. Convierte la temperatura a la escala contraria utilizando el método `convert`.
5. Se repite el programa hasta que se ingresa `999` como valor de temperatura.

## Métodos

### `isValid(String[] data)`

Este método verifica que la entrada del usuario cumpla con el formato pedido:

Un valor `int` o `double` seguido de un `char` que represente la escala (`C` o `F`). Los pasos de validación incluyen:
- Comprobar que la entrada contiene exactamente dos elementos.
- Asegurarse de que el primer elemento se puede convertir a `double`.
- Verificar que el segundo elemento es `C` o `F` (insensible a mayúsculas).

### `convert(double temp, char scale)`

Este método convierte el valor de `temp` de Celsius a Fahrenheit o viceversa, según la escala indicada en `scale`.
