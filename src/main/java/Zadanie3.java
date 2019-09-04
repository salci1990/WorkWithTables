public class Zadanie3 {

    public int zadanie3(int tab1[], int tab2[]) {

//        Zadanie 3
//        Mając dwie tablice napisz program, który utworzy trzecią tablicę, dwuelementową,
//                która będzie składała się z pierwszego elementu z pierwszej tablicy i
//        ostatniego elementu z drugiej tablicy.
//
//                Przykład:
//        tab1: [50, -20, 0, 10, 13, 17]
//        tab2: [5, -50, 10]
//        tab3: [50, 10]

        int table1[] = new int[]{50, -20, 0, 10, 13, 50};
        int table2[] = new int[]{5, -50, 10, 8888};
        int table3[] = new int[2];

        table3[0] = table1[0];
        table3[1] = table2[table2.length - 1];

        if (table3.length > 2 && table3.length < 2) {

            for (int i = 0; i < table3.length; i++) {
                return table3[i];
            }
        }
        return table3.length;
    }
}
