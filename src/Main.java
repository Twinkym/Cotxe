public class Main {
    public static void main(String[] args) {
        Cotxe cotxe = new Cotxe("Ford", "Puma", 110);

        cotxe.accelerar();
        System.out.println(Cotxe.frenar());
    }
}