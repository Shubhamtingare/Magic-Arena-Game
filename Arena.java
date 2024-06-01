public class Arena {
    private Player player1;
    private Player player2;
    private Dice attackingDice;
    private Dice defendingDice;
    private int maxTurns;

    // Constructor to initialize Arena with players, dice, and maximum turns
    public Arena(Player player1, Player player2, Dice attackingDice, Dice defendingDice, int maxTurns) {
        this.player1 = player1;
        this.player2 = player2;
        this.attackingDice = attackingDice;
        this.defendingDice = defendingDice;
        this.maxTurns = maxTurns;
    }

    // Method to start the match and determine the winner
    public Player startMatch() {
        Player attacker = null, defender = null;
        int turns = 0;

        // Loop until one of the players is no longer alive or maximum turns are reached
        while (player1.isAlive() && player2.isAlive() && turns < maxTurns) {
            // Determine attacker and defender based on their health
            attacker = (player1.getHealth() > player2.getHealth()) ? player1 : player2;
            defender = (attacker == player1) ? player2 : player1;

            // Print turn information
            System.out.println("\nTurn " + (turns + 1) + ": " + attacker.getName() + " is attacking " + defender.getName() + ".");

            // Calculate attack and defense damages
            int attackDamage = attacker.getDamage(attackingDice);
            int defenseDamage = defender.getDamage(defendingDice);
            int actualDamage = Math.max(attackDamage - defenseDamage, 0);

            // Print damage details
            System.out.println("Attack damage: " + attackDamage + ", Defense damage: " + defenseDamage + ", Actual damage: " + actualDamage);

            // Apply damage to the defender
            defender.takeDamage(actualDamage);

            turns++; 
        }

        // Return the winner of the match
        return (player1.isAlive()) ? player1 : player2;
    }
}
