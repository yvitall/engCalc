import java.util.Locale;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    double areaParede;
    double areaEsquadria;
    double areaRevestimento;
    String descServico;

    public void showMenu() {
        System.out.println("===== ENG CALC - SYSTEM =====");
        System.out.print("Título Obra: ");
        descServico = sc.nextLine();
        int option1 = -1;

        while (option1 != 0) {
            System.out.println("1. CALCULAR ÁREA DA PAREDE\n2. CALCULAR QUANTIDADE DE REVESTIMENTO\n0. SAIR");
            System.out.print("Escolha uma opção: ");
            option1 = sc.nextInt();
            sc.nextLine();

            switch (option1) {
                case 1: {
                    fluxoCalculoParede();
                    break;
                }
                case 2: {

                }
                case 0: {
                    System.out.println("Encerrando programa.\n Desenvolvido por Yuri Vital");
                    break;
                }
            }
        }
    }

    public void fluxoCalculoParede() {
        Parede parede = new Parede();
        System.out.print("Digite a ALTURA da PAREDE (ex.: 3.72): ");
        double altParede = sc.nextDouble();
        parede.setterAlturaParede(altParede);
        System.out.print("Digite a LARGURA da PAREDE (ex.: 8.66): ");
        double largParede = sc.nextDouble();
        sc.nextLine();
        parede.setterLarguraParede(largParede);
        areaParede = parede.calcularArea();

        System.out.print("Há algum tipo de ESQUADRIA (sim/não): ");
        String option2 = sc.nextLine();
        if (option2.equalsIgnoreCase("Sim")) {
            System.out.print("Qual tipo da ESQUADRIA\n1.Janela\n2.Porta\n");
            int option3 = sc.nextInt();
            sc.nextLine();
            switch (option3) {
                case 1: {
                    String typeOfEsquadria = "JANELA";
                    System.out.printf("Digite a ALTURA da %s (ex.: 1.54): ", typeOfEsquadria);
                    Esquadria esquadria = new Esquadria();
                    double altEsquadria = sc.nextDouble();
                    sc.nextLine();
                    esquadria.setterAlturaEsquadria(altEsquadria);
                    System.out.print("\nDigite a LARGURA da ESQUADRIA (ex.: 2.26): ");
                    double largEsquadria = sc.nextDouble();
                    sc.nextLine();
                    esquadria.setterLarguraEsquadria(largEsquadria);

                    areaEsquadria = esquadria.calcularArea();
                    areaRevestimento = areaParede - areaEsquadria;

                    for (int i = 0; i < 50; ++i) System.out.println();
                    System.out.println("===== RELATÓRIO PAREDE =====");
                    System.out.printf("Área PAREDE: %.2fm²\n", areaParede);
                    System.out.printf("Área %s: %.2fm²\n", typeOfEsquadria, areaEsquadria);
                    System.out.printf("Área Total para REVESTIMENTO: %.2fm²\n", areaRevestimento);

                    break;
                }
                case 2: {
                    String typeOfEsquadria = "PORTA";
                    System.out.printf("Digite a ALTURA da %s (ex.: 1.54): ", typeOfEsquadria);
                    Esquadria esquadria = new Esquadria();
                    double altEsquadria = sc.nextDouble();
                    sc.nextLine();
                    esquadria.setterAlturaEsquadria(altEsquadria);
                    System.out.print("Digite a LARGURA da ESQUADRIA (ex.: 2.26): ");
                    double largEsquadria = sc.nextDouble();
                    sc.nextLine();
                    esquadria.setterLarguraEsquadria(largEsquadria);

                    areaEsquadria = esquadria.calcularArea();
                    areaRevestimento = areaParede - areaEsquadria;

                    for (int i = 0; i < 50; ++i) System.out.println();
                    System.out.println("===== RELATÓRIO PAREDE =====");
                    System.out.printf("Área PAREDE: %.2fm²\n", areaParede);
                    System.out.printf("Área %s: %.2fm²\n", typeOfEsquadria, areaEsquadria);
                    System.out.printf("Área Total para REVESTIMENTO: %.2fm²\n\n", areaRevestimento);


                    break;
                }
            }
        } else {
            for (int i = 0; i < 50; ++i) System.out.println();
            System.out.println("===== RELATÓRIO PAREDE =====");
            System.out.printf("Área PAREDE: %.2fm²\n", areaParede);
            System.out.printf("Área Total para REVESTIMENTO: %.2fm²\n\n", areaParede);

        }

    }
}

