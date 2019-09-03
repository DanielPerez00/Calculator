
 
 public class Calculator {

     private float sum(float x, float y) {
         float result = 0.0f;
         
         result = x + y;
         return result;

     }

     private float mult(float x, float y) {
         float result = 0.0f;
        
         result = x * y;
         return result;

     }

     private float subs (float x, float y) {
         float result = 0.0f;
         
         result = x - y;
         return result;
     }

     private float mod(float x, float y) {
         float result = 0.0f;
        
         result = x % y;
         return result;
     }

     private float div(float x, float y) {
         float result = 0.0f;
         result = x / y;
         return result;
     }
     
     
     public void name(String[] args) {
        
        String a = args[0];
        String b = args[1];

        float x = Float.parseFloat(a);
        float y = Float.parseFloat(b);

         System.out.println("Numero 1: " + x);
         System.out.println("Numero 2 : " + y);
         System.out.println("Suma = " + this.sum(x, y));
         System.out.println("Multiplicacion = " + this.mult(x, y));
         System.out.println("Resta = " + this.subs(x, y));
         System.out.println("Division = " + this.div(x, y));
         System.out.println("Modulo = " + this.mod(x, y));
     }
    
     public static void main(String[] args) {

     
         
     }
}