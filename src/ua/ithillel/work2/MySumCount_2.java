package ua.ithillel.work2;

public class MySumCount_2 implements Runnable{
    private int startIndex;
    private int stopIndex;
    private int[] myArray;
    private long resultSum;

    public MySumCount_2(int startIndex,int stopIndex,int[] myArray){
        setStartIndex(startIndex);
        setStopIndex(stopIndex);
        setMyArray(myArray);
    }
    @Override
    public void run() {
        System.out.println("thread 2 start");
        for (int i = startIndex; i < stopIndex; i++) {
            resultSum+=myArray[i];
        }
        System.out.println(resultSum);
        System.out.println("thread 2 finish");
    }
    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    public int[] getMyArray() {
        return myArray;
    }

    public void setMyArray(int[] myArray) {
        this.myArray = myArray;
    }

    public long getResultSum() {
        return resultSum;
    }

    public void setResultSum(long resultSum) {
        this.resultSum = resultSum;
    }
}
