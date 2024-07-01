public class DesafioCario {
    public static void main(String[] args) {
        Pessoa newPessoa = new Pessoa();
        newPessoa.cor = "branco";
        newPessoa.ano = 2011;
        newPessoa.modelo = "corsa";


       String ola = newPessoa.hello();
        System.out.println(ola);

        int numero = newPessoa.Calculadora(200);
        System.out.println(numero);


        newPessoa.fichaDoCarro();
        int idade = newPessoa.idadeDoCarro(newPessoa.ano);
        System.out.println("o carro tem: " + idade + " anos");
    }
}
