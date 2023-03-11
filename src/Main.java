public class Main {
    public static void main(String[] args) {
        Poupança p1 = new Poupança("Caio", 2000);
        Poupança p2 = new Poupança("Ariano", 3500);

        System.out.println(p1.getSaldo());
        Poupança.modificaJurosMensais(0.3);
        System.out.println(p1.calcularJurosMensais());
        Poupança.modificaJurosMensais(0.4);
        System.out.println(p1.calcularJurosMensais());


    }
}