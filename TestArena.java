public class TestArena {
    public static void main(String[] args) {
        testStartMatch();
    }

    private static void testStartMatch() {
        Player player1 = new Player(20, 5, 10);
        Player player2 = new Player(20, 5, 10);
        Dice attackingDice = new Dice(5);
        Dice defendingDice = new Dice(10);
        int maxTurns = 100;

        Arena arena = new Arena(player1, player2, attackingDice, defendingDice, maxTurns);

        // Start the match
Player winner = arena.startMatch();

        // Check if both players are no longer alive or if the maximum number of turns has been reached
if (player1.isAlive() && player2.isAlive()) {
            System.out.println("Match ended in a draw.");
        } else {
            System.out.println("Match ended. Winner: " + winner);
        }
    }
}
