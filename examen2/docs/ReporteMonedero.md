Monedero.java
El archivo “Monedero.java” define un sistema para gestionar un monedero digital que permite realizar operaciones básicas como depositar dinero, retirar dinero y consultar saldo. La clase implementa un menú interactivo que permite al usuario realizar estas operaciones hasta que decida salir del programa seleccionando la opción 4.

Clase Datos
La clase Datos maneja la lógica del monedero y el almacenamiento del saldo.
Constructores
Constructor público “Datos” que inicializa el monedero sin saldo inicial.
Constructor público “Datos(double cantidadInicial)”que inicializa el monedero con una cantidad inicial especificada.

Métodos
meterDinero(double cantidad)
Este método agrega dinero al monedero siguiendo estas validaciones:
•	Verifica que la cantidad sea positiva
•	Actualiza el saldo sumando la cantidad
•	Muestra mensaje de confirmación
sacarDinero(double cantidad)
Este método retira dinero del monedero siguiendo estas validaciones:
•	Verifica que la cantidad sea positiva
•	Comprueba que haya saldo suficiente
•	Actualiza el saldo restando la cantidad
•	Retorna true si la operación fue exitosa, false en caso contrario
consultarSaldo()
Este método retorna el saldo actual del monedero.

Monedero
La clase “Monedero” maneja la interfaz de usuario y la interacción con el usuario.

Constructor
El constructor público “Monedero” inicializa una instancia de la clase Datos sin saldo inicial.
Métodos
Este método “menu” implementa el menú interactivo del programa siguiendo estos pasos:
•	Crea un objeto Scanner para leer la entrada del usuario
•	Muestra las opciones del menú
•	Lee la opción seleccionada por el usuario
•	Ejecuta la operación correspondiente según la opción seleccionada
•	Repite el proceso hasta que el usuario seleccione la opción 4 (Salir)
El menú presenta las siguientes opciones:
•	Meter dinero
•	Sacar dinero
•	Consultar saldo
•	Salir

