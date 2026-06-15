package jdbc.homework.java.demo.serviceImple;

import jdbc.homework.java.demo.entity.Employee;
import jdbc.homework.java.demo.service.EmployeeService;
import jdbc.homework.java.demo.service.EmployeeDao;

public class EmployeeServiceImpl
implements EmployeeService {

    EmployeeDao dao = new EmployeeDaoImpl();

    @Override
    public void addEmployee(Employee e) {

        dao.addEmployee(e);
    }
}