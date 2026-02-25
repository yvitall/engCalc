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
                        String option3 = sc.nextLine();
                        if (option3 == 1){

                        }
                        Esquadria esquadria = new Esquadria();
                        System.out.print("Digite a ALTURA da ESQUADRIA (ex: 1.75): ");
                        float alturaEsquadria = sc.nextFloat();
                        esquadria.setterLarguraEsquadria(alturaEsquadria);
                        System.out.print("Digite a LARGURA da ESQUADRIA (ex: 1.75): ");
                        float larguraEsquadria = sc.nextFloat();
                        esquadria.setterLarguraEsquadria(larguraEsquadria);
                        float areaEsquadria = esquadria.calcularArea();
                        System.out.printf("ÁREA: %.2fm²\n", areaEsquadria);

                        float areaRevestimento = areaParede -  areaEsquadria;

                        System.out.printf("======= RELATÓRIO FINAL (PAREDE) ======\n" +
                                "Área Parede: %.2fm²\nÁrea Esquadria (%s): %.2fm²\nÁrea total para aplicação de Revestimento: %.2fm²", areaParede,areaEsquadria, areaRevestimento);
                        break;
                    } break;
                } else if(option2.equalsIgnoreCase("NÃO")){
                    System.out.printf("======= RELATÓRIO FINAL (PAREDE) ======\n" +
                            "Área TOTAL: %.2fm²", areaParede);
                    break;
                } else {
                    System.out.println("Opção Inválida, Preencha novamente.");
                }
            }
        }
    }
}
