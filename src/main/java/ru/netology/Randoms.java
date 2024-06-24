package ru.netology;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private int min;
    private int max;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int randomNuber = 0;
            boolean isResult = false;

            @Override
            public boolean hasNext() {
                if (randomNuber != 100)
                    isResult = true;

                return isResult;
            }

            @Override
            public Integer next() {
                randomNuber = random.nextInt(max - min + 1) + min;
                return randomNuber;
            }
        };
    }
}