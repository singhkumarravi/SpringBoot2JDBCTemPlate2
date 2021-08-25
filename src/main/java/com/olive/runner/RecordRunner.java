package com.olive.runner;

import java.sql.ResultSet;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.olive.mapper.PersonRowMapper;
import com.olive.model.Person;
@Component
public class RecordRunner implements CommandLineRunner{
	@Autowired
	JdbcTemplate temp;
	
	@Override
	public void run(String... args) throws Exception {
		      String sql="select * from Person where id=?"; 
		      
		      PersonRowMapper personRowMapper = new PersonRowMapper();
		      /*
	          List<Person> list = temp.query(sql,personRowMapper);
	          
	          //1.iterator java 1.2 verson
	            
	         Iterator<Person> iterator = list.iterator();
	          while(iterator.hasNext()){
	        	   Person p  =iterator.next();
	        	   System.out.println("Record :: " + p);
	          }  
	          
	          
	            /*
	       //2 for each method java 1.5
	          for(Person s:list) {
	        	  System.out.println(" Record1 " + s);
	          }
	        
	          //3 foreach method java 8
	       //     list.forEach(System.out::println);
	        
		 /*
		  * lambda expression technic     
		  */
		      /*
	          temp.query(sql, (rs,rowNum)->{
	        	return  new Person(rs.getInt("id"),
	        			rs.getString("firstName")
	        			,rs.getString("lastname"),
	        			rs.getString("city"),
	        			rs.getString("address")
	        			);
	        	}
	          ).forEach(System.out::println);
	      */
		      
	  //  Getting one record from DB
		  /*
	     Person query = temp.queryForObject(sql, personRowMapper, 10);    
	     System.out.println(query);
	     */
	}

}
