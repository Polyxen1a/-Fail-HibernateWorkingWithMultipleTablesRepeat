import dao.CityDAOImpl;
import dao.CityDao;
import dao.CityDaoImpl;
import dao.EmployeeDao;
import model.City;
import model.Employee;

import java.sql.SQLException;
import java.util.List;


public class Application {
    public static void main(String[] args, Object o) throws SQLException {

        EmployeeDao employeeDao = new EmployeeDao();
        CityDao cityDao = new CityDaoImpl();

        City city1 = new City("Moscow");
        ((CityDaoImpl) cityDao).createCity(city1);

        City cityForEmployee = ((CityDaoImpl) cityDao).getByIdCity(1);

        Employee employee = new Employee("Darya", "Androva", "woman", 25);

    }
}
