package edu.kis.vh.nursery;

/**
 * Klasa reprezentująca domyślną wyliczankę opartą na tablicy.
 */
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

    /**
     * Dodaje nową wartość do wyliczanki, jeśli nie jest ona pełna.
     *
     * @param in wartość do dodania do wyliczanki
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy wyliczanka jest pusta.
     *
     * @return true, jeśli wyliczanka jest pusta, false w przeciwnym razie
     */
    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    /**
     * Sprawdza, czy wyliczanka jest pełna.
     *
     * @return true, jeśli wyliczanka osiągnęła maksymalną pojemność, false w przeciwnym razie
     */
    public boolean isFull() {
        return total == FULL_SIZE;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_RHYMER_INDICATOR;
        return numbers[total];
    }

    /**
     * Zwraca i usuwa ostatnio dodaną wartość z wyliczanki.
     *
     * @return ostatnia dodana wartość lub wskaźnik pustej wyliczanki, jeśli brak elementów
     *     
     */
    public int countOut() {
        if (callCheck())
            return EMPTY_RHYMER_INDICATOR;
        return numbers[total--];
    }

}
