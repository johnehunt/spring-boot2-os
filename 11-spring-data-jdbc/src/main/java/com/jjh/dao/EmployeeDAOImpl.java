package com.jjh.dao;

import com.jjh.domain.Employee;
import com.jjh.domain.EmployeeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Component("employeeDao")
public class EmployeeDAOImpl implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public EmployeeDAOImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<>();
		String sql = "SELECT * FROM employee";
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
		Iterator<Map<String, Object>> it = list.iterator();
		while (it.hasNext()) {
			Map<String, Object> map = it.next();
			String name = (String) map.get("name");
      int employeeId = (Integer) map.get("id");
			Employee employee = new EmployeeImpl(employeeId, name);
			employees.add(employee);
		}
		return employees;
	}

	public int addEmployee(Employee e) {
		String sql = "INSERT INTO employee (id, name) values (?,?)";
		int c = jdbcTemplate.update(sql, e.getId(), e.getName());
		return c;
	}

	// ---------------------------------------------------------------
	// Using a mapper
	// ---------------------------------------------------------------

	public List<Employee> getAltEmployees() {
		String sql = "SELECT * FROM employee";
		RowMapper<Employee> rowMapper = new EmployeeMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	static class EmployeeMapper implements RowMapper<Employee> {

		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			String name = rs.getString("name");
			int id = rs.getInt("id");
			return new EmployeeImpl(id, name);
		}

	}

}
