import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Permainan {
  public static void main (String[] args){
    Scanner reader = new Scanner(System.in);
    String storySection = "one";
    String option;
    ArrayList<Choices> choiceRepo = new ArrayList<>();
    ArrayList<Story> storyRepo = new ArrayList<>();
    
    Story one = new Story("one", "Pada pagi hari dikampus universitas muhammadiyah malang\n" +
                " mahasiswa semester 7 yang akan menempuh tugas akhir supaya agar dapat lulus dengan tepat waktu\n" +
                "Bernad : Ga kerasa udah semester 7 aja kuliah ini, sebentar lagi tugas akhir menanti. rencana pagi ini ke kampus ahh.\n" +
                "tanya tanya dan konsultasi ke dosen waliku dikampus. Semoga saja ada dikampus dosen waliku\n " +
                "Jam menunjukan 07.30 Bernad Hidayat bersiap menuju kampus menggunakan motor kesayangannya\n" +
                " perjalanan dari rumah ke kampus sekitar 15 menit. setelah tiba di parkiran motor kampus Bernad bertemu dengan sahabatnya yakni Fulan Nur Satya.\n");

        Story twoA = new Story("twoA", "...Apakah Bernad Hidayat menyapa kemudian mengajak mengobrol sahabatnya.\n "+
                "Bernad	: Hay lan, ada kuliah kah?\n" +
                " Fulan	: Iya nih nad, ada mata kuliah ekonomi bisnis\n" +
                "Bernad	: Wahh, tumben pagi biasanya siang?\n" +
                "Fulan	: Dosenya minta di ganti jadwal jadi pagi\n" +
                "Bernad	: Hahahaa, biasanya kan masih tidur jam segini.\n" +
                "Fulan	: Tau aja lu nad hehehe.\n" +
                "Bernad	: Eh iya duluan ya, mau ketemu dosen wali.\n"+
                "Fulan	: Oh ya nad hati hati.\n"+
                "Setelah bertemu teman yang beda fakultas bernad berjalan menuju gedung kuliah bersama 3,\n"+
                " tetapi ada teman teman yang sekelas dengannya di ICT kemudian temanya menyapa dia \n"+
                "dan disuruh kesana.");

        Story twoB = new Story("twoB", " Menyapa dan langsung menuju ke gedung kuliah bersama 3 langsung\n" +
                "Bernad	: Hay lan, duluan ya\n" +
                "Fulan	: Oh ya nad hati hati.\n" +
                "Setelah bertemu teman yang beda fakultas bernad berjalan menuju gedung kuliah bersama 3,\n" +
                "tetapi ada teman teman yang sekelas dengannya di ICT kemudian temanya menyapa dia dan disuruh kesana.\n"+
                "Setelah bertemu teman yang beda fakultas bernad berjalan menuju gedung kuliah bersama 3,\n"+
                " tetapi ada teman teman yang sekelas dengannya di ICT kemudian temanya menyapa dia \n"+
                "dan disuruh kesana.");
        
        Story twoC = new Story("twoC","Lari, Tidak menghiraukan Fulan\n"+
                "Setelah bertemu teman yang beda fakultas bernad berjalan menuju gedung kuliah bersama 3,\n"+
                " tetapi ada teman teman yang sekelas dengannya di ICT kemudian temanya menyapa dia \n"+
                "dan disuruh kesana.");
    
        Choices ch1ChoiceA = new Choices ("one", "A",
               "Apakah Bernad Hidayat menyapa kemudian mengajak mengobrol sahabatnya", "two A");
        Choices ch1ChoiceB = new Choices ("one", "B",
               "Menyapa dan langsung menuju gedung kuliah bersama 3", "twoB");
        Choices ch1ChoiceC = new Choices ("one", "C",
               "Lari, Tidak menghiraukan Fulan", "twoC");
    
        StorythreeA = new Story ("threeA","Menolak dan menjawab singkat\n"+
                "Lisa : Hey nad, mau kemana? sini lah dulu.\n"+
                "Bernad : Eh Lisa, maaf mau ada agenda ketemu dosen wali\n"+
                "Lisa : Oh ya sudahh.\n"+
                "Bernad : Maaf ya hehehe\n"+
                "Kemudian Bernad menuju ke GKB2 untuk naik lift menuju ke lantai 6 di GKB3, lift disini terlalu ramai antrinya pasti lama");
    
        StorythreeB = new Story ("threeB","Menghampiri temanya dahulu"+
                "Lisa : Hey nad, mau kemana? sini lah dulu.\n"+
                "Bernad : Eh Lisa, Ngapain lis disini?\n"+
                "Lisa : Ngerjain tugas nih kalkulus.\n"+
                "Bernad : Lohh, kok kalkulus?\n"+
                "Lisa : Iya aku ngulang semester kemaren huft.\n"+
                "Bernad : Emang siapa dosen nya?"+
                "Lisa : Biasa lahh bapak ituu, siapa lagi emang.\n"+
                "Bernad: Waduhhhh, geleng geleng nilaiku aja pas.\n"+
                "Lisa : Yha mau gimana lagi, jalani aja.\n"+
                "Bernad : Hehehe, semangat yaaa. Aku mau ke kantor jurusan dulu, ada urusan.\n"+
                "Lisa : Oke deh hati hati.\n"+
                "Kemudian Bernad menuju ke GKB2 untuk naik lift menuju ke lantai 6 di GKB3, lift disini terlalu ramai antrinya pasti lama");
        
        StorythreeC = new Story ("threeC","Langsung bergegas menuju gedung kuliah bersama 3\n"+
                "Kemudian Bernad menuju ke GKB2 untuk naik lift menuju ke lantai 6 di GKB3, lift disini terlalu ramai antrinya pasti lama");
 
        Choices ch2ChoiceA = new Choices ("twoA", "A", "Continue", "threeA");
        Choices ch2ChoiceB = new Choices ("twoB", "B", "Continue", "threeB");
        Choices ch2ChoiceC = new Choices ("twoC", "C", "Continue", "threeC");
        
  }
}
