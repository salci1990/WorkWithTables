import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTests {

    Zadanie1 zadanie1 = new Zadanie1();
    Zadanie2 zadanie2 = new Zadanie2();
    Zadanie3 zadanie3 = new Zadanie3();
    Zadanie4 zadanie4 = new Zadanie4();
    Zadanie5 zadanie5 = new Zadanie5();
    int tab1[] = new int[]{50, -20, 0, 30, 40, 60, 10};
    int tab2[] = new int[]{50, -20, 0, 30, 40, 60, 50};
    int tab3[] = new int[]{1};

    @Test
    public void firstTaskFalseTest() {
        Assertions.assertFalse(zadanie1.task1(tab1));
    }

    @Test
    public void firstTaskTrueTest() {
        Assertions.assertTrue(zadanie1.task1(tab2));
    }

    @Test
    public void checkLengthOfTableFirstTask() {
        Assertions.assertFalse(zadanie1.task1(tab3));
    }

    @Test
    public void secondTaskFalseTest(){
        Assertions.assertFalse(zadanie2.task2(tab1, tab2));
    }

    @Test
    public void secondTaskTrueTest(){
        Assertions.assertFalse(zadanie2.task2(tab1, tab2));
    }

    @Test
    public void checkLengthOfTableSecondTask() {
        Assertions.assertFalse(zadanie2.task2(tab3, tab2));
    }

    @Test
    public void checkCorrectLengthOfTableThirdTask() {
        Assertions.assertEquals(2, zadanie3.task3(tab1, tab2));
    }

    @Test
    public void checkWrongLengthOfTableTHirdTask() {
        Assertions.assertEquals(1, tab3.length);
    }

    @Test
    public void checkCorrectValueForMultiplyColumnsTest() {
        Assertions.assertEquals(-8, zadanie4.task4());
    }

    @Test
    public void checkFunctionToChangePlaceWithValueLastToFirstTest() {
        Assertions.assertEquals(10, zadanie5.task5(tab1));
    }
}
