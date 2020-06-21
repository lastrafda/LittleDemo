# LittleDemo
A Spring Boot Demo: Create a Restful API accessing data with MySQL

You should create an file to save your database conf. 
```src/resources/application.properties```

``` java
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/DB_NAME  
spring.datasource.username=DB_USER  
spring.datasource.password=DB_PASSWORD
```

You can build the project running `./gradlew build` an execute the build file with `java -jar build/libs/NAME_OF_YOUR_JAR.jar`
