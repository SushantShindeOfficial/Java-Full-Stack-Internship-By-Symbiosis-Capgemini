package jdbc.homework.java.demo.dbconnection;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection
implements Serializable {

    public static Connection
    getConnection() {

        Connection con = null;

        try {

            Class.forName(
                    "com.mysql.cj.jdbc.Driver");

            con =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/companydb",
                            "root",
                            "1234");

        } catch(Exception e) {

            e.printStackTrace();
        }

        return con;
    }
}