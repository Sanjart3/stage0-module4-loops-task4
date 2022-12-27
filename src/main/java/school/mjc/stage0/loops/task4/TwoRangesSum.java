package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (lastInRow<numberToSkip){
            System.out.println("number to skip is bugger then the last");
        }else {
            int sum1=0, sum2=0;
            for (int i=1;i<=numberToSkip;i++){
                sum1+=i;
            }
            for (int i=numberToSkip+1;i<=lastInRow;i++){
                sum2+=i;
            }
            System.out.println("skipped sum is "+sum1+"\ncounted sum is "+sum2);
        }
    }
}
