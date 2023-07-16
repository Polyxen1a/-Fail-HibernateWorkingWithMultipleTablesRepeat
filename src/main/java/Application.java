import dao.CityDAOImpl;
import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import model.City;
import model.Employee;

import java.sql.SQLException;


public class Application {
    public static void main(String[] args) throws SQLException {

        EmployeeDAO employeeDao = new EmployeeDAOImpl();
        CityDAO cityDao = new CityDAOImpl();

        City city1 = new City("Moscow");
        cityDao.createCity(city1);

        City cityForEmployee = cityDao.getByIdCity(1);

        Employee employee = new Employee("Darya", "Androva", "woman", 25);

        employee.setCityId(cityForEmployee);

        employeeDao.create(employee);

        cityDao.deleteCity(cityForEmployee);
    }
}
