package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int fullSize = 11;

	private static final int minimumSize = -1;

	private static final int numbersSize = 12;

	private int[] numbers = new int[numbersSize];

    public int total = minimumSize;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == minimumSize;
    }

    public boolean isFull() {
        return total == fullSize;
    }

    protected int peekaboo() {
        if (callCheck())
            return minimumSize;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return minimumSize;
        return numbers[total--];
    }

}
