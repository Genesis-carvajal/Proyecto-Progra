# LOOPI – Libro interactivo sobre el reciclaje

## Descripción del proyecto

LOOPI es un libro educativo interactivo desarrollado en Java, dirigido al público infantil. Su objetivo es enseñar la importancia del reciclaje y el cuidado del medio ambiente mediante páginas informativas y actividades visuales.

El libro explica cómo clasificar los residuos plásticos, orgánicos y de papel. Al finalizar la lectura, el usuario puede realizar una actividad de tres preguntas en la que debe observar una imagen y seleccionar el contenedor correspondiente. El programa calcula la puntuación, permite hasta tres intentos y conserva un historial de resultados durante la sesión.

## Requisitos

- JDK 26, según la configuración del proyecto Maven.
- Apache NetBeans con soporte para Maven.
- Archivos de imágenes incluidos en el proyecto.

## Instrucciones para ejecutar el programa

1. Abrir Apache NetBeans.
2. Seleccionar **File > Open Project** y abrir la carpeta del proyecto `Loopi`, que contiene el archivo `pom.xml`.
3. Verificar que el proyecto utilice el JDK correspondiente y que las imágenes se encuentren en el paquete `resources`.
4. Hacer clic derecho sobre el proyecto y seleccionar **Clean and Build** para compilarlo y copiar los recursos.
5. Seleccionar **Run** o presionar `F6`. La clase principal es `main.Principal`.
6. Desde el menú principal, iniciar la lectura, navegar por las páginas y acceder a la actividad de reciclaje desde la última página.

## Principales clases utilizadas

El programa utiliza el patrón Modelo-Vista-Controlador (MVC), que permite separar los datos, la interfaz gráfica y la lógica del programa.

### Modelo

| Clase | Descripción |
| --- | --- |
| `Pagina` | Clase abstracta que representa las características comunes de las páginas del libro. |
| `PaginaInformativa` | Hereda de `Pagina` y presenta información educativa sobre el reciclaje. |
| `PaginaActividad` | Hereda de `Pagina` y presenta las instrucciones de la actividad. |
| `Libro` | Almacena y permite consultar las páginas del libro. |
| `Actividad` | Almacena las imágenes y respuestas, calcula los puntos y registra los intentos mediante arreglos y una matriz. |

### Vista

| Clase | Descripción |
| --- | --- |
| `VistaPrincipal` | Presenta el menú principal del programa. |
| `VistaLibro` | Muestra el contenido del libro y permite navegar entre las páginas. |
| `VistaActividad` | Presenta las imágenes de los residuos y los contenedores que el usuario puede seleccionar. |
| `VistaResultados` | Presenta los resultados de la actividad y el historial de intentos. |

### Controlador

| Clase | Descripción |
| --- | --- |
| `ControladorPrincipal` | Inicia la lectura, crea las páginas del libro y permite salir del programa. |
| `ControladorLibro` | Controla la navegación entre páginas y el acceso a la actividad. |
| `ControladorActividad` | Controla las preguntas, guarda las respuestas y gestiona los intentos y la puntuación. |
| `ControladorResultados` | Gestiona la presentación de los resultados de la actividad. |

### Clase principal

`Principal`: punto de entrada del programa.

## Tecnologías y conceptos utilizados

- Java y Java Swing para la interfaz gráfica.
- Maven para la compilación y gestión de dependencias.
- Patrón de diseño MVC.
- Programación orientada a objetos: encapsulamiento, herencia, abstracción y polimorfismo.
- Arreglos y matrices para almacenar respuestas e historial.
- Manejo de eventos mediante botones y componentes gráficos.
