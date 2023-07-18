package model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "employee")

public abstract class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "gender")
    private String gender;
    @Column(name = "age")
    private int age;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id")
    private City cityId;

    public String Employee(String firstName, String lastName, String gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        public Employee() {
        }

        public int getId () {
            return id;
        }
        public void setId ( int id){
            this.id = id;
        }
        public String getFirstName () {
            return firstName;
        }
        public void setFirstName (String firstName){
            this.firstName = firstName;
        }
        public String getLastName () {
            return lastName;
        }
        public void setLastName (String lastName){
            this.lastName = lastName;
        }
        public String getGender () {
            return gender;
        }
        public void setGender (String gender){
            this.gender = gender;
        }
        public int getAge () {
            return age;
        }
        public void setAge ( int age){
            this.age = age;
        }
        public void setCityId (City cityId){
            this.cityId = cityId;
        }

        public boolean getCityId () {
            return cityId;
        }
    }
        public boolean equals (Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return Objects.equals(id, employee.id) && Objects.equals(firstName, employee.firstName)
                    && Objects.equals(lastName, employee.lastName) && Objects.equals(gender, employee.gender)
                    && Objects.equals(age, employee.age) && Objects.equals(cityId, employee.cityId);


        }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }


    public abstract Employee getById(int id);

    public abstract List<Employee> getAllEmployees();

    public abstract void updateEmployee(Employee employee);

    public abstract void deleteEmployee(Employee employee);

    public void setCityId(City cityForEmployee) {
    }
}

    public abstract void create(Employee employee);