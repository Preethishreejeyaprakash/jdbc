# JDBC Example Project

## Overview

This is a simple Java project that demonstrates how to connect to a MySQL database using JDBC (Java Database Connectivity) and perform a basic query.

## Project Structure

- jdbc.java: The main Java class that contains the JDBC code.

## Prerequisites

- MySQL Server installed and running on localhost (default port 3306)
- MySQL JDBC Driver installed (included in this project)
- Java Development Kit (JDK) installed

## Configuration

- Update the url, userName, and passWord variables in the jdbc.java file to match your MySQL database credentials.
- Create a database named jdbcjava and a table named employee with columns id, name, and salary.

## How to Run

1. Compile the Java file using javac jdbc.java
2. Run the Java program using java jdbc
3. The program will connect to the MySQL database, execute the query, and print the results to the console.

## Code Explanation

- The program loads the MySQL JDBC driver using Class.forName().
- It establishes a connection to the database using DriverManager.getConnection().
- It creates a Statement object to execute the query.
- It executes the query using st.executeQuery() and stores the result in a ResultSet object.
- It iterates over the result set using rs.next() and prints the column values using rs.getInt() and rs.getString().

## License

This project is licensed under the MIT License. Feel free to use and modify the code as needed.
