import java.util.Scanner;

public class appBank {
        public appBank() {
        }
   
        public static void main(String[] args) {
   
             System.out.println("Selamat Datang di Bank Hawa's");
             
             Rekening rekening = new Rekening("awa", "200230040074", 0);
             rekening.tampilkanInfo();
             System.out.println("Setor : " + rekening.addSetor(200));
             System.out.println("Tarik : " + rekening.addTarik(50));
             System.out.println("Setor : " + rekening.addSetor(10));
             rekening.tampilkanInfo();
             System.out.println("================================================================");
   
   
            
             Tabungan tabungan = new Tabungan("Fazryk", "20230040356", 0, 0.5);
             System.out.println("Setor : " + tabungan.addSetor(200));
             System.out.println("Tarik : " + tabungan.addTarik(100));
             tabungan.tampilkanInfo();
             System.out.println("================================================================");
   
             // Giro giro = new Giro("aw aw", "190", 0, 500000);
             // System.out.println("Setor : " + giro.addSetor(100));
             // System.out.println("Tarik : " + giro.addTarik(50));
             // System.out.println("Setor : " + giro.addSetor(20));
             // giro.tampilkanInfo();
             
        }
   }



