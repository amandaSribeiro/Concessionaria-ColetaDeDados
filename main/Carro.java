package br.edu.fatec.concessionaria.main;
	
public class Carro {		
	private String marca;
	private String modelo;
	private Integer ano;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public void imprimirDados() {
		System.out.println("Marca do carro: " + getMarca());
		System.out.println("Modelo do carro: " + getModelo());
		System.out.println("Ano do carro: " + getAno());
		}
	}
