# programming-2-notes

Clase de Programación II de la Ingeniería en Ciencias de la Computación.

# Docente

Dra. Beatriz Beltrán.
Cubículo en CC01-125

# Temario

- Conceptos básicos del paradigma orientado a objetos.
- Abstracción del mundo real al POO.
- Lenguaje de programación orientado a objetos.
- Lenguaje de programación orientado a objetos: elementos avanzados.
- Tópicos avanzados de la programación.

# Organización física

La organización física tiene que ver con el "lugar" y la "forma" dentro de la memoria donde se almacena la información.

Tanto el "lugar" como la "forma" son representados por el espacio en el cual puede ser fijo o variable.

Por lo tanto, se tiene que las E. D. se clasifican en:

- Estáticas.
- Dinámicas.

# Herencia

Es la capacidad de los elemenetos de una jerarquía, de transmitir sus características desde los niveles más abstractos a los más concretos.

La herencia también es el mecanismo para **propagar** (**atributos** y **métodos**) de las **superclases** a las **subclases**; es decir, la herencia es la habilidad de una subclase de tomar las propiedades generales de una superclas en la cadena de herencia (jerarquía de clases).

Cada vez que se especializa una clase, esta hereda atribuos y comportamientos de su superclase; pero además **añade nuevos comportamientos** o se modifica alguno de los ya heredados.

La herencia promueve la **reutilización del software** y evita la **duplicidad** de información.

## Jerarquía

En POO, los objetos poseen características que los hacen únicos, así como características que comparten con otro objetos.

Aquellos objetos que **comparten** las mismas **características** o similares se agrupan en **clases** y estas pueden **organizarse jerarquicamente**.

La ventaja de estructurar las clases en una jerarquía es **fomentar la reutilización** y **evitar la redundancia** y la duplicidad de información.

La jerarquía es la capacidad de manejar niveles de abstracción.

## Generalización - Especialización

La **generalización** es el acto de capturar similitudes entre clases y definir las similitudes en una nueva clase generalizada.

**Especialización** es el acto de capturar diferencias entre objetos en una clase y crear nuevas subclases distintas a partir de las diferencias.

Una clase **especializada** se conoce como ***subclase***, mientras que una clase **generalizada** se conoce como ***superclase***.

# Polimorfismo

Es la **habilidad** que tienen los objtos de **responder de diferente forma ante los mismos mensajes**.

Es aquella prioridad en que un método tiene el **mismo nombre** en **diferentes clases**, pero se **ejecuta** de **diferentes formas** en cada clase.

El **polimorfismo** se hace en tiempo de ejecución porque dutante la compilación no se conoce qué tipo de objeto ni qué operación ha sido llamada. Es la habilidad de esconder diferentes implementaciones tras un solo interface.

# Modelo conceptual

ES el primer modelo de clases que se debe hacer y reúne las abstracciones principales (key abstractions) del sistema que desea construir:

- ES un primer inteno de definir la estructura del sistema.
- Se obtiene al examinar la descripción del problema y en entrevistas con los expertos del dominio.
- Se usa como una base de entendimiento y cooperación con los expertos de dominio y/o clientes.
- No debe incluir los detalles de las clases, sólo unificarlas.

Incluye:

- Diccionario del modelo.
- Uno o más diagramas de clases (normalemente solamente uno).

# Clases

El nombre de una clase, debe ser el sustantivo singular que mejor caracteriza la abstracción que se quiere representar con esa clase.

El que haya difucltad para nombrar una clase, puede ser indicio de que la abstracción que esta representa no se entiende bien o no está bien definida. Los nombres de las clases deben tomarse directamente del vocabulrio del dominio.

- Se debe evitar

# Tarjetas CRC (Clase-Responsabilidad-Colaboración)

Introducidas en 1989 por Ward Cunningham y Kent Beck en OOPSLA.

Es una tarjeta originalmente de 4" por 6" que muestra:

- El nombre y descripción de la clase.
- Las responsabilidades de la clase.
- Conocimiento interno de la clase.
- Servicios que brinda la clase.
- Los colaboradores con los que interactúa la clase.
- Un colaborador es una clase cuyos servicios son necesarios para cumplir con una responsabilidad.

Ejemplo:

|                                   Clase: Venta                                   | [Se puede añadir una descripción] |
| :-------------------------------------------------------------------------------: | :---------------------------------: |
|                                 Responsabilidades                                 |           Colaboraciones           |
| Ingresar cliente<br />Mostrar cliente<br />Ingresar producto<br />Calcular precio |        Cliente<br />Producto        |

