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

Se crea en el documento index.html
 los siguientes campos.
 <h:form>
    <h:inputText> </h:inputText>
    <h:commandButton value="Enviar"></h:commandButton>
 </h:form>

 Se ejecuta codigo todo correcto funciona todo.

 Se elimina el apartado
    <h:outputLabel value="Hello, world"/>
 y se coloca dentro del  
    <f:view>
    </f:view> el form
    quedando asi 
    <f:view>
    <h:form>
        <h:inputText></h:inputText>
        <h:commandButton value="Enviar"></h:commandButton>
    </h:form>
</f:view>

Se ejecuta codigo.
Funciona correctamente

Se elimina HelloServer de la ruta [JSF-1/src/main/java/com.pps.jsf1]
Se ejecuta codigo __ Funciona correctamente.

Se agrega un bean en la ruta [JSF-1/src/main/java/com.pps.jsf1] llamado bean y se declara el string texto
Se crean get y set

En faces.config se declara el la siguiente informacion para que lea el bean 
<managed-bean>
        <managed-bean-name>bean</managed-bean-name>
        <managed-bean-class>com.pps.jsf1.bean</managed-bean-class>
        <managed-bean-scope>view</managed-bean-scope>
    </managed-bean>

Se ejecuta codigo
 Lanza error en el log del servidor.
 [ 23:55:47,629 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-1) MSC000001: Failed to start service jboss.deployment.unit."JSF-1-1.0-SNAPSHOT.war".WeldStartService: org.jboss.msc.service.StartException in service jboss.deployment.unit."JSF-1-1.0-SNAPSHOT.war".WeldStartService: Failed to start service
	at org.jboss.msc@1.5.2.Final//org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1609)
	at org.jboss.msc@1.5.2.Final//org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1438)
	at org.jboss.threads@2.4.0.Final//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
	at org.jboss.threads@2.4.0.Final//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
	at org.jboss.threads@2.4.0.Final//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
	at org.jboss.threads@2.4.0.Final//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.jboss.weld.exceptions.DefinitionException: WELD-000075: Normal scoped managed bean implementation class has a public field:  [EnhancedAnnotatedFieldImpl] public com.pps.jsf1.bean.texto
	at org.jboss.weld.core@5.1.2.Final//org.jboss.weld.bean.ManagedBean.checkBeanImplementation(ManagedBean.java:241)
	at org.jboss.weld.core@5.1.2.Final//org.jboss.weld.bean.AbstractClassBean.internalInitialize(AbstractClassBean.java:75)
	at org.jboss.weld.core@5.1.2.Final//org.jboss.weld.bean.ManagedBean.internalInitialize(ManagedBean.java:110)
	at org.jboss.weld.core@5.1.2.Final//org.jboss.weld.bean.RIBean.initialize(RIBean.java:69)
	at org.jboss.weld.core@5.1.2.Final//org.jboss.weld.bootstrap.ConcurrentBeanDeployer$4.doWork(ConcurrentBeanDeployer.java:98)
	at org.jboss.weld.core@5.1.2.Final//org.jboss.weld.bootstrap.ConcurrentBeanDeployer$4.doWork(ConcurrentBeanDeployer.java:95)
	at org.jboss.weld.core@5.1.2.Final//org.jboss.weld.executor.IterativeWorkerTaskFactory$1.call(IterativeWorkerTaskFactory.java:62)
	at org.jboss.weld.core@5.1.2.Final//org.jboss.weld.executor.IterativeWorkerTaskFactory$1.call(IterativeWorkerTaskFactory.java:55)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
	at org.jboss.threads@2.4.0.Final//org.jboss.threads.JBossThread.run(JBossThread.java:513)

