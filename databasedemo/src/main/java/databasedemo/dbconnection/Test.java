package databasedemo.dbconnection;

public class Test {
	public static void main(String[] args) {
		//DBCONection d1=new DBCONection();
	}
}


//Result Set-Execute query will store data in result Set
//Execute query-it will execute or work with select statement only,it will store data in result Set
//
//driver
//com.mysql.jdbc.Driver
//java.sql package
//Connection => interface
//Drivermanager=> class
//getConnection=> it is static method
//Statement createStatement => It will send only static query
//PreparedStatement => interface
//PreparedStatement prepareStatement(String sql)=> it will send dynamic sql query or parameterized
//
//CallableStatement prepareCall(String sql) => it will send SP as query
//
//Statement => interface
//executeQuery(String sql); =>it will execute select statement only & store data in result set.it will help to fetch the data
//




//driver: JDBC driver is used to establish connection between Java application and database
//com.mysql.jdbc.Driver: Old MySQL JDBC driver class (deprecated, replaced by com.mysql.cj.jdbc.Driver)

//java.sql package: Contains interfaces and classes for JDBC database connectivity

//Connection (interface): Represents a connection/session between Java application and database

//DriverManager (class): Manages database drivers and establishes connection to database

//getConnection(): Static method used to create and return a database connection

//static query: SQL query is fixed/hardcoded and does not change at runtime (used in Statement)
//dynamic query: SQL query is parameterized and values can change at runtime (used in PreparedStatement)

//Statement (interface): Used to execute static SQL queries without parameters

//createStatement(): Method of Connection used to create Statement object

//PreparedStatement (interface): Used to execute parameterized (dynamic) SQL queries

//prepareStatement(String sql): Method to create PreparedStatement for dynamic queries

//CallableStatement (interface): Used to execute stored procedures in database

//prepareCall(String sql): Method to create CallableStatement for calling stored procedures

//executeQuery(String sql): Executes SELECT query and returns ResultSet to fetch data