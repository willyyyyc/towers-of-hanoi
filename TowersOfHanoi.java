public class TowersOfHanoi {
    public static void main(String[] args) {
        //call to method
        towersOfHanoi(3, 'A', 'C', 'B');
    }

    public static void towersOfHanoi(int stackHeight, char startPeg, char destPeg, char tempPeg) {
        
        if (stackHeight > 0) {
            /* Move disk to temp peg */
            towersOfHanoi(stackHeight - 1, startPeg, tempPeg, destPeg);

            System.out.printf("Move Disk %d from Peg %c to Peg %c\n",stackHeight, startPeg, destPeg);

            /* Move disk from temp peg to dest peg */
            towersOfHanoi(stackHeight - 1, tempPeg, destPeg, startPeg);

        }

    }

        
        
//    public static void moveDisk(int n, int from, int to, int temp) throws InterruptedException{
  //      if (n > 0) {
    //        moveDisk (n-1, from, temp, to);
      //      System.out.println ("move disk " + n + " from peg " + from + " to peg " + to);
//
  //          Thread.sleep(1000);
    //        moveDisk(n-1, temp, to, from);
      //  }
        
    //}
            
            
}