23:55:47,635 ERROR [org.jboss.as.controller.management-operation] (management-handler-thread - 1) WFLYCTL0013: Operation ("deploy") failed - address: ([("deployment" => "JSF-1-1.0-SNAPSHOT")]) - failure description: {"WFLYCTL0080: Failed services" => {"jboss.deployment.unit.\"JSF-1-1.0-SNAPSHOT.war\".WeldStartService" => "Failed to start service
    Caused by: org.jboss.weld.exceptions.DefinitionException: WELD-000075: Normal scoped managed bean implementation class has a public field:  [EnhancedAnnotatedFieldImpl] public com.pps.jsf1.bean.texto"}}
23:55:47,636 ERROR [org.jboss.as.controller.management-operation] (management-handler-thread - 1) WFLYCTL0013: Operation ("deploy") failed - address: ([("deployment" => "JSF-1-1.0-SNAPSHOT")]) - failure description: {"WFLYCTL0080: Failed services" => {"jboss.deployment.unit.\"JSF-1-1.0-SNAPSHOT.war\".WeldStartService" => "Failed to start service
    Caused by: org.jboss.weld.exceptions.DefinitionException: WELD-000075: Normal scoped managed bean implementation class has a public field:  [EnhancedAnnotatedFieldImpl] public com.pps.jsf1.bean.texto"}}
23:55:47,638 ERROR [org.jboss.as.server] (management-handler-thread - 1) WFLYSRV0021: Deploy of deployment "JSF-1-1.0-SNAPSHOT.war" was rolled back with the following failure message: 
{"WFLYCTL0080: Failed services" => {"jboss.deployment.unit.\"JSF-1-1.0-SNAPSHOT.war\".WeldStartService" => "Failed to start service
    Caused by: org.jboss.weld.exceptions.DefinitionException: WELD-000075: Normal scoped managed bean implementation class has a public field:  [EnhancedAnnotatedFieldImpl] public com.pps.jsf1.bean.texto"}}
23:55:47,694 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-8) WFLYSRV0028: Stopped deployment JSF-1-1.0-SNAPSHOT (runtime-name: JSF-1-1.0-SNAPSHOT.war) in 56ms
[2024-03-21 11:55:47,757] Artifact JSF-1:war exploded: Error during artifact deployment. See server log for details.
[2024-03-21 11:55:47,758] Artifact JSF-1:war exploded: java.lang.Exception: {"WFLYCTL0080: Failed services" => {"jboss.deployment.unit.\"JSF-1-1.0-SNAPSHOT.war\".WeldStartService" => "Failed to start service
    Caused by: org.jboss.weld.exceptions.DefinitionException: WELD-000075: Normal scoped managed bean implementation class has a public field:  [EnhancedAnnotatedFieldImpl] public com.pps.jsf1.bean.texto"}}
]
Info del error 
[El mensaje de error que está encontrando indica un problema con un bean administrado en su aplicación JSF.
 El problema específico es que la clase de implementación del bean administrado tiene un campo público, que no está
 permitido para los beans administrados de ámbito normal en Weld.
Para resolver este problema, debe asegurarse de que su clase de bean administrado no tenga ningún campo público. En su lugar, debe utilizar campos privados con métodos getter y setter adecuados para acceder a ellos. Estos son los pasos que puede seguir para solucionar este problema:
Modifique su clase de bean administrado para eliminar cualquier campo público.com.pps.jsf1.bean
Encapsule sus campos haciéndolos privados y proporcione métodos públicos de obtención y configuración para acceder a ellos.
Actualice su clase de bean administrado para cumplir con las convenciones de JavaBean adecuadas.
Si sigue estos pasos y corrige la estructura de su clase de bean administrado, debería poder resolver el error 
"WELD-000075" e implementar exitosamente su aplicación JSF sin problemas relacionados con los campos públicos en los beans administrados. ]

Se corrige error colocando el texto del bean a privado.
Se ejecuta codigo:
Error Info:
23:59:56,329 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-7) MSC000001: Failed to start service jboss.deployment.unit."JSF-1-1.0-SNAPSHOT.war".WeldStartService: org.jboss.msc.service.StartException in service jboss.deployment.unit."JSF-1-1.0-SNAPSHOT.war".WeldStartService: Failed to start service
	at org.jboss.msc@1.5.2.Final//org.jboss.msc.service.ServiceControllerImpl$StartTask.execute(ServiceControllerImpl.java:1609)
	at org.jboss.msc@1.5.2.Final//org.jboss.msc.service.ServiceControllerImpl$ControllerTask.run(ServiceControllerImpl.java:1438)
	at org.jboss.threads@2.4.0.Final//org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
	at org.jboss.threads@2.4.0.Final//org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:1990)
	at org.jboss.threads@2.4.0.Final//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1486)
	at org.jboss.threads@2.4.0.Final//org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1377)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.jboss.weld.exceptions.DeploymentException: WELD-000072: Bean declaring a passivating scope must be passivation capable.  Bean:  Managed Bean [class com.pps.jsf1.bean] with qualifiers [@Any @Default]
	at org.jboss.weld.core@5.1.2.Final//org.jboss.weld.bean.ManagedBean.checkType(ManagedBean.java:224)
	at org.jboss.weld.core@5.1.2.Final//org.jboss.weld.bean.AbstractBean.initializeAfterBeanDiscovery(AbstractBean.java:108)
	at org.jboss.weld.core@5.1.2.Final//org.jboss.weld.bean.ManagedBean.initializeAfterBeanDiscovery(ManagedBean.java:127)
	at org.jboss.weld.core@5.1.2.Final//org.jboss.weld.bootstrap.ConcurrentBeanDeployer$AfterBeanDiscoveryInitializerFactory.doWork(ConcurrentBeanDeployer.java:113)
	at org.jboss.weld.core@5.1.2.Final//org.jboss.weld.bootstrap.ConcurrentBeanDeployer$AfterBeanDiscoveryInitializerFactory.doWork(ConcurrentBeanDeployer.java:104)
	at org.jboss.weld.core@5.1.2.Final//org.jboss.weld.executor.IterativeWorkerTaskFactory$1.call(IterativeWorkerTaskFactory.java:62)
	at org.jboss.weld.core@5.1.2.Final//org.jboss.weld.executor.IterativeWorkerTaskFactory$1.call(IterativeWorkerTaskFactory.java:55)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
	at org.jboss.threads@2.4.0.Final//org.jboss.threads.JBossThread.run(JBossThread.java:513)

23:59:56,340 ERROR [org.jboss.as.controller.management-operation] (management-handler-thread - 1) WFLYCTL0013: Operation ("deploy") failed - address: ([("deployment" => "JSF-1-1.0-SNAPSHOT")]) - failure description: {"WFLYCTL0080: Failed services" => {"jboss.deployment.unit.\"JSF-1-1.0-SNAPSHOT.war\".WeldStartService" => "Failed to start service
    Caused by: org.jboss.weld.exceptions.DeploymentException: WELD-000072: Bean declaring a passivating scope must be passivation capable.  Bean:  Managed Bean [class com.pps.jsf1.bean] with qualifiers [@Any @Default]"}}
23:59:56,341 ERROR [org.jboss.as.controller.management-operation] (management-handler-thread - 1) WFLYCTL0013: Operation ("deploy") failed - address: ([("deployment" => "JSF-1-1.0-SNAPSHOT")]) - failure description: {"WFLYCTL0080: Failed services" => {"jboss.deployment.unit.\"JSF-1-1.0-SNAPSHOT.war\".WeldStartService" => "Failed to start service
    Caused by: org.jboss.weld.exceptions.DeploymentException: WELD-000072: Bean declaring a passivating scope must be passivation capable.  Bean:  Managed Bean [class com.pps.jsf1.bean] with qualifiers [@Any @Default]"}}
23:59:56,343 ERROR [org.jboss.as.server] (management-handler-thread - 1) WFLYSRV0021: Deploy of deployment "JSF-1-1.0-SNAPSHOT.war" was rolled back with the following failure message: 
{"WFLYCTL0080: Failed services" => {"jboss.deployment.unit.\"JSF-1-1.0-SNAPSHOT.war\".WeldStartService" => "Failed to start service
    Caused by: org.jboss.weld.exceptions.DeploymentException: WELD-000072: Bean declaring a passivating scope must be passivation capable.  Bean:  Managed Bean [class com.pps.jsf1.bean] with qualifiers [@Any @Default]"}}
23:59:56,402 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0028: Stopped deployment JSF-1-1.0-SNAPSHOT (runtime-name: JSF-1-1.0-SNAPSHOT.war) in 58ms
[2024-03-21 11:59:56,458] Artifact JSF-1:war exploded: Error during artifact deployment. See server log for details.
[2024-03-21 11:59:56,459] Artifact JSF-1:war exploded: java.lang.Exception: {"WFLYCTL0080: Failed services" => {"jboss.deployment.unit.\"JSF-1-1.0-SNAPSHOT.war\".WeldStartService" => "Failed to start service
    Caused by: org.jboss.weld.exceptions.DeploymentException: WELD-000072: Bean declaring a passivating scope must be passivation capable.  Bean:  Managed Bean [class com.pps.jsf1.bean] with qualifiers [@Any @Default]"}}

Info del error: 
[
    El mensaje de error al que se enfrenta indica un problema con un bean administrado en su aplicación JSF. 
    El problema específico es que el bean declara un alcance de pasivación pero no es capaz de pasivación,
     lo que provoca una falla de implementación en Weld.
Para resolver este error, debe asegurarse de que su bean administrado tenga capacidad de pasivación al declarar un alcance de pasivación. Estos son los pasos que puede seguir para abordar este problema:
Implemente la interfaz en su clase de bean administrado para que sea capaz de pasivación.Serializablecom.pps.jsf1.bean
Asegúrese de que todos los campos dentro de su clase de bean administrado sean serializables o marcados como transitorios si no deben serializarse.
Verifique si hay dependencias o referencias en su bean administrado que puedan no ser serializables y realice los ajustes necesarios.
Si sigue estos pasos y se asegura de que su clase de bean administrado sea correctamente serializable y tenga capacidad de pasivación,
 debería poder resolver el error "WELD-000072" e implementar exitosamente su aplicación JSF sin ningún problema relacionado con la pasivación.
]

Se corrige error colocando implements serializable en el bean
Se ejecuta codigo.

Todo correcto.
Solucionado error.
Se suben cambios .
