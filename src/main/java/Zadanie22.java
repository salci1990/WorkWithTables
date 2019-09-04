public class Zadanie22 {

    public void zadanie22() {

//        Napisz program, który policzy  jakich liczb jest najwięcej.
//                tab = [1, 1, 3, 2, 2, 7, 4, 5, 7, 5, 7]
//        odpowiedź - najwięcej jest 7 - 3x

        int tab1[] = new int[]{1, 1, 3, 2, 2, 7, 4, 7, 5, 7};
        int value = 0;
        for (int i = 0; i < tab1.length; i++) {
            value = tab1[i];
            for (int j = 0; j < tab1.length; j++) {
                if (value < tab1[j]) {
                    value = tab1[j];
                }
            }
        }
        int tab2[] = new int[value + 1];
        for (int i = 0; i < tab1.length; i++) {
            tab2[tab1[i]]++;
        }

        for (int i = 0; i < tab2.length; i++) {
            if (value < tab2[i]) {
                value = tab2[i];
            }
        }
        System.out.println("Liczba: " + value + " wystepuje: " + tab2[value] + " razy.");
    }
}

