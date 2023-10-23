package ru.strebkov;

import java.util.Iterator;
import java.util.Random;
import java.util.PrimitiveIterator;


public class Randoms implements Iterable<Integer> {
    //protected Random random;
    protected PrimitiveIterator.OfInt random;

    public Randoms(int min, int max) {
        random = new Random().ints(min, (max + 1)).iterator();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomsIterator(this);
    }
}
