public class Persegi extends Bentuk {
    private double sisi;

    public Persegi(double sisi, String warna) {
        super(warna);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }

    public void printInfo() {
        System.out.println("Bujursangkar berwarna " + warna + ", luas = " + hitungLuas());
    }
}