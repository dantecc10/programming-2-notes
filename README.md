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

# Evaluación

- Exámenes (Departamental) ECAA'S: 35%
- Tareas: 15%
- Prácticas: 15%
- Proyecto: 35%

# Bibliografía

- Joyanes Aguilar (2011). Programación en Java. McGraw Hill.
- Ceballos (2011). Java 2. Curso de programación AlfaOmega - Rama.
