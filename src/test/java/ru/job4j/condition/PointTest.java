package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(2, 0);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to32then1() {
        double expected = 1;
        Point a = new Point(3, 2);
        Point b = new Point(2, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when06to45then4dot12() {
        double expected = 4.12;
        Point a = new Point(0, 6);
        Point b = new Point(4, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}