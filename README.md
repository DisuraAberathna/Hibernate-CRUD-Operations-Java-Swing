# Hibernate CRUD Operations with Java Swing

This project demonstrates basic CRUD (Create, Read, Update, Delete) operations using Hibernate ORM in a Java Swing desktop application. The project is built with **Java Ant** in **NetBeans** and uses a MySQL database for data storage.

## Features

- Create new records in the database
- Read and display existing records
- Update selected records
- Delete selected records
- User-friendly interface built with Java Swing
- Hibernate ORM for database operations

## Requirements

To run this project, you will need:

- **Java Development Kit (JDK) 8 or higher**
- **NetBeans IDE** (or any IDE supporting Ant-based projects)
- **MySQL Database** (or another relational database)
- **Hibernate ORM** for database operations

## Project Setup

### Clone the Repository
  
  ```bash
  git clone https://github.com/your-username/Hibernate-CRUD-Operations-Java-Swing.git
  cd Hibernate-CRUD-Operations-Java-Swing
  ```

### Configure the Database
  Ensure MySQL is installed and running on your system. Create a database for the project:
  
  ```sql
  CREATE DATABASE hibernate_crud;
  ```

  Update the Hibernate configuration file (src/hibernate.cfg.xml) with your database connection details:
  ```xml
  <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/hibernate_crud</property>
  <property name="hibernate.connection.username">your-username</property>
  <property name="hibernate.connection.password">your-password</property>
  ```
### Open Project in NetBeans
  Open NetBeans.
  Select File -> Open Project and navigate to the cloned project folder.
  Click Open to load the project.

### Configure Hibernate Dependencies
  Make sure your lib folder contains the required Hibernate and MySQL connector JAR files. If not, download the following JAR files:
  
  Hibernate ORM (hibernate-core)
  MySQL Connector J (mysql-connector-java)
  Place the JAR files in the lib folder of your project.

### Build and Run the Project
  Once the project is loaded in NetBeans:
  
  Right-click the project and select Clean and Build to ensure all dependencies are properly configured.
  Right-click the project again and select Run to start the application.

### Folder Structure
  ```
  ├── build.xml
  ├── src
  │   └── model
  │   └── entity
  │   └── gui
  │   └── hibernate.cfg.xml
  ├── lib
  │   ├── hibernate-libs...
  │   ├── mysql-connector-java.jar
  └── README.md
```

### CRUD Operations
  Create: Add new entries to the database via the form.
  Read: View existing entries in a table.
  Update: Modify selected records and save the changes.
  Delete: Remove selected records from the database.

### How to Use the Application
  Add New Record: Fill out the form fields and click Add.
  Update Record: Select a record, modify it in the form, and click Update.
  Delete Record: Select a record and click Delete to remove it.
  View Records: The table will display records from the database.

### Technologies Used
  Java 8+
  Swing: For the graphical user interface.
  Hibernate ORM: For managing database operations.
  MySQL: As the relational database.
  Ant: For build automation.
  NetBeans IDE: For project development.
