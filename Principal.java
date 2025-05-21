import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("BEM VINDO AO CONVERSOR DE MOEDAS");
        System.out.println("**********************************");

        Principal principal = new Principal();
        principal.geraOpcao();
    }

    public void geraOpcao() throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        GeradorDeAquivos geradorDeArquivos = new GeradorDeAquivos();
        while (true) {
            int opcao = -1;
            try {
                String opcoes = """
                        1) Dólar --> Peso argentino
                        2) Peso argentino --> Dólar
                        3) Dólar --> Real brasileiro
                        4) Real brasileiro --> Dólar
                        5) Dólar --> Peso colombiano
                        6) Peso colombiano --> Dólar
                        7) Sair
                        """;
                System.out.println(opcoes);
                System.out.println("**********************************");
                System.out.println("Digite uma opção válida: ");
                opcao = leitura.nextInt();
            } catch (Exception e) {
                System.out.println("ERRO: Digite apenas numeros inteiros.");
                System.out.println("Fim do programa.");
                break;
            }

            if (opcao >= 1 && opcao <= 6) {
                double valorParaConverter = 0;
                try {
                    System.out.println("Digite o valor que deseja converter: ");
                    valorParaConverter = leitura.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("ERRO: digite apenas números.");
                    break;
                }

                Cambio cambio = null;
                if (opcao == 1) {
                    cambio = new Cambio("USD", "ARS", valorParaConverter);
                    cambio.imprime();
                }
                if (opcao == 2) {
                    cambio = new Cambio("ARS", "USD", valorParaConverter);
                    cambio.imprime();
                }
                if (opcao == 3) {
                    cambio = new Cambio("USD", "BRL", valorParaConverter);
                    cambio.imprime();
                }
                if (opcao == 4) {
                    cambio = new Cambio("BRL", "USD", valorParaConverter);
                    cambio.imprime();
                }
                if (opcao == 5) {
                    cambio = new Cambio("USD", "COP", valorParaConverter);
                    cambio.imprime();
                }
                if (opcao == 6) {
                    cambio = new Cambio("COP", "USD", valorParaConverter);
                    cambio.imprime();
                }
                if (cambio != null) {
                    geradorDeArquivos.registrar(cambio.getMoeda1(), cambio.getMoeda2(), valorParaConverter);
                }
                try {
                    System.out.println("\nDeseja fazer uma nova consulta: 1-sim 2-não");
                    int novaConculta = leitura.nextInt();
                    if (novaConculta == 2) {
                        System.out.println("Fim do programa");
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("ERRO: digite apenas numeros inteiros.");
                    break;
                }

            } else if (opcao == 7) {
                System.out.println("Fim do programa");
                break;
            } else {
                System.out.println("Opção inválida.");
            }

        }
    }
}