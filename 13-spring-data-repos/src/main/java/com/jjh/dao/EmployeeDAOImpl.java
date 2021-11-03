package com.jjh.dao;

import com.jjh.domain.Employee;
import com.jjh.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component("employeeDao")
public class EmployeeDAOImpl implements EmployeeDAO {

    private EmployeeRepository repo;

    @Autowired
    public void setRepo(EmployeeRepository repo) {
        this.repo = repo;
    }

    public Employee findById(int id) {
        Optional<Employee> opt = this.repo.findById(id);
        return opt.orElse(null);
    }

    public List<Employee> findAll() {
        ArrayList<Employee> list = new ArrayList();
        Iterable<Employee> iterator = this.repo.findAll();
        iterator.forEach(list::add);
        return list;
    }

    @Transactional
    public Employee save(Employee emp) {
        this.repo.save(emp);
        return emp;
    }

    @Transactional
    public Employee update(Employee emp) {
        this.repo.save(emp);
        return emp;
    }

    @Transactional
    public void delete(Employee emp) {
        this.repo.delete(emp);
    }

}
