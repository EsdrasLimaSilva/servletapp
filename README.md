# Servlet App

This repository is a study of java servlets. For now, it has no final goal.

## Tecnologies

- Apache Tomcat
- Apache Ant
- Apaache Maven
- Java Open JDK 17

## How to run

To run this project **you'll need to have [Apache Tomcat 10](https://tomcat.apache.org/download-10.cgi) and [Ant](https://ant.apache.org/manual/install.html) up and running on your machine**. You'll also **need to install [apache maven](https://maven.apache.org/install.html)**. After that all you'll have to clone this repository. You may have to change the property **tomcat.dir** on the [build file](build.xml)

### Linux and MacOS

Go to the root directory of the application and run the following command on your terminal:

```
mvn package && clear && ant deploy
```

## Windows

Open your **cmd**, go to the root directory of this project and run the following command:

```
mvn package && cls && ant deploy
```
