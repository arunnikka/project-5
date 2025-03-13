public class Tabungan extends Rekening {
    double bungaTabungan;
    public Tabungan (String namaPemilik, String noRekening, double saldo, double bungaTabungan) {
        super(namaPemilik, noRekening, saldo);
        this.bungaTabungan = bungaTabungan;
    }

    public double hitungTabungan(int bulan) {
        return bungaTabungan = bungaTabungan / 12 * getSaldo() * bulan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Bunga Tabungan: " + bungaTabungan);
        System.out.println("Jenis Rekening: Tabungan");
    }
}
