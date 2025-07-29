package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo;
    private String descricao;
    private int carhaHoraria;

    public Curso() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCarhaHoraria() {
        return carhaHoraria;
    }

    public void setCarhaHoraria(int carhaHoraria) {
        this.carhaHoraria = carhaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", carhaHoraria=" + carhaHoraria +
                '}';
    }
}
