package com.mitchum.springbootgraphqlexample.model;

public class AddEmployeeResponse
{
   private Employee employee;
   private String message;

   public Employee getEmployee()
   {
      return employee;
   }

   public void setEmployee( Employee employee )
   {
      this.employee = employee;
   }

   public String getMessage()
   {
      return message;
   }

   public void setMessage( String message )
   {
      this.message = message;
   }
}
