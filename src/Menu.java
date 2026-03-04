import java.util.Locale;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    double areaParede;
    double areaEsquadria;
    double areaRevestimento;
    double areaPecaRev;
    String descServico;
    double qtdPecas;
    int qtdPecasCMargem;

    public void showMenu() {
        RecomendacoesUso recomendacoesUso = new RecomendacoesUso();
        recomendacoesUso.verInstrucoes();
        String optionOK = sc.nextLine();
        while (true) {
            if (optionOK.equalsIgnoreCase("OK")) {
                rodarSpinner();
                for (int i = 0; i < 50; ++i) System.out.println();
                System.out.println("===== ENG CALC - SYSTEM =====");
                System.out.print("Título Obra: ");
                descServico = sc.nextLine();
                int option1 = -1;

                while (option1 != 0) {
                    System.out.println("===========================");
                    System.out.println("1. CALCULAR ÁREA DA PAREDE\n2. CALCULAR QUANTIDADE DE REVESTIMENTO\n3. RELATÓRIO GERAL\n0. SAIR");
                    System.out.println("===========================\n");
                    System.out.print("Escolha uma opção: ");
                    option1 = sc.nextInt();
                    sc.nextLine();

                    rodarSpinner();

                    switch (option1) {
                        case 1: {
                            fluxoCalculoParede();
                            break;
                        }
                        case 2: {
                            fluxoCalculoRevestimento();
                            break;
                        }
                        case 3: {
                            relatorioGeral();
                            break;
                        }
                        case 0: {
                            System.out.println("Encerrando programa.\nDesenvolvido por Yuri Vital");
                            break;
                        }
                        default: {
                            System.out.println("Opção inválida. Tente novamente.");
                        }
                    }
                    System.out.println("Deseja ver MENU novamente? (Sim/Não)");
                    String optionRepeat = sc.nextLine();
                    if (optionRepeat.equalsIgnoreCase("Não")) {
                        break;
                    }
                }

            } else if (optionOK.equalsIgnoreCase("CANCELAR")) {
                System.out.println("Execução cancelada.");
                System.out.println("Encerrando programa.\nDesenvolvido por Yuri Vital");
                System.exit(0);
            } else {
                System.out.println("Opção Inválida, tente novamente.");
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
            System.out.print("Qual tipo da ESQUADRIA\n1. JANELA\n2. PORTA\n");
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
                    System.out.printf("Digite a LARGURA da %s (ex.: 2.26): ", typeOfEsquadria);
                    double largEsquadria = sc.nextDouble();
                    sc.nextLine();
                    esquadria.setterLarguraEsquadria(largEsquadria);

                    areaEsquadria = esquadria.calcularArea();
                    areaRevestimento = areaParede - areaEsquadria;
                    rodarSpinner();
                    for (int i = 0; i < 50; ++i) System.out.println();
                    System.out.println("===== RELATÓRIO PAREDE =====");
                    System.out.printf("OBRA: %s\n", descServico);
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

                    esquadria.setterAlturaEsquadria(altEsquadria);
                    System.out.print("Digite a LARGURA da ESQUADRIA (ex.: 2.26): ");
                    double largEsquadria = sc.nextDouble();
                    sc.nextLine();
                    esquadria.setterLarguraEsquadria(largEsquadria);

                    areaEsquadria = esquadria.calcularArea();
                    areaRevestimento = areaParede - areaEsquadria;
                    rodarSpinner();
                    for (int i = 0; i < 50; ++i) System.out.println();
                    System.out.println("===== RELATÓRIO PAREDE =====");
                    System.out.printf("OBRA: %s\n", descServico);
                    System.out.printf("Área PAREDE: %.2fm²\n", areaParede);
                    System.out.printf("Área %s: %.2fm²\n", typeOfEsquadria, areaEsquadria);
                    System.out.printf("Área Total para REVESTIMENTO: %.2fm²\n\n", areaRevestimento);


                    break;
                }
            }
        } else {
            rodarSpinner();
            for (int i = 0; i < 50; ++i) System.out.println();
            System.out.println("===== RELATÓRIO PAREDE =====");
            System.out.printf("OBRA: %s\n", descServico);
            System.out.printf("Área PAREDE: %.2fm²\n", areaParede);
            System.out.printf("Área Total para REVESTIMENTO: %.2fm²\n\n", areaParede);
        }
    }

    public void fluxoCalculoRevestimento() {
        Revestimento revestimento = new Revestimento();

        System.out.println("Digite a ALTURA da peça de REVESTIMENTO: ");
        double altRev = sc.nextDouble();
        revestimento.setterAlturaPecaRev(altRev);

        System.out.println("Digite a LARGURA da peça de REVESTIMENTO: ");
        double larguraRev = sc.nextDouble();
        sc.nextLine();
        revestimento.setterLarguraPecaRev(larguraRev);
        areaPecaRev = revestimento.calcularAreaPecaRev();
        qtdPecas = revestimento.calcularQtdPecas(areaRevestimento);
        rodarSpinner();

        System.out.println("===== RELATÓRIO REVESTIMENTO =====");
        System.out.printf("OBRA: %s\n", descServico);
        System.out.printf("Área da peça de REVESTIMENTO: %.2fm²\n", areaPecaRev);
        System.out.printf("Área TOTAL para REVESTIMENTO: %.2fm²\n", areaRevestimento);
        System.out.printf("Total de peças necessárias: %.0f\n", qtdPecas);
        double qtdMargem = qtdPecas * 1.10;
        int qtdFinalCMargem = (int) Math.ceil(qtdMargem);
        qtdPecasCMargem = qtdFinalCMargem;
        System.out.printf("TOTAL de peças com MARGEM DE PERDA: %d\n", qtdFinalCMargem);
    }

    public void relatorioGeral() {
        System.out.printf("===== RELATÓRIO GERAL - %s =====\n", descServico);
        System.out.printf("Área total PAREDE: %.2fm²", areaParede);
        System.out.printf("Área total ESQUADRIA: %.2fm²", areaEsquadria);
        System.out.printf("Área total para REVESTIMENTO: %.2fm²", areaRevestimento);
        System.out.printf("Área PEÇA do REVESTIMENTO: %.2fm²", areaPecaRev);
        System.out.printf("Quantidade de peças: %.0f", qtdPecas);
        System.out.printf("Quantidade de peças c/ MARGEM DE PERDA: %d", qtdPecasCMargem);
    }

    public void rodarSpinner() {
        String[] frames = {"|", "/", "-", "\\"};
        System.out.print("Carregando ");
        try {
            for (int i = 0; i < 10; i++) { // 10 iterações = ~1.5 segundos
                System.out.print("\rCarregando " + frames[i % frames.length]);
                Thread.sleep(150);
            }
            System.out.print("\r                \r"); // Limpa a linha do spinner
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}