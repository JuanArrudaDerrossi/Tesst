public class Main {
    public static void main(String[] args) {
        Movie newMovie = new Movie();

        newMovie.name = "O poderoso mamadão";
        newMovie.realseDate = 1900;
        newMovie.durationInMinuts = 180;

        newMovie.showSheet();
        newMovie.avalia(8.8);
        newMovie.avalia(5);
        newMovie.avalia(1.2);

        System.out.println(newMovie.ratings);
        System.out.println(newMovie.allAvaliation);
        System.out.println(newMovie.mediaAllAvaliations());

    }
}