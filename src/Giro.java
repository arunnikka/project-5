public class Giro extends Rekening {
    double limitPenarikan;

    public Giro(String namaPemilik, String noRekening, double saldo, double limitPenarikan) {
        super(namaPemilik, noRekening, saldo);
        this.limitPenarikan = limitPenarikan;
    }

    public double getlimitPenarikan(){
        return limitPenarikan;
    }

    public void  setlimitPenarikan(double limitPenarikan){
        this.limitPenarikan = limitPenarikan;
    }
    
    public void setor(double jumlahPenarikan){
        super.addSetor(jumlahPenarikan);
    }

    public void setor(double jumlah, boolean transfer){
        if (transfer == true){
            jumlah = jumlah + 2500;
        }
        super.addSetor(jumlah);
    }

    public void penarikan(double jumlahPenarikan){
        if (jumlahPenarikan <= limitPenarikan){
            super.addTarik(jumlahPenarikan);
        } else {
            System.out.println("Maaf, jumlah penarikan melebihi limit penarikan");
        }
    }
    

}
