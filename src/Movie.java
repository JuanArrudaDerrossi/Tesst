public class Movie {
    String name;
    int realseDate;
    boolean isincludPlan;
    double ratings;
    int allAvaliation;
    int durationInMinuts;


    void showSheet(){
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de Lançamento: " + realseDate);
    }

    void avalia(double nota) {
    ratings = ratings + nota;
    allAvaliation++;
    }

    double mediaAllAvaliations(){
        return ratings / allAvaliation;
    }
}
