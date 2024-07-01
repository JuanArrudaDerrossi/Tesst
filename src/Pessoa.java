public class Pessoa {
    String modelo;
    int ano;
    String cor;

   public String hello(){
       return "Ola Mundo";
   }

   int Calculadora(int numero){
       return numero * 2;
   }

   void fichaDoCarro(){
       System.out.println("modelo do carro " + modelo);
       System.out.println("Ano do carro " + ano);
       System.out.println("cor do carro " + cor);
   }

   int idadeDoCarro(int ano){
       return  2024 - ano;
   }
}
