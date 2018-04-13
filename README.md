# TutorialGit
Tutorial para ejecutar los comandos básicos de git, crear un conflicto en merge, resolverlo y poner los archivos en Nexus

## Nota
Para poner una *llave* (`settings.xml`) y poner código en Nexus, debemos:
1. Ese `xml` ponerlo en `$ ~/.m2/settings.xml`
2. Comprobar que sí deja subir a Nexus con el comando `mvn deploy`
* Si se requiere poner más *settings*, entonces todo el contenido de la etiqueta de **server** de la nueva *llave* iría bajo la etiqueta de **servers** en el mismo archivo (`$ ~/.m2/settings.xml`).

## Pasos
1. Crear el repositorio en [Github](https://github.com)

![](https://github.com/adsiitam26/TutorialGit/blob/solveMergeConflict/img/fig1.png)

2. Crear 2 carpetas con el repositorio clonado
3. Crear una nueva rama para hacer todas las modificaciones

![](https://github.com/adsiitam26/TutorialGit/blob/solveMergeConflict/img/fig2.png)

4. Hacer un cambio en un archivo de la primer carpeta
5. Hacer **push** con ese cambio
6. Ir a la segunda carpeta
7. Hacer un cambio en la misma línea del mismo archivo
8. Hacer commit para generar el *merge conflict*
9. Pull de la rama en esa 2º carpeta
10. Resolver el conflicto (modificar el archivo)
11. Volver a hacer push.
Resultado final:

![](https://github.com/adsiitam26/TutorialGit/blob/solveMergeConflict/img/fig3.png)

## Referencias
*además de la clase de ADSI*
* [Nexus Repository Manager](https://books.sonatype.com/nexus-book/2.11/reference/_adding_credentials_to_your_maven_settings.html)
