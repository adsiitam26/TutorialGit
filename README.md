# TutorialGit
Tutorial para ejecutar los comandos básicos de git, crear un conflicto en merge, resolverlo y poner los archivos en Nexus

## Nota
Para poner una *llave* (`settings.xml`) y poner código en Nexus, debemos:
1. Ese `xml` ponerlo en `$ ~/.m2/settings.xml`
2. Comprobar que sí deja subir a Nexus con el comando `mvn deploy`
* Si se requiere poner más *settings*, entonces todo el contenido de la etiqueta de **server** de la nueva *llave* iría bajo la etiqueta de **servers** en el mismo archivo (`$ ~/.m2/settings.xml`).

## Referencias
*además de la clase de ADSI*
* [Nexus Repository Manager](https://books.sonatype.com/nexus-book/2.11/reference/_adding_credentials_to_your_maven_settings.html)
