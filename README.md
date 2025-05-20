# Conversor-de-Moedas

Conversor de Moedas

Este README descreve o projeto "Conversor de Moedas", uma aplicação de console em Java para converter valores entre diferentes moedas.

1)Descrição do Projeto
O Conversor de Moedas é uma aplicação simples de linha de comando desenvolvida em Java. Seu objetivo principal é permitir que o usuário realize conversões de valores entre pares de     arquivo, criando um histórico das transações.

2)Funcionalidades
O projeto oferece as seguintes funcionalidades principais:
-Conversão Direta e Inversa: Suporta a conversão entre os seguintes pares de moedas, em ambas as direções:
    Dólar Americano (USD) ⇄ Peso Argentino (ARS)
    Dólar Americano (USD) ⇄ Real Brasileiro (BRL)
    Dólar Americano (USD) ⇄ Peso Colombiano (COP)
-Menu Interativo:  Apresenta um menu numérico no console para o usuário escolher a operação desejada.
-Entrada de Valor:  Solicita ao usuário o valor numérico a ser convertido.
-Exibição do Resultado:  Mostra o valor convertido no console após cada operação.
-Registro de Histórico:  Salva os detalhes de cada conversão realizada em um arquivo (gerenciado pela classe `GeradorDeArquivos`).
-Múltiplas Consultas:  Permite que o usuário realize várias conversões sequenciais sem reiniciar o programa.
-Tratamento Básico de Erros:  Inclui validação para garantir que o usuário insira números inteiros para as opções do menu e números decimais para os valores a converter.

3) Como o Usuário Pode Utilizá-lo
  Para utilizar o Conversor de Moedas, siga os passos abaixo:

  - Pré-requisitos:  Certifique-se de ter o Java Development Kit (JDK) instalado em sua máquina (versão 8 ou superior é recomendada).
  -É necessário ter conexão com a internet para que o programa possa buscar as taxas de câmbio atualizadas.
  -Obter o Código:    Se você obteve o código-fonte (por exemplo, clonando este repositório do GitHub), navegue até o diretório onde os arquivos .Java  estão localizados.
  -Compilar o Projeto:
    Abra um terminal ou prompt de comando no diretório onde os arquivos `.java` estão.
   -Um arquivo contendo o histórico das conversões realizadas (gerenciado pela classe GeradorDeArquivos) será criado ou atualizado no diretório onde o programa está sendo executado.
        

