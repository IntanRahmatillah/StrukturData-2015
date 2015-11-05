
/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Komodo implements Tumbuhan
{
   public boolean berbuah(){
       boolean berbuah = true;
       return berbuah;
    }
   public String suara(){
       String suara = new String("Bip");
       return suara;
   }
   public boolean merayap(){
       boolean merayap = false;
       return merayap;
    }
}
