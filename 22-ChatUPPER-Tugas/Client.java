import java.net.Socket;
import java.net.UnknownHostException;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.BufferedReader;

import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.BufferedWriter;

import java.util.Scanner;

public class Client {
    public void chat() 
                throws UnknownHostException, IOException {
        Socket socket = new Socket("localhost", 33333);
        
        try {
            // Ketik
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Pesan anda: ");
            String ketikanSatuBaris = keyboard.nextLine();
                    
            // Tulis ke socket
            Writer keluaranWriter = new OutputStreamWriter(socket.getOutputStream()); 
            BufferedWriter keluaranBuff = new BufferedWriter(keluaranWriter);
            keluaranBuff.write(ketikanSatuBaris);
            keluaranBuff.write("\n");
            keluaranBuff.flush();
                
            // Baca dari Server
            System.out.print("Dari server : ");
            Reader masukan = new InputStreamReader(socket.getInputStream()); 
            BufferedReader masukanBuff = new BufferedReader(masukan);
            String baris = masukanBuff.readLine();
            System.out.println(baris); 
            
            //balasan dibuat huruf besar
            baris = baris.toUpperCase();
            
            // menulis kembali ke socket dalam huruf besar
            keluaranBuff.write(baris);
            keluaranBuff.flush();
            
            // pesannya berhasil dikirim
            System.out.println("Pesan UPPER telah dikirim");
            System.out.println();
        }
        catch(IOException salah) {
            System.out.println(salah);
        }
        finally {
            if (socket != null)
            socket.close();
        }
    }
}