## Beneficios

Los patrones de colaboración surgen a medida que más y más escenarios se completan.

Las tarjetas se pueden distribuir físicamente para reprsetnar las colboraciones estrechas. ESto puede ayudar a identificar.

Las cosas van bien sí:

- Todas las clases tienen nombres significativos y especificación del dominio.
- Cada clase tiene un grupo pequeño de colaboradores.
- No hay clases indispensables.
- La información de cada clase cabe bien dentro de una tarjeta 3" x 5".
- Un cambio en lso requerimientos puede ser manejado por las clases.

# Arreglos (estructura de datos)

## Organización lógica

- Dimensiones.
- Límite inferior y superior de cada dimensión.
- Tipo de elementos.

## Organización física

- Dirección inicial (de un intervalo de memoria).
- Tamaño de los elementos.
- Orden de las dimensiones.
- Desplazamientos.

Nota: La maestra se equivocó y nos estaba dando la clase de estructuras de programación, pero dejaré este apunte...

# Programación Orientada a Objetos

En lugar de modelar un problema en algo familiar a la computadora, ahora se trata de acercar la computadora al problema. Modelar la realidad del problema a través de entidades independientes pero que interactúan entre sí y cuyas fronteras no estén determindas por su instrumentación computacional, sino por la naturaleza del problema. EStas entidades se denominan objetos.

Resolver problemas consiste en definir obejtos y sus acciones para así invocar las acciones enviando mensajes a los objetos que ocultan las características internas de cómo llevan a cabo estas acciones.

La POO es una técnica de programación cuyo soporte fundamental es el objeto.

Un objeto es una extensión de un TDA (Tipo de Dato Abstracto).

Un TDA es un tipo definido por el usuario, que encapsula un conjunto de datos y las operaciones sobre estos datos.

Cuando programamos en POO, definimos clases que expresan una determinada funcionalidad la cual es común a todos los individuos que pertenecen a una clase.

Las clases deben ser lo suficientemente cerradas para ocultar información hacia el exterior; mientras que deben ser lo suficientemente abiertas para permitir la reutilización, adaptación y extensión de las mismas a nuevas funcionalidades sin correr el riesgo de afectar el funcionamiento de lo que ya es correcto.

*Principio **ABIERTO-CERRADO***.

UN método es la operación que se puede efecutar sobre los campos (datos) de un objeto. Cuando el método es invocado se dice que se envía un mensaje al objeto a través del método; es esta la forma como el obejto cambia su estado.

La identidad es la propiedad con la cual se puede distinguir un objeto de otros objetos (su nombre),

Datos (atributos): Son los campos del objeto que representan características bien definidas de un objeto.

## Beneficios de la Programación Orientada a Objetos

Algunos beneficios son:

- Mantenibilidad: Facilidad de mantenimiento.
- Modificabilidad: Facilidad para modificiar los programas.
- Reusabilidad: Los objetos si han sido correctamente diseñados, se pueden usar numerosas veces y en distintos proyectos.
- Fiabilidad: Los programas orientados a objetos suelen ser más fiables ya que se basan en el uso de objetos ya definidos que están ampliamente probados.

### Principio de Parnas u ocultamiento

No permitir que los usuarios modifiquen ni la representación de la información, ni las operaciones sobre esa información.

### Principio de compartir comportamiento

Reutilizar código, no reinventarlo.

Los mensajes entre los objeto son síncronos, al conjunto de mensajes que responde le llamamos protocolo. Un cálculo en la POO se lleva a cabo mediante el envío de mensajes entre objetos.

# UML (Unified Model Language)

UML es un lenguaje que proporciona un vocabulario y las reglas para utilizarlo, además es un lenguaje de modelado, lo que significa que el vocabulario y las reglas se utilizan para la representación conceptual y física del sistema.

ES un lenguaje que nos ayuda a interpretar grandes sistemas mediante gráficos o mediante texto obteniendo modelos explícitos que ayudan a la comunicación dutante el desarrollo ya que al ser estandar, los modelos podrán ser interpretados por personas que no participaron en su diseño sin ninguna ambigüedad.

# Evaluación

- Exámenes (Departamental) ECAA'S: 35%
- Tareas: 15%
- Prácticas: 15%
- Proyecto: 35%

# Bibliografía

- Joyanes Aguilar (2011). Programación en Java. McGraw Hill.
- Ceballos (2011). Java 2. Curso de programación AlfaOmega - Rama.
