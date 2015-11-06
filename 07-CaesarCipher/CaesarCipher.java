import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CaesarCipher {
    private int shift;
    public CaesarCipher(int shift){
        this.shift=shift;
    }
    
    public void enkripsi(String sumber, String sasaran)throws IOException{
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
                karakter+=shift;
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
    public void dekripsi(String sumber, String sasaran)throws IOException{
        FileInputStream masukan = null;
        FileOutputStream keluaran = null;
        try {
            // Object stream untuk masukkan
            masukan = new FileInputStream(sumber);
            keluaran = new FileOutputStream(sasaran);
            
            int karakter = masukan.read();
            
            while (karakter != -1) {
                // Lakukan sesuatu dengan data yang dibaca => Tampikan
                karakter-=shift;
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
     public static void main(String[] args)  {
        try {
            CaesarCipher k = new CaesarCipher(3);
            k.enkripsi("intan.txt","enkripsi.txt");
            k.dekripsi("intan.txt","deskripsi.txt");
        }
        catch (IOException kesalahan) {
            System.out.printf("Terjadi kesalahan: %s", kesalahan);
        }
    }
    }
        