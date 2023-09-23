public class GG3 {
    public static void main(String[] args) {
        System.out.println("1. Print number from 1 to 15");
        for (int i = 0; i <= 15; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n\n2. Print even numbers from -10 to 20");
        for (int i = -10; i <= 20; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
        for (int i = -10; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n\n3. Print * symbols using given number");
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("_________________");

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n\n4. Create an array with number 1-11");
        int[] array = new int[11];

        for (int i = 0, k = 1; i < array.length; i++, k++) {
            array[i] = k;
            // for (int i = 0; i < array.length; i++) {
            // array[i] = i + 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n\n5. Create an array with even numbers from -10 to 10");
        int[] array2 = new int[11];
        for (int i = 0, j = -10; i < array2.length; i++, j += 2) {
            array2[i] = j;
        }
        for (int i : array2) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n6. Given an array. print odd elements");
        int[] array3 = {4, 0, 5, 87, 9, 5, 1, 2, 3, 56, 4};
        for (int a : array3) {
            if (a % 2 != 0) // if (a % 2 ==1
                System.out.print(a + " ");
        }

        System.out.println("\n\n7. Given an array. print elements from -10 to 5");
        for (int a : array3) {
            if (a >= -10 && a <= 5)
                System.out.print(a + " ");
        }
        System.out.println("\n\n8. Given an array . print elements which can be divided 3 or 4");
        for (int a : array3) {
            if (a % 3 == 0 || a % 4 == 0)
                System.out.print(a + " ");
        }
        System.out.println("\n\n9. Given an array. print count of even elements");
        int countOfEvens = 0;
        for (int a : array3) {
            if (a % 2 == 0)
                countOfEvens++;
        }
        System.out.println("Count of even elements is " + countOfEvens);

        array3 = new int[]{4, 1, 9, -4, 13};
        System.out.println("\n\n10. Given an array. print sum of elements");
        int sum = array3[0];
        for (int i = 1; i < array3.length; i++) {
            sum = sum + array3[i];
        }
        System.out.println(sum);

        System.out.println("\n\n10. Given an array. print sum of positive elements");
        sum = 0;
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] > 0)
                sum += array3[i];
        }
        System.out.println(sum);
        System.out.println("\n\n11. Given an array. print multiplication of positive elements");
        int m = 1; //int m = array3[0];
        // for (int i = 1; i < array3.length; i++)
        for (int i = 0; i < array3.length; i++) {
            // if (array3[i] > 0)
            m = m * array3[i];
        }
        System.out.println(m);

        System.out.println("\n\n12. Find maximal element from array");
        int max = array3[0];
        for (int i = 1; i < array3.length; i++) {
            if (array3[i] > max)
                max = array3[i];
        }
        System.out.println(max);

        System.out.println("\n\n13. Find maximal element from array");
        int min = array3[0];
        for (int i = 1; i < array3.length; i++) {
            if (array3[i] < min)
                min = array3[i];
        }
        System.out.println(min);

        System.out.println("\n\n14. Find element which is alone");
        array = new int[]{4, 3, 1, 9, 1, 3, 4};
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            result = result ^ array[i];
        }
        System.out.println(result);

        System.out.println("\n\n14. Find element which is alone");
        array = new int[]{4, 3, -9, 2, 1, 445, 0, -748, 12, 1};
        int x = 3, y = 4;
        int z = x;
        x = y;
        y = z;
        System.out.println("x = " + x + " y = " + y);


        System.out.println("\n\n15. Sort array in asc.");
        for (int a : array) {
            System.out.print(a + " ");
        }
        boolean qaniDerIfMtnume = true;
        int countOfFors = 0;
        while (qaniDerIfMtnume) {
            qaniDerIfMtnume = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) { // if (array[i] < array[i + 1])
                    int zz = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = zz;
                    qaniDerIfMtnume = true;
                }
            }
            countOfFors++;
        }
        System.out.println();
        for (int a : array) {
            System.out.print(a + " ");
        }

    }
}




