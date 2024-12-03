public class Calculadora {
    private double valorA = 0;
    private double valorB = 0;
    private String operador = "";

    public void setValorA(double valor) {
        this.valorA = valor;
    }

    public void setValorB(double valor) {
        this.valorB = valor;
    }

    public void setOperador(String operadorAtual) {
        this.operador = operadorAtual;
    }

    public double getValorA() {
        return valorA;
    }

    public double getValorB() {
        return valorB;
    }

    public double calcular() {

        double resultado = 0;

        switch (operador) {
            case "+":
                resultado = valorA + valorB;
                break;
            case "-":
                resultado = valorA - valorB;
                break;
            case "x":
                resultado =  valorA * valorB;
                break;
            case "/":
                resultado = valorA/valorB;
                break;
            default:
                System.out.println("Operador inválido.");
        }
        return resultado;
    }


    public void resetar() {
        valorA = 0;
        valorB = 0;
        operador = "";
    }
}