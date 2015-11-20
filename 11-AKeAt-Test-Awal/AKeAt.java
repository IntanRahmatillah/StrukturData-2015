import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * Write a description of class AKeAt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AKeAt
{
    // instance variables - replace the example below with your own
    
    public void aKeAt(String sumber, String sasaran) throws IOException {
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
                if((karakter=='a')|| (karakter == 'A')){
                    karakter='@';
                    keluaran.write(karakter);
                }else{
                    keluaran.write(karakter);
                }
                //keluaran.write(karakter);
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
        
