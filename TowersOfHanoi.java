public class TowersOfHanoi {
    public static void main(String[] args) {
        //call to method
        towersOfHanoi(3, 'A', 'C', 'B');
    }

    public static void towersOfHanoi(int stackHeight, char startPeg, char destPeg, char tempPeg) {
        // base case
        if (stackHeight == 1) {
            // move disk from startPeg to endPeg
            System.out.printf("Move Disk 1 from Peg %c to Peg %c\n", startPeg, destPeg);
            return;
        } else {
            // recursive step
            // move disk from startPeg to tempPeg
            towersOfHanoi(stackHeight - 1, startPeg, tempPeg, destPeg);
            System.out.printf("Move Disk %d from Peg %c to Peg %c\n",stackHeight, startPeg, destPeg);
            towersOfHanoi(stackHeight - 1, tempPeg, destPeg, startPeg);
        }

    }
}