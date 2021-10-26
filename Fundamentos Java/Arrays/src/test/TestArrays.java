package test;

public class TestArrays {

    public static void main(String[] args) {
        int edades[] = new int[3];
        System.out.println("edades = " + edades);

        int edades2[] = {1, 2, 3};

        System.out.println(edades2.length);

        System.out.println(edades2.toString());

        System.out.println(edades2[2]);

        System.out.println(edades2[1]);
        edades2[1] = 5;

        System.out.println(edades2[1]);

        for (int i = 0; i<edades2.length; i++) {

            System.out.printf("Edades de %d es: %d \n",i, edades2[i]);
        }

    }
}
