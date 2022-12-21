package com.projetos.agendatelefonica.agenda;

import java.util.Scanner;

public class TesteAgenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

        System.out.println("Digite o nome da sua agenda: ");
        agenda.setNome(sc.next());

        Contato[] contatos = new Contato[3];
        for (int i = 0; i < contatos.length; i++) {
            Contato c = new Contato();

            System.out.println("Insira o nome do contato " + (i+1));
            c.setNome(sc.next());

            System.out.println("Insira o telefone do contato " + (i+1));
            c.setTelefone(sc.next());

            System.out.println("Insira o e-mail do contato " + (i+1));
            c.setEmail(sc.next());

            contatos[i] = c;
        }

        agenda.setContatos(contatos);

        if ( agenda != null) {
            System.out.println(agenda.mostrarInformacoes());
        }

    }
}
