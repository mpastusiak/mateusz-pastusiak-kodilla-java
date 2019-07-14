package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class Facade {

    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> getCompaniesByPartOfName(final String arg) {
        List<Company> result = companyDao.retrieveCompaniesByPartOfName(arg);
        LOGGER.info("Companies with part of name - " + arg + " : \n" + result.toString());
        return result;
    }

    public List<Employee> getEmployeesByPartOfName(final String arg) {
        List<Employee> result = employeeDao.retrieveEmployeesByPartOfName(arg);
        LOGGER.info("Employees with part of name - " + arg + " : \n" + result.toString());
        return result;
    }

}