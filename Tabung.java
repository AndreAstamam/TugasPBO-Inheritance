public class Tabung extends Lingkaran {
    private double tinggi;

    public Tabung(double tinggi, double radius, String warna) {
        super(radius, warna);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }

    public void printInfo() {
        System.out.println("Tabung warna " + warna + ", volume = " + hitungVolume());
    }
}