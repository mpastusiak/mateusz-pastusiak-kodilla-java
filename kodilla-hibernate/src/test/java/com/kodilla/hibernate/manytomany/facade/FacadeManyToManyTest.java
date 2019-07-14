package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeManyToManyTest {

    @Autowired
    Facade facade;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testShouldGetListOfCompaniesByPartOfName() {
        //Given
        Company company1 = new Company("Super Company");
        Company company2 = new Company("Extra Company");
        Company company3 = new Company("Big Company");
        Company company4 = new Company("Truper Company");

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);
        companyDao.save(company4);

        //When
        List<Company> companyListResult = facade.getCompaniesByPartOfName("up");

        //Then
        Assert.assertEquals(2, companyListResult.size());

        //CleanUp
        companyDao.delete(company1);
        companyDao.delete(company2);
        companyDao.delete(company3);
        companyDao.delete(company4);
    }

    @Test
    public void testShouldGetListOfEmployeesByPartOfName() {
        //Given
        Employee employee1 = new Employee("Jan", "Kowalski");
        Employee employee2 = new Employee("Maria", "Nowak");
        Employee employee3 = new Employee("Jacek", "Ratajski");
        Employee employee4 = new Employee("Bogumiła", "Jabłczyńska");

        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);
        employeeDao.save(employee4);

        //When
        List<Employee> employeeListResult = facade.getEmployeesByPartOfName("ja");

        //Then
        Assert.assertEquals(3, employeeListResult.size());

        //CleanUp
        employeeDao.delete(employee1);
        employeeDao.delete(employee2);
        employeeDao.delete(employee3);
        employeeDao.delete(employee4);

    }
}