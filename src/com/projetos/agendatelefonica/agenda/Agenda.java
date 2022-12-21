package com.projetos.agendatelefonica.agenda;

public class Agenda {

    private String nome;
    private Contato[] contatos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public Contato[] getContatos() {

        return contatos;
    }

    public void setContatos(Contato[] contatos) {

        this.contatos = contatos;
    }

    public String mostrarInformacoes() {
        String info = "Agenda - " + nome + "\n";
        if (contatos != null) {
            for (Contato listaAgenda : contatos) {
                info += listaAgenda.mostrarInformacoes();
            }
        }

        return info;
    }
}
