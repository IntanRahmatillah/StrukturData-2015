import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class KopiBerkas {
    public static void main(String[] args) throws IOException {
        try {
            KopiBerkas k = new KopiBerkas();
            k.kopi("intan.txt","baru.txt");
        }
        catch (IOException kesalahan) {
            System.out.printf("Terjadi kesalahan: %s", kesalahan);
        }
    }
    public void kopi(String sumber, String sasaran) throws IOException {
        // Deklarasi variabel untuk stream
        FileInputStream masukan = null;
        FileOutputStream keluaran = null;
        
        try {
            // Object stream untuk masukkan
            masukan = new FileInputStream(sumber);
            keluaran = new FileOutputStream(sasaran);
            
            int karakter = masukan.read();
            
            while (karakter != -1) {
                // Lakukan sesuatu dengan data yang dibaca => Tampikan
                keluaran.write(karakter);
                // Coba baca lagi dari stream
                karakter = masukan.read();
            }
            keluaran.flush();
            } 
        finally {
            if (masukan != null)
                masukan.close();
            if (keluaran != null)
                keluaran.close();
            }
        }
    }
        