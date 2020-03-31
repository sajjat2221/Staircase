package hackrrank.com;



public class HackrrankCom {

    public static void main(String[] args) {

       
        int value = 5;
        for (int i = 1; i <value; i++) {
             System.out.println("");
            for (int j = value; j >i; j--) {
                System.out.print(" ");
                
            }
            
             for (int j = 0; j <i; j++) {
                System.out.print("#");
                
            }
          
        }
        System.out.println("");

    }

}
