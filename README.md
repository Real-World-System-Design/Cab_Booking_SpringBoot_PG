<h1 align="center">:car:<tt>The_CAB</tt>:car:</h1>

<blockquote align="center">cab booking application API let's you book nearest cabs</blockquote>

<p align="center"><a href="https://github.com/real-world-system-design/Cab_Booking_SpringBoot_PG"><img alt="Github actions 
status" src="https://github.com/real-world-system-design/Cab_Booking_SpringBoot_PG/actions/workflows/maven.yml/badge.svg" /></a></p>

## Technologies used :
* SpringBoot -- Platform
* Java       -- Language
* PostgreSQL -- DataBase
* Hibernet   -- ORM
* Bcrypt     -- Hashing
* jwt        -- Autheentication
* Heroku     -- Deployment

## Database setup :
```SQL
$create database cabDB;
$create user cabUser with encrypted password 'cabPass';
$grant all privileges on database cabDB to cabUser;
```
## Running and Installation of the app
java amd maven should have to be installed before runnig the application 
```$mvn spring-boot:run```
