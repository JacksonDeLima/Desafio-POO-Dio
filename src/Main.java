import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCarhaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("Curso Js");
        curso1.setDescricao("Descrição curso js");
        curso1.setCarhaHoraria(6);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Jentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.parse(LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))));

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJackson = new Dev();
        devJackson.setNome("Jackson");
        devJackson.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos Jackson: " + devJackson.getConteudosInscritos());
        devJackson.pregredir();
        devJackson.pregredir();
        devJackson.pregredir();
        System.out.println("-");
        System.out.println("Conteudo Inscritos Jackson: " + devJackson.getConteudosInscritos());
        System.out.println("Conteudo Concluidos Jackson: " + devJackson.getConteudosConcuidos());
        System.out.println("XP: " + devJackson.calcularTotalXP());

        System.out.println("===================================");

        Dev devJulia = new Dev();
        devJulia.setNome("Julia");
        devJulia.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos Julia: " + devJulia.getConteudosInscritos());
        devJulia.pregredir();
        devJulia.pregredir();
        System.out.println("-");
        System.out.println("Conteudo Inscritos Julia: " + devJulia.getConteudosInscritos());
        System.out.println("Conteudo Concluidos Julia: " + devJulia.getConteudosConcuidos());
        System.out.println("XP: " + devJulia.calcularTotalXP());

        System.out.println("===================================");


        Dev devMonica = new Dev();
        devMonica.setNome("Monica");
        devMonica.inscreverBootcamp(bootcamp);
        devMonica.pregredir();
        System.out.println("-");
        System.out.println("Conteudo Inscritos Monica: " + devMonica.getConteudosInscritos());
        System.out.println("Conteudo Concluidos Monica: " + devMonica.getConteudosConcuidos());
        System.out.println("XP: " + devMonica.calcularTotalXP());
    }
}