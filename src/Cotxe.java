public class Cotxe {
    private static final String marca = " ";
    private static String model;
    private final int potencia;

    public Cotxe(String ford, String puma, int i) {
        this.potencia = 110;
    }

    public int getPotencia() {
        return potencia;
    }

    public void accelerar(){
        System.out.println("El vehicle està accelerant");
    }
    public static String frenar(){
        return "El vehicle està frenant";
    }
}
