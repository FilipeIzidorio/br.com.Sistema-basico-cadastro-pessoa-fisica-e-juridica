package Main;

import Model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner copia = new Scanner(System.in);
        System.out.println("*****************************************************************");
        System.out.println("  BEM-VINDO AO SISTEMA DE CADASTROS DE PESSOAS FISICA E JURIDICA ");
        System.out.println("*****************************************************************");
        String menu = """
                1 - ENTRAR
                2 - SAIR
                """;

        System.out.println(menu);
        System.out.print("DIGITE A OPCAO QUE DESEJA: ");
        int opcao;
        opcao = copia.nextInt();

        while (true){

            switch (opcao) {
                case 1 -> {
                    System.out.println("*********************");
                    System.out.println(" MENU PRINCIPAL ");
                    System.out.println("*********************\n");
                    System.out.println("ESCOLHA UMA OPCAO ABAIXO\n");
                    String cadastro =
                            """
                                    1 - PESSOA FISICA
                                    2 - PESSOA JURIDICA
                                    3 - SAIR
                                   """;
                    System.out.println(cadastro);
                    int opcao1;
                    System.out.print("\nDIGITE UMA OPCAO:");
                    opcao1 = copia.nextInt();
                    if (opcao1 == 1) {
                        ClienteFisico clienteFisico = new ClienteFisico("LUIZ FELIPE IZIDORIO","015.251.485-20","358548","PPD","58900-000","PB","CAJAZEIRAS",
                                "JARDIM OASIS","AV.JULIO MARQUES","S/C",false,"20/09/2022");

                        Contato contatoFisico = new Contato("(83)9-9155-1014","fisico@gmail.com");
                        Sexo sexo = new Sexo("MASCULINO");
                        System.out.println("\n"+clienteFisico);
                        System.out.println(contatoFisico +" "+ sexo);
                        break;

                    }else if (opcao1 == 2){
                        ClienteJuridico clienteJuridico = new ClienteJuridico(true,"20/08/2020","20.776.245/0001-25",
                                "TULIO MARQUES","TULIO DEDETIZACAO","101030","202302","58900-000","PB","CZ",
                                "CRISTO","RUA CRISTO REI","RUA DAS ALMAS");
                        System.out.println("\n"+clienteJuridico);
                        Contato contatoJuridico = new Contato("(83)9-9588-8542","dedetizacao0800@gmail.com");
                        System.out.println(contatoJuridico);
                        break;
                    } else if (opcao1==3) {
                        System.out.println("*********************");
                        System.out.println("    SAINDO... ");
                        System.out.println("*********************");
                        System.exit(0);

                    } else
                        System.out.println("\nOPCAO INVALIDA");
                        System.out.println("\n*********************");
                        System.out.println("DIGITE UMA OPCAO VALIDA");
                    System.out.println("*********************");
                }
                case 2 -> {
                    System.out.println("*********************");
                    System.out.println("    SAINDO... ");
                    System.out.println("*********************");
                    System.exit(0);

                }
                default -> {
                    System.out.println("OPCAO INVALIDA!\n");
                    System.exit(0);
                }


            }


        }
    }

}
