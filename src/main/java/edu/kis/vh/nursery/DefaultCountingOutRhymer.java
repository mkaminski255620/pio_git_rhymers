package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
	
	private static final int NUMBERS_SIZE = 12;

    private static final int FULL_SIZE = NUMBERS_SIZE - 1;

private static final int EMPTY_RHYMER_INDICATOR = -1;
	private static final int DEFAULT_VALUE = -1; 
	private static final int CAPACITY = 12;

	private final int[] numbers = new int[CAPACITY];

	private int total = EMPTY_RHYMER_INDICATOR;

	public int getTotal() {
		return total;
	}
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INIMUM_SIZE_BUT_DIFRENT;
    }

    public boolean isFull() {
        return total == FULL_SIZE;
    }

    protected int peekaboo() {
        if (callCheck())
            return MINIMUM_SIZE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return MINIMUM_SIZE;
        return numbers[total--];
    }

}
