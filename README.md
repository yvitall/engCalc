# 🧱 Calculadora de Materiais (EngCalc)

Um sistema de console (CLI) desenvolvido em **Java** para automatizar cálculos de materiais de construção, com foco na precisão de área de paredes, descontos de esquadrias e compra de revestimentos cerâmicos.

## 💡 Sobre o Projeto
Este é o meu primeiro projeto pessoal de programação! Ele nasceu de uma necessidade real: ajudar meu pai a calcular a quantidade de materiais necessários para o trabalho de revestimento, automatizando um processo que antes era feito à mão e estava sujeito a falhas de cálculo.

Além de ser uma ferramenta de grande utilidade no dia a dia, o projeto tem sido meu laboratório prático. Aqui, apliquei conceitos valiosos como:
- **Lógica de Programação e Estruturas de Controle**
- **Tratamento de Entradas (Scanner e Buffer)**
- **Programação Orientada a Objetos (POO)**: Classes (`Parede`, `Esquadria`, `Revestimento`), métodos e responsabilidade única.

✅ **Status:** MVP Finalizado e 100% Funcional.

## 🛠️ Funcionalidades Atuais
- [x] **Onboarding Interativo:** Tela de instruções iniciais garantindo o uso correto do sistema.
- [x] **Cálculo de Área de Paredes:** Medição exata em metros quadrados.
- [x] **Desconto de Vãos:** Subtração automática de áreas de esquadrias (Portas e Janelas).
- [x] **Cálculo de Revestimento Inteligente:** Retorna a quantidade exata de peças (cerâmica/porcelanato) necessárias para a obra, **já incluindo arredondamento para cima e adicionando automaticamente 10% de margem de perda (recortes).**
- [x] **Validação de Fluxo:** O sistema orienta o usuário passo a passo, exigindo o cálculo do ambiente antes dos materiais.
- [x] **Relatório Geral:** Geração de um resumo detalhado da sessão/obra.

## 🚀 Como executar o programa (Para Usuários)

Se você quer apenas usar a calculadora para a sua obra, não é necessário baixar o código-fonte ou instalar ferramentas complexas!

1. Certifique-se de ter o **Java (JRE) 25 ou superior** instalado na sua máquina.
2. Vá até a aba [Releases](https://github.com/yvitall/engCalc/releases) deste repositório.
3. Baixe o arquivo executável da versão mais recente (`EngCalc.exe`).
4. Dê um duplo clique no arquivo **`EngCalc.exe`**.
5. O terminal será aberto automaticamente e você poderá navegar pelo menu!

*(Nota: Cada vez que o sistema é iniciado, uma nova "Sessão de Obra" é criada. Os dados são limpos ao fechar o aplicativo).*

## 💻 Como rodar o código-fonte (Para Desenvolvedores)

Caso queira clonar o projeto para testar, compilar ou contribuir:

1. Clone este repositório no seu terminal:
```bash
   git clone [https://github.com/yvitall/engCalc.git](https://github.com/yvitall/engCalc.git)
   ```
2. Abra o projeto na sua IDE de preferência (IntelliJ IDEA, Eclipse, etc.).
3. Certifique-se de que o SDK configurado é o Java 25.
4. Execute o método main localizado na classe Main.java.

## 👨‍💻 Autor Desenvolvido por Yuri Vital.
Conecte-se comigo [LinkedIn](https://www.linkedin.com/in/yurivitall/).