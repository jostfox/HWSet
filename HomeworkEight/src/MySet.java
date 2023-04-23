import java.util.*;

public class MySet {

    public static void main(String[] args) {

        int[] arr = {1, 1, 5, 3, 3, 4, 3, 2, 4, 2, 7, 6, 9, 11, 14, 1, 7, 15, 0, 8};
        setUnique(arr);
        doubledElem(arr);

        Set<CarStock> carStockSet = new HashSet<>();
        CarStock opelOne = new CarStock("Opel", "Signum", 2005);
        CarStock audi = new CarStock("Audi", "A6", 2010);
        CarStock bmw = new CarStock("BMW", "530", 2012);
        CarStock opelTwo = new CarStock("Opel", "Signium", 2018);
        CarStock mercedes = new CarStock("Mercedes", "E300", 2015);
        carStockSet.add(opelOne);
        carStockSet.add(audi);
        carStockSet.add(bmw);
        carStockSet.add(opelTwo);
        carStockSet.add(mercedes);

        System.out.println("=================\n");
        carStockSet.forEach(csElement -> System.out.println(csElement));
        System.out.println("Size before loosing: " + carStockSet.size());
        System.out.println("=================\n");

        opelTwo.setCarModel("Signum");
        opelTwo.setYearOfBuild(2005);

        System.out.println(carStockSet);

        for (CarStock cars : carStockSet) {
            if (carStockSet.contains(cars)) {
                System.out.println(cars + " ");
            }
        }


        System.out.println("");

        System.out.println("Size  after loosing: " + carStockSet.size());
    }

    public static void setUnique(int[] array) {
        SortedSet<Integer> uniqueTree = new TreeSet<>();
        for (int arrayElem : array) {
            uniqueTree.add(arrayElem);
        }
        System.out.println(uniqueTree);
    }

    public static void doubledElem(int[] array) {
        SortedSet<Integer> dbElem = new TreeSet<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    dbElem.add(array[j]);
                }
            }
        }
        System.out.println(dbElem);
    }
}














