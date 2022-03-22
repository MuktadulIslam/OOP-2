package classTest_1;

public class GeneticMethodTest {

    public GeneticMethodTest() {
        Integer [] integerArray = {45, 6, 9, 52, 11, 65, 70, 102, 69};
        Character [] characterArray = {'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'};
        Double [] doubleArray = {4.11, 4.86, 684.364, 49.25, 63.021, 3.0256};

        System.out.println("This is GenericMethodTest......");
        System.out.println("integerArray contains: ");
        printArray(characterArray);
        System.out.println("characterArray contains: ");
        printArray(integerArray);
        System.out.println("doubleArray contains: ");
        printArray(doubleArray);
    }

    public static <BINDU> void printArray(BINDU [] array) {
        for (BINDU arr : array)
            System.out.print(arr + "  ");
        System.out.println();
    }
}
