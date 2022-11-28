package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int rsl = left > right ? left : right;
        return rsl;
    }

    public static void main(String[] args) {
        int rls = Max.max(1, 1);
        System.out.println(rls);
    }
}
