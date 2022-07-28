public class MyClass {
    public static void main(String args[]) {
     int numero = -6;
     if (numero <0) {
         System.out.println("El resultado es negativo");
     }
     while (numero <3) {
         numero ++;
         System.out.println (numero);
     }
     do {
         System.out.println(numero);
         numero ++;
         break;
        }
      
        while (numero <3);
       
      
           int numeroFor = 0 ;
           for (; numeroFor <=3 ; numeroFor++);
           {
               System.out.println(numeroFor);
               
           }
               
          int estaciones =4;
          String estacion = "VERANO" ;
          
          switch(estacion){
              
              case "VERANO":
              System.out.println ("Es verano");
              break;
              case "OTOÑO":
              System.out.println("Es otoño");
              
              case "INVIERNO":
              System.out.println("Es invierno");
              
              case "PRIMAVERA":
              System.out.println("Es primavera");
              break;
              default:
              System.out.println(estacion);
              
          }
          
        
    }
}