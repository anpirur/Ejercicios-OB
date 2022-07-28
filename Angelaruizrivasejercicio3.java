public class MyClass {
    public static void main(String args[]) {
      int numb1 = -26;
      int numb2 = 45 ;
      int numb3 = 67;
      int resultados =numb1 + numb2 + numb3 ;

      System.out.println("El resultado de la suma es = " + resultados);
      
        Coche miCoche = new Coche ();
        miCoche.Quitarpuerta ();
        miCoche.Quitarpuerta ();
        
    System.out.println("Las puertas del coche son : " + miCoche.puertas);
    }
    
}


 class Coche{
    
        String color = "Negro";
        String marca = "BMW";
        int km = 0;
        int puertas = 5;
       
       public void Quitarpuerta () {
            this.puertas--;
        }
        
        
    }
