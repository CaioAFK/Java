public class Poupança {
    private String nome;
    private double saldo;
    private static double taxaJurosAnual;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public static void setTaxaJurosAnual(double taxaJurosAnual) {
        Poupança.taxaJurosAnual = taxaJurosAnual;
    }

    public Poupança(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    // metodos

    public double calcularJurosMensais() {
        saldo = (saldo +(saldo*taxaJurosAnual)/12) ;
        return saldo;
    }

    public static double modificaJurosMensais(double juros){
        taxaJurosAnual = juros;
        return taxaJurosAnual;
    }

}
