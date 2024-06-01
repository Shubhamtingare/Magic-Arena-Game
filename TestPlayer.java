public class TestPlayer {
    public static void main(String[] args) {
        testTakeDamage();
        testIsAlive();
    }

    // Method to test the takeDamage() method of the Player class
    private static void testTakeDamage() {
        Player player = new Player(100, 10, 5);
        
        player.takeDamage(30);
        
        // Check if the health after taking damage is correct
        if (player.getHealth() != 70) {
            System.err.println("Error: Incorrect health after taking damage");
        }
    }

    // Method to test the isAlive() method of the Player class
    private static void testIsAlive() {
        Player player = new Player(50, 5, 10);
        
        // Check if the player is alive (expected to be alive)
        if (!player.isAlive()) {
            System.err.println("Error: Player should be alive");
        }
        
        player.takeDamage(50);
        
        // Check if the player is alive (expected to be dead)
        if (player.isAlive()) {
            System.err.println("Error: Player should be dead");
        }
    }
}
