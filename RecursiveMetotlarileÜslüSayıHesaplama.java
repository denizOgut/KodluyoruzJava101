
package recursivemetotlarileüslüsayıhesaplama;

public class RecursiveMetotlarileÜslüSayıHesaplama {

    public static void main(String[] args) {
        System.out.println(ustHesapla(2, 0));
    }
    
     static int ustHesapla(int taban , int us){
    
       if(us == 0){
       return 1;
       }else if (us == 0) {
             return  1;
         }else{
            return taban * ustHesapla(taban , us-1);
       }
 
    }
}
