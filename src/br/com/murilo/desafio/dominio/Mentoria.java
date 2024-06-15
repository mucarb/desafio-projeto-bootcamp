package br.com.murilo.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

	private LocalDate data;

	@Override
	public double calcularXP() {
		return XP_PADRAO + 20d;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria {Título: " + getTitulo() + "Descrição: " + getDescricao() + ", Data Mentoria: " + data
				+ "}";
	}

}
