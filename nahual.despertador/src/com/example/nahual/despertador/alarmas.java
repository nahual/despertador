package com.example.nahual.despertador;

public class alarmas {
	
	private static alarmas instance = null;
	   protected alarmas() {
	   }
	   public static alarmas getInstance() {
	      if(instance == null) {
	         instance = new alarmas();
	      }
	      return instance;
	   }
	   
	   
}