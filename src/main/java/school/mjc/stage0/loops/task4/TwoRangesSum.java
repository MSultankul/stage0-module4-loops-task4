package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int sum = 0, sum2 = 0;
        if(numberToSkip>lastInRow)
            System.out.println("number to skip is bigger then the last");
        else {
            for (int i = 1; i <= lastInRow; i++) {
                if (i % numberToSkip == 0)
                    sum += i;
                else
                    sum2 += i;
            }
            System.out.println("skipped sum is " + sum);
            System.out.println("counted sum is " + sum2);
        }

    }
}
