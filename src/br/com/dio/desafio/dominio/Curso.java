package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int carhaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * carhaHoraria;
    }

    public Curso() {
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
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", carhaHoraria=" + carhaHoraria +
                '}';
    }
}
