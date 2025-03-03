public class BucleFor {
    public static void main(String args[]) {
      primero:
       for(int i = 0; i < 5; i++) {
           segundo:
           for(int j = 0; j < 5; j++) {
               
               if(i == 3) break primero;
               if(j == 2) break segundo;
          
          System.out.print(i + " " + j + "  ");
           }
       }   
    }
  }