package com.example.nahual.despertador;

public class alarma 
{
	public alarma(int hora, int minuto, int tono, int volumen) 
	{
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.tono = tono;
		this.volumen = volumen;
	}
	
	private int hora;
	private int minuto;
	private int tono;
	private int volumen;
	
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public int getTono() {
		return tono;
	}
	public void setTono(int tono) {
		this.tono = tono;
	}
	
	
	

}
