public class Pilihan {
    String BlockCerita;
    String pilih;
    String pilihan;
    String hasil;

   public Pilihan (String BlockCerita, String pilih, String pilihan, String hasil) {
        this.BlockCerita = BlockCerita;
        this.pilih = pilih;
        this.pilihan = pilihan;
        this.hasil = hasil;
    }

    public void printPilihan () {
        System.out.println(this.pilih + ": " + this.pilihan);
    }
}
