public class Main {
    public static void main(String[] args) {
        Player player1 = new Player(10, 5, 10);
        player1.setName("Player1");
        Player player2 = new Player(10, 5, 10);
        player2.setName("Player2");
        Dice attackingDice = new Dice(5);
        Dice defendingDice = new Dice(5);
        int maxTurns = 100; 
Arena arena = new Arena(player1, player2, attackingDice, defendingDice, maxTurns); 

// Start the match
Player winner = arena.startMatch();


if (player1.isAlive() && player2.isAlive()) {
            System.out.println("Match ended in a draw.");
        } else {
            System.out.println("Match ended. Winner: " + winner.getName());
        }
    }
}
