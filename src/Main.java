import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("=========================");
        System.out.println("TESTE");

        int option1;
        while(true) {
            System.out.println("Selecione uma opção: \n1. CALCULAR ÁREA PAREDE\n"); //pedir ajuda pra entender como vai funcionar
            option1 = sc.nextInt();

            if (option1 == 1) {
                Parede parede = new Parede();
                System.out.println("Digite a ALTURA da parede em METROS: (ex: 5.80)");
                float alturaValue = sc.nextFloat();
                parede.setterAlturaParede(alturaValue);
                System.out.println("Digite a LARGURA da parede em METROS: (ex: 1.75)");
                float larguraValue = sc.nextFloat();
                parede.setterLarguraParede(larguraValue);
                float areaParede = parede.calcularArea();
                System.out.printf("ÁREA: %.2fm²\n", areaParede);
                System.out.println("Há algum tipo de ESQUADRIAS na PAREDE: (SIM/NÃO)");
                sc.nextLine();
                String option2 = sc.nextLine();

                if (option2.equalsIgnoreCase("SIM")){
                    while (true){
                        System.out.println("Selecione o tipo: \n1. Porta\n2. Janela");
                        int option3 = sc.nextInt();
                        if (option3 == 1){
                            String typeEsquadria = "Porta";
                            Esquadria esquadria = new Esquadria();
                            System.out.printf("Digite a ALTURA da %s (ex: 1.21): \n", typeEsquadria);
                            float larguraEsquadria = sc.nextFloat();
                            esquadria.setterLarguraEsquadria(larguraEsquadria);
                            System.out.printf("Digite a LARGURA da %s (ex: 3.25): \n",typeEsquadria);;
                            float alturaEsquadria = sc.nextFloat();
                            sc.nextLine();
                            esquadria.setterAlturaEsquadria(alturaEsquadria);
                            float areaEsquadria = esquadria.calcularArea();
                            System.out.printf("ÁREA: %.2fm²\n", areaEsquadria);

                            float areaRevestimento = areaParede -  areaEsquadria;

                            System.out.printf("======= RELATÓRIO FINAL (PAREDE) ======\n" +
                                    "Área Parede: %.2fm²\n" +
                                    "Área Esquadria (%s): %.2fm²\n" +
                                    "Área total para aplicação de Revestimento: %.2fm²\n", areaParede,typeEsquadria, areaEsquadria, areaRevestimento);
                            break;
                        } else if (option3 == 2){
                            String typeEsquadria = "Janela";
                            Esquadria esquadria = new Esquadria();
                            System.out.printf("Digite a LARGURA da %s (ex: 3.21): \n", typeEsquadria);
                            float larguraEsquadria = sc.nextFloat();
                            esquadria.setterLarguraEsquadria(larguraEsquadria);
                            System.out.printf("Digite a ALTURA da %s (ex: 1.20): \n",typeEsquadria);
                            float alturaEsquadria = sc.nextFloat();
                            esquadria.setterAlturaEsquadria(alturaEsquadria);
                            float areaEsquadria = esquadria.calcularArea();
                            System.out.printf("ÁREA: %.2fm²\n", areaEsquadria);

                            float areaRevestimento = areaParede -  areaEsquadria;

                            System.out.printf("======= RELATÓRIO FINAL (PAREDE) ======\n" +
                                    "Área Parede: %.2fm²\n" +
                                    "Área Esquadria (%s): %.2fm²\n" +
                                    "Área para Revestimento: %.2fm²\n", areaParede, typeEsquadria, areaEsquadria, areaRevestimento);
                            break;
                        } else if (option3 != 1 && option3 != 2){
                            System.out.println("Opção Inválida, Selecione novamente.");
                        }
                    }
                }else if(option2.equalsIgnoreCase("NÃO")){
                    System.out.printf("======= RELATÓRIO FINAL (PAREDE) ======\n" +
                            "Área TOTAL: %.2fm²", areaParede);
                } else {
                    System.out.println("Opção Inválida, Preencha novamente.");
                }

            }
            System.out.println("\nDeseja calcular novamente: (Sim/Não)");
            String option4 = sc.next();
            if (option4.equalsIgnoreCase("SIM")){
                System.out.println("Executando novamente... Aguarde");

            } else if (option4.equalsIgnoreCase("NÃO")) {
                System.out.println("Encerrando programa. \nDesenvolvido por Yuri Vital");
                break;
            }

        }
    }
}
