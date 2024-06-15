import java.time.LocalDate;

import br.com.murilo.desafio.dominio.Bootcamp;
import br.com.murilo.desafio.dominio.Curso;
import br.com.murilo.desafio.dominio.Dev;
import br.com.murilo.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso = new Curso();
		curso.setTitulo("Curso Java");
		curso.setDescricao("Descrição do curso Java!");
		curso.setCargaHoraria(8);

		Curso curso1 = new Curso();
		curso1.setTitulo("Curso JS");
		curso1.setDescricao("Descrição do curso JS!");
		curso1.setCargaHoraria(4);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descrição da Mentoria Java!");
		mentoria.setData(LocalDate.now());

		/*
		 * System.out.println(curso); System.out.println(curso1);
		 * System.out.println(mentoria);
		 */

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição bootcamp Java Developer");
		bootcamp.getConteudos().add(curso);
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(mentoria);

		Dev dev = new Dev();
		dev.setNome("Murilo");
		dev.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos " + dev.getNome() + " " + dev.getConteudosInscritos());
		dev.progredir();
		dev.progredir();
		dev.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos " + dev.getNome() + " " + dev.getConteudosInscritos());
		System.out.println("Conteúdos concluídos " + dev.getNome() + " " + dev.getConteudosConcluidos());
		System.out.println("XP: " + dev.calcularXp());

		System.out.println("-------------------------------");

		Dev dev1 = new Dev();
		dev1.setNome("Marcos");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos " + dev1.getNome() + " " + dev1.getConteudosInscritos());
		dev1.progredir();
		dev1.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos " + dev1.getNome() + " " + dev1.getConteudosInscritos());
		System.out.println("Conteúdos concluídos " + dev1.getNome() + " " + dev1.getConteudosConcluidos());
		System.out.println("XP: " + dev1.calcularXp());
	}

}
