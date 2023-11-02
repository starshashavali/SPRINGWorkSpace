package com.org.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.org.dao.UserDao;
import com.org.domain.Employee;

@Repository
public class EmployeeDAOImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

	public void saveEmployee(Employee employee) {
	    String sql = "INSERT INTO employee (name, address) VALUES (?, ?)";
        jdbcTemplate.update(sql, employee.getName(), employee.getAddress());
    }

	public Employee getEmployeeById(Integer id) {
        String sql = "SELECT * FROM employee WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) -> {
            Employee employee = new Employee();
            employee.setId(rs.getInt("id"));
            employee.setName(rs.getString("name"));
            employee.setAddress(rs.getString("address"));
            return employee;
        });
    }
    

	@Override
	public void updateEmployee(Employee employee) {
	     String sql = "UPDATE employee SET name = ?, address = ? WHERE id = ?";
	        jdbcTemplate.update(sql, employee.getName(), employee.getAddress(), employee.getId());
	    }

	@Override
	public void deleteEmployee(int id) {
		   String sql = "DELETE FROM employee WHERE id = ?";
	        jdbcTemplate.update(sql, id);		
	}


}

