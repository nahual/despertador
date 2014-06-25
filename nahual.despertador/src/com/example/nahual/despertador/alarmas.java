package com.example.nahual.despertador;

import java.util.ArrayList;

public class alarmas 
{
	ArrayList<alarma> listado = new ArrayList<alarma>();
	
	private static alarmas instance = null;
	   protected alarmas() 
	   {
	   }
	   public static alarmas getInstance() 
	   {
	      if(instance == null) {
	         instance = new alarmas();
	      }
	      return instance;
	   }
	   
	   
}