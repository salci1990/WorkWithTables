public class Zadanie18 {

    public void zadanie18() {

        String tab[] = new String[]{"ggg", "aaa", "bbb", "aaa", "ccc",
                "ddd", "ddd", "ggg", "hhh"};
        String value;

        for (int i = 0; i < tab.length; i++) {
            value = tab[i];
            for (int j = i + 1; j < tab.length; j++) {
                if (value == tab[j]) {
                    System.out.println(value);
                }
            }
        }
    }
}
