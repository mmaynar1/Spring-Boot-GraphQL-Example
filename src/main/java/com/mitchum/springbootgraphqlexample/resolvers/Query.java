package com.mitchum.springbootgraphqlexample.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.mitchum.springbootgraphqlexample.enums.Job;
import com.mitchum.springbootgraphqlexample.model.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Query implements GraphQLQueryResolver
{
   public List<Employee> employees() {
      List<Employee> employees = new ArrayList<>();

      Employee employee = new Employee();
      employee.setId(1L);
      employee.setName("Jim Halpert");
      employee.setAge(30);
      employee.setType( Job.SALESMAN );

      employees.add(employee);

      return employees;
   }
}
