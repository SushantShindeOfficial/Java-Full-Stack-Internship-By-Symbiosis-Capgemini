package jdbc.homework.java.demo.serviceImple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashSet;
import java.util.Set;

import jdbc.homework.java.demo.dbconnection.DBConnection;
import jdbc.homework.java.demo.entity.Employee;
import jdbc.homework.java.demo.service.EmployeeDao;

public class EmployeeDaoImpl
implements EmployeeDao {

    Set<Employee> set =
            new HashSet<Employee>();

    @Override
    public void addEmployee(Employee e) {

        try {

            if(set.add(e)) {

                Connection con = DBConnection.getConnection();

                String sql =
                        "insert into employee values(?,?,?)";

                PreparedStatement ps = con.prepareStatement(sql);

                ps.setInt(1,e.getId());

                ps.setString(2,e.getName());

                ps.setDouble(3,e.getSalary());

                ps.executeUpdate();

                System.out.println(
                        "Inserted");

            } else {

                System.out.println(
                        "Duplicate Employee");
            }

        } catch(Exception ex) {

            ex.printStackTrace();
        }
    }
}