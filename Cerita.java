public class Cerita {
  String NamaCerita;
  String TeksCerita;

  public Cerita (String nama, String teks){
    this.NamaCerita = nama;
    this.TeksCerita = teks;
  }
  
  public void printCerita(){
    Syste.out.println(this.TeksCerita);
  }
  
}
