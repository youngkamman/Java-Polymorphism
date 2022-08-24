public class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return"No plot here";
    }

    public String getName() {
        return name;
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) +1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1: return new Jaws();
            case 2: return new IndependenceDay();
            case 3: return new MazeRunner();
            case 4: return new StarWars();
            case 5: return new Forgetable();


        }
        return null;
    }

}
