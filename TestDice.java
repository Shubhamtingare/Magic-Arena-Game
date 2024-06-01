
public class TestDice {
    public static void main(String[] args) {
        testRoll();
    }

    // Method to test the roll functionality of the Dice class
    private static void testRoll() {
        // Create a Dice object with 6 sides
        Dice dice = new Dice(6);
        
        int rollResult = dice.roll();
        
        // Check if the roll result is within the valid range (1 to 6)
        if (rollResult < 1 || rollResult > 6) {
            System.err.println("Error: Invalid roll result");
        }
    }
}
