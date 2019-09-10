
 
 public class Calculator {

     private static float sum(float x, float y) {
         float result = 0.0f;
         
         result = x + y;
         return result;

     }

     private static float mult(float x, float y) {
         float result = 0.0f;
        
         result = x * y;
         return result;

     }

     private static float subs (float x, float y) {
         float result = 0.0f;
         
         result = x - y;
         return result;
     }

     private static float mod(float x, float y) {
         float result = 0.0f;
        
         result = x % y;
         return result;
     }

     private static float div(float x, float y) {
         float result = 0.0f;
         result = x / y;
         return result;
     }
     
     
     public static void main(String[] args) {
        
        float x = Float.parseFloat(args[0]);
        float y = Float.parseFloat(args[1]);

         System.out.println("Numero 1: " + x);
         System.out.println("Numero 2 : " + y);
         System.out.println("Suma = " + sum(x, y));
         System.out.println("Multiplicacion = " + mult(x, y));
         System.out.println("Resta = " + subs(x, y));
         System.out.println("Division = " + div(x, y));
         System.out.println("Modulo = " + mod(x, y));

     }
    
   
}