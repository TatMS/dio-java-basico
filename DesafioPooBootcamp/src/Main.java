import brComDioDesafioDominio.Mentoria;

import java.time.LocalDate;

import brComDioDesafioDominio.Bootcamp;
import brComDioDesafioDominio.Conteudo;
import brComDioDesafioDominio.Curso;
import brComDioDesafioDominio.Dev;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição Curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da Mentoria de Java");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev devTatiana = new Dev();
        devTatiana.setNome("Tatiana");
        devTatiana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Tatiana: " + devTatiana.getConteudosInscritos());
        
        devTatiana.progredir();
        devTatiana.progredir();
        devTatiana.progredir();
        System.out.println("-");

        System.out.println("Conteúdos Inscritos de Tatiana: " + devTatiana.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Tatiana: " + devTatiana.getConteudosConcluidos());
        System.out.println("XP: " + devTatiana.calcularTotalXp());

        System.out.println("..............................................................");

        Dev devBruno = new Dev();
        devBruno.setNome("Bruno");
        devBruno.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Bruno: " + devBruno.getConteudosInscritos());
        
        devBruno.progredir();
        System.out.println("-");
        
        System.out.println("Conteúdos Inscritos de Bruno: " + devBruno.getConteudosInscritos());
        System.out.println("Conteúdos Conluídos de Bruno: " + devBruno.getConteudosConcluidos());
        System.out.println("XP: " + devBruno.calcularTotalXp());
    }
}
