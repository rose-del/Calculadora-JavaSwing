import javax.swing.*;
import java.awt.*;

public class MinhaJanela {
    private JFrame frame;
    private final Font FONTE = new Font("Lucida Grande", Font.PLAIN, 28);
    JTextField resultado = new JTextField();
    private Calculadora calc = new Calculadora();

    public MinhaJanela() {
        frame = new JFrame();
        frame.setTitle("Calculadora");
        //frame.setSize(800, 700);

        iniciarComponentes();
    }

    private void iniciarComponentes() {
        frame.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        resultado.setFont(FONTE);
        resultado.setHorizontalAlignment(JTextField.RIGHT);

        c.ipady = 20;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 3;

        frame.add(resultado, c);

        addBotao("7", 0, 1, 1, true);
        addBotao("8", 1, 1, 1, true);
        addBotao("9", 2, 1, 1, true);
        addBotao("+", 3, 1, 1, true);

        addBotao("4", 0, 2, 1, true);
        addBotao("5", 1, 2, 1, true);
        addBotao("6", 2, 2, 1, true);
        addBotao("-", 3, 2, 1, true);

        addBotao("1", 0, 3, 1, true);
        addBotao("2", 1, 3, 1, true);
        addBotao("3", 2, 3, 1, true);
        addBotao("x", 3, 3, 1, true);

        addBotao("0", 0, 4, 2, true);
        addBotao("=", 2, 4, 1, false);
        addBotao("/", 3, 4, 1, true);

        addBotao("Apagar", 0, 5, 4, true);

        frame.pack();
        frame.setResizable(false);
    }

    public JButton addBotao(String texto, int x, int y, int largura, boolean adcEvento) {
        JButton btn = new JButton(texto);
        btn.setFont(FONTE);

        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 20;
        c.gridx = x;
        c.gridy = y;
        c.gridwidth = largura;

        frame.add(btn, c);

        if (adcEvento) {
            btn.addActionListener(e -> {
                if (texto.equals("Apagar")) {
                    resultado.setText("");
                    calc.resetar();
                } else if ("+-x/".contains(texto)) {
                    calc.setOperador(texto); // Define o operador na calculadora
                    resultado.setText(resultado.getText() + texto);
                } else {
                    resultado.setText(resultado.getText() + texto);
                }
            });
        }else if (texto.equals("=")) {
            btn.addActionListener(e -> {
                String textoAtual = resultado.getText();
                if (!textoAtual.isEmpty()) {
                    String[] partes = textoAtual.split("([+\\-x/])"); // Divide pela expressão regular de operadores
                    if (partes.length == 2) {
                        double valorA = Double.parseDouble(partes[0]);
                        double valorB = Double.parseDouble(partes[1]);
                        char operador = textoAtual.charAt(partes[0].length());

                        calc.setValorA(valorA);
                        calc.setValorB(valorB);
                        calc.setOperador(String.valueOf(operador));
                    }
                    double resultadoCalculado = calc.calcular();
                    resultado.setText(String.valueOf(resultadoCalculado));
                    calc.resetar();
                }
            });
        }
        return btn;
    }

    public void mostrar() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        MinhaJanela janela = new MinhaJanela();
        janela.mostrar();
    }
}