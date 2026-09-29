public class Main {
    public static void main(String[] args) {
        Bentuk bujurSangkar = new Persegi(8.0, "Merah");
        System.out.println("-> Info Persegi:");
        bujurSangkar.printInfo(); 
        System.out.println();

        Bentuk lingkaran = new Lingkaran(9.0, "Kuning");
        System.out.println("-> Info Lingkaran:");
        lingkaran.printInfo();
        System.out.println();

        Bentuk silinder = new Tabung(10.0, 5.0, "Hijau");
        System.out.println("-> Info Tabung:");
        silinder.printInfo();
    }
}