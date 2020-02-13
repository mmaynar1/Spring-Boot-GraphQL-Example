package com.mitchum.springbootgraphqlexample.model;

import com.mitchum.springbootgraphqlexample.enums.Job;

import java.util.List;

public class Employee
{
   private long id;
   private String name;
   private Job type;
   private int age;
   private List<String> likes;

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

   public List<String> getLikes()
   {
      return likes;
   }

   public void setLikes( List<String> likes )
   {
      this.likes = likes;
   }
}
