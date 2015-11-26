
public class Prima
{
    // instance variables - replace the example below with your own
   
    public Prima()
   {   int angka = 100;
       
       for(int n=1;n<angka;n++){
           int cek=0;
           for(int x=2;x<n;x++){
               if((n%x)==0){
                   cek=1;
                   break;
                }
            }
       
           if (cek==0){
                System.out.println(n);
           }
      }
   }
}
