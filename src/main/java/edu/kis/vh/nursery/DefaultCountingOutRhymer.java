package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
	
	private static final int NUMBERS_SIZE = 12;

    private static final int FULL_SIZE = NUMBERS_SIZE - 1;

    private static final int MINIMUM_SIZE = -1;
    private static final int INIMUM_SIZE_BUT_DIFRENT = -1;

	
	private final int[] numbers = new int[NUMBERS_SIZE];

	public int total = MINIMUM_SIZE;

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
