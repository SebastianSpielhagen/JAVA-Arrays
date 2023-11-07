package org.spielhagen;

// Erklärung von Arrays. - Sebastian Spielhagen
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 4;
        numbers[1] = 9;
        numbers[2] = 7;
        numbers[3] = 5;
        numbers[4] = 6;

        int[] numbers2 = {4, 9, 14, 19, 24};

        // i = i + 1 / i = i - 1
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
            System.out.println(numbers[i]);
        }
        System.out.println();
        // for Schleife von vorne nach hinten gezählt. Beginnt bei 0 und geht bis 4
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }
        System.out.println();
        // Integer ist ein Wrapper für int (Comlex Data Type). Integer ist ein Objekt und int ist ein primitiver Datentyp
        // for each Schleife. Geht jedes Element durch und gibt es aus. Geht von vorne nach hinten.
        // for (variable (laufvariable) : array welches durchlaufen werden soll {
        //      was soll mit den werten in der variable gemacht werden
        for (Integer currywurst : numbers2) {
            System.out.println(currywurst);
        }
        System.out.println();
        // for Schleife von hinten nach vorne gezählt. Beginnt bei 4 und geht bis 0
        for (int i = numbers2.length - 1; i >= 0; i--) {
            System.out.println(numbers2[i]);
        }
    }

    public static void array(int number) {
        int[] numbers = new int[number];
    }
}
