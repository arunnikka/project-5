public class Rekening {
    String namaPemilik;
    String noRekening;
    double saldo;

    public Rekening(String namaPemilik, String noRekening, double saldo) {
        this.namaPemilik = namaPemilik;
        this.noRekening = noRekening;
        this.saldo = saldo;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public void setNoRekening(String noRekening) {
        this.noRekening = noRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double addSetor(double setor) {
        this.saldo += setor;
        return this.saldo;
    }
    public double addTarik(double tarik) {
        this.saldo -= tarik;
        return this.saldo;
    }

    public void tampilkanInfo(){
        System.out.println("Nama Pemilik: " + getNamaPemilik());
        System.out.println("No Rekening: " + getNoRekening());
        System.out.println("Saldo: " + getSaldo());
    }

}
