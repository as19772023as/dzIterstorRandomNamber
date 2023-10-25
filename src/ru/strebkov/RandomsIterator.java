package ru.strebkov;

import java.util.Iterator;
import java.util.Random;

public class RandomsIterator implements Iterator<Integer> {
    protected Randoms randoms;

    public RandomsIterator(Randoms randoms) {
        this.randoms = randoms;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return randoms.random.nextInt(randoms.max - randoms.min + 1) + randoms.min;
    }
}

