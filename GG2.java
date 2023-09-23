public class GG2 {
    public static void main(String[] args) {
        int[] a = new int[6];
        System.out.println(a[4]);
        a[0] = 4;
        a[1] = 74;
        a[3] = -7;
        a[4] = 1;
        a[5] = 1;
        System.out.println(a[0] + a[4]);
        System.out.println(a.length);
        System.out.println(a[0] + a[a.length - 1]);
        int[] array = {4, 1, -8, 0, 3, 4, 6};
        System.out.println(array[0]);
        System.out.println(array[array.length - 1]);

        int x = 4;
        if (x > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Non Positive");
        }

        int b;
        // if (x > 0)
        //  b = 1;
        // else
        //  b = 0;

        b = x > 0 ? 1 : 0;
        System.out.println(b);
        System.out.println(x > 0 ? "Positive" : "Non Positive");

        x = 0;
        if (x > 0) {
            System.out.println("Positive");
        } else {
            if (x < 0)
                System.out.println("Negative");
            else System.out.println("Zero");
        }
        System.out.println(x > 0 ? "Positive" : x < 0 ? "Negative" : "Zero");
        System.out.println("__________________");
        x = 2;
        switch (x) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Bigger");
        }
        System.out.println("--------------");
        int counter = 1;
        while (counter < 11) {
            System.out.print(counter++ + " "); // = counter++;
        }
        System.out.println("");
        x = 1;
        while (x <= 4) {
            System.out.println("Barev");
            x++;
        }
        System.out.println("--------------");
        x = 6;
        do {
            System.out.println("Barev");
            x++;
        } while (x <= 11);

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-------------------");
        String[] names = {"Hayk", "Anna", "Ani", "Mariam", "Karen"};
        for (int index = 0; index <= names.length - 1; index++) {
            System.out.println(names[index]);
        }
        System.out.println("________________");
        for (String s : names) {
            System.out.println(s);
        }
        System.out.println("________________");
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }

        int[] array2 = {4, -8, 4, 1, 3, -1};
        for (int element : array2)
            if (element < 0) {
                System.out.println("Ayo");
                break;
            }

        // for (int i = 1; i <= 10; i++) {
        // if (i != 5)
        // System.out.print(i + " ");

        for (int i = 1; i <= 10; i++) {
            if (i == 5)
                continue;
            System.out.print(i + " ");
        }
    }
}
