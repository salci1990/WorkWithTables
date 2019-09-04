public class Zadanie21 {

    public void zadanie21() {

//        Napisz program, który policzy maksymalny ciąg liczb, które występują po sobie.
//                tab = [49, 1, 3, 200, 2, 4, 70, 5]
//        maksymalny ciąg to 1,2,3,4,5
//        odpowiedź 5

        int tab[] = new int[]{49, 1, 3, 200, 2, 4, 70, 5};
        int value1 = 0;
        int value2 = 0;
        int counter = 1;
        for (int i = 0; i < tab.length; i++) {
            value1 = tab[i];
            for (int j = 0; j < tab.length; j++) {
                value2 = tab[j];
                if (value1 + 1 == value2) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}

