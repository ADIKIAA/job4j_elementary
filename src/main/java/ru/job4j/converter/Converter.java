package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float inDollars = 140;
        float inEuro = 140;
        float expectedDollars = 2.3333333f;
        float expectedEuro = 2;
        float outDollars = Converter.rubleToDollar(inDollars);
        float outEuro = Converter.rubleToEuro(inEuro);
        boolean passedDollars = expectedDollars == outDollars;
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are " + outDollars + " dollars. Test result : " + passedDollars);
        System.out.println("140 rubles are " + outEuro + " euro. Test rurult : " + passedEuro);
    }
}
