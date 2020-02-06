package com.mitchum.springbootgraphqlexample.model;

import com.mitchum.springbootgraphqlexample.enums.Job;

public class Employee
{
   private long id;
   private String name;
   private Job type;
   private int age;

   public long getId()
   {
      return id;
   }

   public void setId( long id )
   {
      this.id = id;
   }

   public String getName()
   {
      return name;
   }

   public void setName( String name )
   {
      this.name = name;
   }

   public Job getType()
   {
      return type;
   }

   public void setType( Job type )
   {
      this.type = type;
   }

   public int getAge()
   {
      return age;
   }

   public void setAge( int age )
   {
      this.age = age;
   }
}
