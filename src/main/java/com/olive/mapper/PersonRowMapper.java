package com.olive.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.olive.model.Person;

@Component
public class PersonRowMapper implements RowMapper<Person> {

	@Override
	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		     Person p = new Person();
		     p.setId(rs.getInt("id")); 
		     p.setFirstName(rs.getString("firstName"));
		     p.setLastname(rs.getString("lastname"));
		     p.setCity(rs.getString("city"));
		     p.setAddress("address");
		return p;
	}

}
