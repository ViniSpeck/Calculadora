public class Calculadora {
    private double numeroUm;
    private double numeroDois;

    public Calculadora(double numeroUm, double numeroDois) {
        this.numeroUm = numeroUm;
        this.numeroDois = numeroDois;
    }

    public double getSum() {
        return numeroUm+numeroDois;
    }

    public double getSubtraction() {
        return numeroUm-numeroDois;
    }

    public double getMultiplication() {
        return numeroUm*numeroDois;
    }

    public double getDivision() {
        if(numeroDois==0){
            throw new IllegalArgumentException("Impossível dividir por zero");
        }
        return numeroUm/numeroDois;
    }


}
