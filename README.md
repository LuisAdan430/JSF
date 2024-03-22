# JSF
Se comienza la instalacion del proyecto.

[Primer Pestaña]
Se crea proyecto con la opcion de Generators
    -> Module based on Java EE or Jakarta EE specifications.
Se crea proyecto con el nombre JSF-1
Se coloca en la ubicacion : ~\Documents\Cursos
No se selecciona la opcion Create Git Repository
En template se elije la opcion Web Aplication que soporta [Servlet,web.xml,index.jsp]
En Application server: se coloca el servidor [ JBoss/WildFly 31.0.1.Final]
En Language: Se coloca [ Java ].
En Build system: Se coloca [ Maven ].
En Group: se coloca [ com.pps]
En Artifact : Se coloca [JSF-1] que seria el nombre del proyecto.
En JDK: se selecciona la version 
    corretto-11 Amazon Corretto version Se descarga:
    Download JDK:
        Version: 11
        Vendor: Amazon Corretto [11.0.22]
        Location: C:\Users\AIT-USR\.jdks\corretto-11.0.22.1.
[Segunda Pestaña]
En version de Jakarta se coloca la version : [Jakarta EE 9.1]
Dependencias:
-> Specifications se colocan las siguientes opciones:
--> Server Faces (JSF) (3.0.0)
--> Servlet (5.0.0)
Implementatios:
    No se coloca ninguna opcion 

[Se crea proyecto]

---------------------------------------------------------------------------------------------

Se elimina antiguo proyecto JSF
:;::: Nota especial no quitar proyectos ya creados
[GIT]
Se crea nuevo repositorio llamado JSF
Se crea publico
Y se agrega con archivo README
Se clona el proyecto en cursos JSF
Se corta el proyecto JSF-1  de la ruta ~\Documents\Cursos y se coloca en Documentos/Cursos/JSF/JSF
Se lanza un git status: Si aparece el proyecto.
Se lanza un git add . 
    Pero marca muchos warnings:
Informacion de los warnings
    [Estos warnings indican que hay inconsistencias en el formato de los saltos de línea (LF, line feed, en Unix-like systems;
     RLF, carriage return line feed, en sistemas Windows) en los archivos dentro de tu repositorio Git. Git te está avisando
     que cuando realice alguna operación en estos archivos, cambiará automáticamente el formato de los saltos de línea a CRLF.
     Esto puede ocurrir cuando trabajas en un proyecto en un sistema operativo que usa un tipo de salto de línea (LF o CRLF) 
     y luego clonas o accedes a ese mismo proyecto en un sistema operativo que utiliza un formato diferente para los saltos de 
     línea. Git intenta ajustar estos cambios automáticamente para que los archivos se vean correctamente en ambos sistemas operativos.
     En resumen, estos warnings no son errores críticos, pero te indican que Git realizará cambios en el formato de los saltos
     de línea en los archivos mencionados la próxima vez que realices alguna operación en ellos. Esto es normal y no debería causar
     problemas graves en tu proyecto.]
Se lanza un git status: Se colocan todos los archivos en verde y se colocan nuevos archivos los cuales fueron modificados.
Se lanza un git commit -m [Al parecer todos los archivos fueron subidos sin errores]
Se realiza git push sin errores.
Todo bien a la hora de subir el proyecto.

---------------------------------------------------------------------------------------------

Se vuelve abrir proyecto en Intellij despues de todo el traspaso a git
ERROR al ejecuta primera vez.
Se cierra Intellij para que se reincie el proyecto
Se vuelve abrir intellij se ejecuta y ejecuta el proyecto correctamente.

Se elimina la carpeta [test] en la ruta [JSF-1/src/main] 
Se vuelve a ejecutar el proyecto.
Todo funcionando correctamente.

Se crea nuevo archivo .xml en la direccion  [JSF-1/src/main/webapp/WEB-INF] llamado  [faces.config.xml]
Se crea el archivo [index.xhtml] en la direccion [JSF-1/src/main/webapp/index.xhtml] 
Se elimina el archivo [index.jsp] de la direccion [JSF-1/src/main/webapp/index.jsp]
Se coloca en el archivo [web.xml] la siguiente informacion 
    [<welcome-file-list>
        <welcome-file>index.xhtml</welcome-file>
    </welcome-file-list>]
Se vuelve a ejecutar el proyecto.
Funciona todo correctamente.

Se suben las modificaciones.
Se coloca el git add . [Manda alerta avisando el cambio de tipo del web.xml]
Se lanza git push todo salio bien
Se vuelve a ejecutar proyecto todo salio correctamente.

-----------------------------------------------------------------------------------

