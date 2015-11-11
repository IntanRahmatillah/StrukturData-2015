import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class KopiBerkasBuffer{
    public void kopi(String sumber,String sasaran)throws IOException{
        FileInputStream masukan1 = null;
        FileOutputStream keluaran1 = null;
        
        BufferedInputStream masukan = null;
        BufferedOutputStream keluaran = null;
        
        try{
            masukan1 = new FileInputStream(sumber);
            keluaran1 = new FileOutputStream(sasaran);
            
            masukan = new BufferedInputStream(masukan1);
            keluaran = new BufferedOutputStream(keluaran1);
            
            int karakter = masukan.read();
            
            while(karakter != -1){
                keluaran.write(karakter);
                
                karakter = masukan.read();
            }
            keluaran.flush();
        }
        
        catch(IOException kesalahan){
            System.out.printf("Terjadi kesalahan : %s, kesalahan");
        }
        finally{
            if(masukan != null)
                masukan.close();
            if(keluaran != null)
                keluaran.close();
        }
    }
}