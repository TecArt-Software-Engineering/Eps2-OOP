
# Eps2-OOP
All the stuff from TecArt's Software Engineering Eps 2 Workshop to prep for your project 😘
## Prerequisite

- #### XAMPP
Install XAMPP from [XAMPP Download Page](https://www.apachefriends.org/)

- #### NetBeans
Install NetBeans from [NetBeans Download Page](https://netbeans.apache.org/front/main/download/)
> To use NetBeans you'll also need to install the latest Java SE Development Kit on your device. Full tutorial can be watched here: [How to install NetBeans + JDK](https://youtu.be/bXIv-LYBu7s?si=jacuiKDhpg8H6VSK)

- #### JDBC Driver

Add this line of code into your `pom.xml`, after  `</dependency>` for `org.org.netbeans.external` dependency
```
<dependency>
	<groupId>mysql</groupId>
	<artifactId>mysql-connector-java</artifactId>
	<version>8.0.33</version> <!-- Use the latest version -->
</dependency>
```
> To find the leatest version of JDBC, look up to the JDBC download page. [JDBC Driver Download Page](https://dev.mysql.com/downloads/connector/j/)

- #### Discord (optional)
Feel free to join TecArt's discord channel for any help regarding this project ! [Discord Link] (https://discord.gg/RmjSNg3UpH)
## Project Targets

- Really just to code something, it's better to have bad code then to dream of good code 🤗
- Understand CRUD concept on this project
- Able to do CRUD operation on books
- Handle user registration and login (Update and Delete operation on user is optional)
- Good looking UI are not neccesary, as long as it is functional
## FAQ

#### Im still don't understand how to implement something/don't understand how to fix an error

Message us on TecArt discord channel, our staff will happily help you with any problem ! 😎

#### Error "Broken Platform Refrence" on my project

Right click on the project. Then, select "properties". Select "Libraries" from the categories on the left hand side of Project Properties. And then select the new "Java Platform". [More info click here] (https://stackoverflow.com/questions/16887253/netbeans-broken-platform)

#### Error when running project, "Communication link failure"

This is due to XAMPP not running, remember to always start Apache and MySQL service on XAMPP




## Additional Tutorial

Here are some additional tutorial to help you work on your project !

- [JDBC Connection](https://www.youtube.com/watch?v=RntqK81O0wM)
- [MySQL Query](https://www.w3schools.com/MySQL/mysql_sql.asp)
- [NetBeans GUI Tutorial 1](https://youtu.be/MNCXyyYX5mk?si=0eXEgoy2jVWmodHZ)
- [NetBeans GUI Tutorial 2](https://www.petanikode.com/java-swing-jframe/)
- [Other Java CRUD Project](https://www.youtube.com/watch?v=aEsMa5FomoI)



## Motivational

Remember, every line of code you write is a step toward mastery. Embrace challenges as opportunities to learn and grow. Happy coding! 🚀
