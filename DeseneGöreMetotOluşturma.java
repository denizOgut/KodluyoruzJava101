
package desenegöremetotoluşturma;


public class DeseneGöreMetotOluşturma {

    public static void main(String[] args) {
        recrusiveDesen(10);
        System.out.println("------------");
        
    }

    
    static  int recrusiveDesen(int num){
    
     System.out.print(num + " ");
        if (num <= 0) {
            return num;
        }
        int tempNum = recrusiveDesen(num - 5) + 5;

        System.out.print(tempNum + " ");

        return tempNum;
    }
    
    }
    

