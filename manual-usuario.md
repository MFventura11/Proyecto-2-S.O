
# MANUAL DE USUARIO #
## SOFTWARE SIMULADOR DE GESTIÓN DE MEMORIA ##

## índice de Contenido ##
1. Acerca del Software
2. Requisitos del Software
3. Uso del software

### 1. Acerca del Software ###
El presente software fue diseñado y desarrollado en NetBeans IDE 8.2 en conjunto con el lenguaje de programación Java, el objetivo principal de este programa es: Simular la gestión de memoria principal de diversos procesos ejecutados en tiempo real.

### 2. Requisitos del Software ###
#### 2.1. Instalación de complementos ####
- Descargar [NetBeans IDE 8.2 con Java 8](http://www.mediafire.com/file/sb7q3p13gnprcpj "Clic para descargar")
- Posteriormente, descomprimir el **archivo.rar** e *instalar*.

#### 2.2. Requerimientos del sistema ####
- **Sistema Operativo:** Windows
- **Espacio disponible en Unidad de almacenamiento:** 100 MB
- **Resolución de Pantalla:** 16:9, 18:9, o superior

### 3. Uso del software ###
#### 3.1. Ventana principal: Simulador de Gestión de Memoria ####
![](C:\proyecto\imagenes\ventana_princiapl_1.JPG)

----------

La presente GUI (Interfaz Gráfica de Usuario) cuenta con dos tablas y dos botones. A continuación se explica su funcionalidad:

- **Tabla de procesos:** Esta tabla presenta los datos de los procesos creados por el usuario.
- **Tabla de asignación de memoria:** Permite visualizar el proceso por el cual se consume y se libera la memoria utilizada por cada uno de los procesos (tareas) a crear.
- **Botón Crear:** Permite visualizar la Ventana secundaria: Creador de proceso.
- **Botón Limpiar tablas:** Simplemente vacía las tablas, siempre y cuando todos los procesos esten finalizados.

#### 3.2. Ventana secundaria: Creador de proceso ####
![](C:\proyecto\imagenes\ventana_secundaria_2.JPG)

----------

La presente ventana permite crear uno o varios procesos a la vez, a continuación se describen sus campos y botones correspondientes:

- **Campo de texto Proceso:** Permite ingresar el nombre de un proceso.
- **Etiqueta memoria:** Permite visualizar el valor de memoria en KB asignado aleatoriamente al proceso creado.
- **Botón Guardar:** Crea y almacena un proceso respetando las normas establecidas.
- **Botón Limpiar:** Vacía los campos Proceso y Memoria.
- **Botón Random:** Permite la creación de X cantidad de procesos, respetando las normas establecidas en el proyecto.

#### 3.3. Ejemplo del uso del software ####
##### Caso 1: Creación unitaria de procesos #####
![](C:\proyecto\imagenes\proceso_1.JPG)

----------

En la presente imagen, se visualiza la creación de un proceso, a su vez, se asigna su memoria aleatoriamente, posteriormente, se presentan los valores en la tabla correspondiente. Por último, al finalizar el proceso libera la cantidad de memoria utilizada, de tal manera, se presenta un ejemplo en la siguiente imagen:

![](C:\proyecto\imagenes\proceso_1_1.JPG)

##### Caso 2: Creación de múltiples procesos #####
![](C:\proyecto\imagenes\proceso_2.JPG)

----------

La presente imagen explica a cerca de la creación de 10 procesos mediante el uso del **botón random**, por lo siguiente, se expone el resultado al dar clic en aceptar la entrada de 10 procesos.

![](C:\proyecto\imagenes\proceso_2_2.JPG)

En la presente imagen, se visualizan varios proceso asignados y otros en estado de espera, de tal manera, se espera que la memoria quede libre o exista la suficiente para hacer uso y ejecutar el proceso.

Por último, cabe destacar cada proceso se ejecuta independientemente de los demás procesos, de tal manera, que su estado cambiará dependiendo de la asignación de memoria, estado de espera o finalización del proceso al completar el Quantum.