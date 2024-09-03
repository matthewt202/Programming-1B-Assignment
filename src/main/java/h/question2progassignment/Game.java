package h.question2progassignment;

public class Game 
{
    private String name;

    public Game(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void start() {
        System.out.println("Starting the game: " + name);
    }
}
