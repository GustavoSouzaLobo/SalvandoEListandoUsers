package Exercicio1;

import java.util.ArrayList;
import java.util.List;
import Exercicio1.model.Usuario;
import java.util.Scanner;

public class business {
    private static List<Usuario> bancoDeDados = new ArrayList<>();

    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Gustavo", "gustavo@gmail.com", "123456", true);
        Usuario usuario2 = new Usuario("Deise", "deise@gmail.com", "abcdef", false);
        Usuario usuario3 = new Usuario("Dalva", "dalva@gmail.com", "senha123", false);


        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(usuario1);
        listaUsuarios.add(usuario2);
        listaUsuarios.add(usuario3);


        System.out.println("Usuários cadastrados com sucesso.");


        listarUsuariosCadastrados(listaUsuarios);


        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1| Salvar lista de usuários");
            System.out.println("2| Listar usuários cadastrados");
            System.out.println("3| Excluir usuário pelo nome");
            System.out.println("4| Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    salvarUsuarios(listaUsuarios);
                    System.out.println("Lista de usuários salva com sucesso.");
                    break;
                case 2:
                    listarUsuariosCadastrados(listaUsuarios);
                    break;
                case 3:
                    excluirUsuarioPeloNome(listaUsuarios);
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

    }


    public static void salvarUsuarios(List<Usuario> usuarios) {
        bancoDeDados.clear();
        bancoDeDados.addAll(usuarios);
    }


    public static void listarUsuariosCadastrados(List<Usuario> usuarios) {
        System.out.println("Usuários cadastrados:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getNome() + " - " + usuario.getEmail() + " - " + (usuario.isModerador() ? "Moderador" : "Usuário comum"));
        }
    }


    public static void excluirUsuarioPeloNome(List<Usuario> usuarios) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do usuário que deseja excluir: ");
        String nomeUsuario = scanner.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getNome().equalsIgnoreCase(nomeUsuario)) {
                usuarios.remove(i);
                encontrado = true;
                System.out.println("Usuário " + nomeUsuario + " removido com sucesso.");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Usuário não encontrado.");
        }
    }
}
