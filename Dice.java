
public class Dice {
    private int sides;

    // Constructor to initialize the number of sides of the dice
    public Dice(int sides) {
        // Ensure the number of sides is positive
        if (sides <= 0) {
            throw new IllegalArgumentException("Number of sides must be a positive integer.");
        }
        this.sides = sides;
    }

    // Method to simulate rolling the dice and return the result
    public int roll() {
        return (int) (Math.random() * sides) + 1;
    }
}
