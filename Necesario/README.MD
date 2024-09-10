Para ejecutar este analizador léxico (en Netbeans) se deben seguir los siguientes pasos:

1) Descargar el archivo completo del Github
2) Descomprimirlo
3) ir a tu carpeta de projectos (por defecto en Documentos/NetBeansProjects) y pegar el archivo descomprimido

4) Ahora en netbeans vamos a File -> Open Project  y selecccionamos nuestro archivo 
5) Ahora (dentro del netbeans, en el projecto que acaba de cargar) en la carpeta "Libraries" hacemos click derecho y luego en "Add JAR/Folder"
Navegamos hasta nuestro proyecto descargado, entramos en la carpeta "Necesario" y seleccionamos el archivo llamado JFlex.jar

6) Ahora (en Netbeans, dentro del proyecto que abrimos) abrimos el archivo Principal.java  y cambiamos la variable llamada ruta para que apunte a la dirección del archivo
7) hacemos clic derecho (sobre el código) y run file
(Esto creará un autómata que será nuestro analizador Léxico)

8) para ejecutar el analizador vamos al archivo "FrmPrincipal.java" y hacemos doble clic sobre el botón "analizar" esto nos lleva al código y ahí hacemos clic derecho y "Run File"
