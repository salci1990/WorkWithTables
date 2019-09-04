public class Zadanie12 {

    public void zadanie12() {

//        Napisz program, który znajdzie te same elementy w dwóch
//        tablicach zawierających Stringi.
//
//                tab1  = a,b,c,d,e
//        tab2 = x,a,y,b,s,d
//        result = a,b,d

        String tab1[] = new String[]{"a", "b", "c", "d", "e"};
        String tab2[] = new String[]{"x", "a", "y", "b", "s", "d"};

        for (int i = 0; i < tab1.length; i++) {
            String value1 = tab1[i];
            for (int j = 0; j < tab2.length; j++) {
                if (value1 == tab2[j]) {
                    System.out.print(value1);
                }
            }
        }
    }
}
