package com.mitchum.springbootgraphqlexample.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.mitchum.springbootgraphqlexample.enums.Job;
import com.mitchum.springbootgraphqlexample.model.AddEmployeeResponse;
import com.mitchum.springbootgraphqlexample.model.Employee;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Query implements GraphQLQueryResolver
{
   public List<Employee> employees()
   {
      /*
      {
         employees{
			   id
            name
            type
            likes
         }
      }
      */
      List<Employee> employees = getEmployees();
      return employees;
   }

   public Employee employeeById( long id )
   {
      /*
      {
         employeeById(id:1) {
            name
            age
      	   type
    		   likes
         }
      }
       */
      List<Employee> employees = getEmployees();
      Employee result = new Employee();
      for ( Employee employee : employees )
      {
         if ( employee.getId() == id )
         {
            result = employee;
            break;
         }
      }
      return result;
   }

   public AddEmployeeResponse addEmployee( Employee employee )
   {
      /*
      {
         addEmployee(employee: {id:3, type: ACCOUNTANT, name: "Kevin Malone"  }) {
			   employee {
               name
               id
            }
    	      message
         }
      }
       */

      AddEmployeeResponse response = new AddEmployeeResponse();
      response.setEmployee( employee );
      response.setMessage( "Success!" );
      return response;
   }

   @NotNull
   private List<Employee> getEmployees()
   {
      List<Employee> employees = new ArrayList<>();

      Employee employee = new Employee();
      employee.setId( 1L );
      employee.setName( "Jim Halpert" );
      employee.setAge( 30 );
      employee.setType( Job.SALESMAN );
      List<String> likes = new ArrayList<>();
      likes.add( "Pam" );
      likes.add( "Philly sports" );
      likes.add( "Pranks" );
      employee.setLikes( likes );
      employees.add( employee );


      Employee employee1 = new Employee();
      employee1.setId( 2L );
      employee1.setName( "Dwight Shrute" );
      employee1.setAge( 30 );
      employee1.setType( Job.SALESMAN );
      List<String> likes1 = new ArrayList<>();
      likes1.add( "Bears" );
      likes1.add( "Beets" );
      likes1.add( "Battlestar Galactica" );
      employee1.setLikes( likes1 );
      employees.add( employee1 );
      return employees;
   }
}
