# Calculadora em Java

Uma calculadora gráfica simples desenvolvida em Java utilizando Swing. Este projeto implementa operações matemáticas básicas como adição, subtração, multiplicação e divisão, com uma interface gráfica simples.

## Funcionalidades

- Operações básicas: Soma, Subtração, Multiplicação e Divisão.
- Interface gráfica: Um design funcional e organizado utilizando GridBagLayout.
- Botão de "Apagar": Permite limpar os valores inseridos.
- Exibição em tempo real: Mostra os números e operadores digitados no display da calculadora.

## Estrutura do Código

1. `Calculadora`: Contém a lógica das operações matemáticas.      
- Atributos: valorA e valorB => operandos para os cálculos.
- operador: identifica a operação selecionada.
- Métodos principais:
  1. calcular(): realiza o cálculo com base no operador.
  2. resetar(): limpa os valores armazenados.
     
2. `MinhaJanela`: Gerencia a interface gráfica do programa. Utiliza JFrame, JButton e JTextField para a construção da GUI. Possui métodos para adicionar botões e eventos associados.

## Como executar

1. Clone ou baixe o repositório deste projeto

2. Compile os arquivos .java

        javac MinhaJanela.java Calculadora.java
   
4. Execute o programa:
   
[Gravação de tela](https://github.com/user-attachments/assets/6a55ab51-bb80-483e-b372-8e529aa8cef8)
