// SV: Đỗ Quang Bách
// Do Quang Bach
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Un-comment (xoa dấu //) o bài ban muon chay:

        // new Bai1();
        // new Bai2();
        // new Bai3();
        // new Bai4();
         new Bai5();
        // new Bai6();
        // new Bai7();
        // new Bai8();
        // new Bai9();
    }
}

class Bai1 {
    Scanner sc = new Scanner(System.in);
    int n;
    int[] ArrList;

    Bai1() {
        while (true) {
            System.out.print("Enter n (1 <= n <= 100): ");
            n = sc.nextInt();
            if (n >= 1 && n <= 100) {
                break;
            }
            System.out.println("Invalid integer! Please enter again.");
        }

        ArrList = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            ArrList[i] = sc.nextInt();
        }

        int ArrSum = 0;
        for (int i = 0; i < ArrList.length; i++) {
            ArrSum += ArrList[i];
        }
        System.out.println(ArrSum);
    }
}

class Bai2 {
    Scanner sc = new Scanner(System.in);
    int n;
    int[] ArrList;

    Bai2() {
        while (true) {
            System.out.print("Enter n (1 <= n <= 100): ");
            n = sc.nextInt();
            if (n >= 1 && n <= 100) {
                break;
            }
            System.out.println("Invalid integer! Please enter again.");
        }

        ArrList = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            ArrList[i] = sc.nextInt();
        }

        int maxInt = ArrList[0];
        int minInt = ArrList[0];

        for (int i = 0; i < ArrList.length; i++) {
            if (ArrList[i] > maxInt) {
                maxInt = ArrList[i];
            }
            if (ArrList[i] < minInt) {
                minInt = ArrList[i];
            }
        }

        System.out.println("So lon nhat trong mang la " + maxInt);
        System.out.println("So nho nhat trong mang la " + minInt);
    }
}

class Bai3 {
    Scanner sc = new Scanner(System.in);
    int n;
    int[] ArrList;

    Bai3() {
        while (true) {
            System.out.print("Enter n (1 <= n <= 100): ");
            n = sc.nextInt();
            if (n >= 1 && n <= 100) {
                break;
            }
            System.out.println("Invalid integer! Please enter again.");
        }

        ArrList = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            ArrList[i] = sc.nextInt();
        }

        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < ArrList.length; i++) {
            if (ArrList[i] % 2 == 0) {
                evenCount += 1;
            } else {
                oddCount += 1;
            }
        }
        System.out.println("Co " + oddCount + " so le trong mang");
        System.out.println("Co " + evenCount + " so chan trong mang");
    }
}

class Bai4 {
    Scanner sc = new Scanner(System.in);
    int n;
    int x;
    int[] ArrList;

    Bai4() {
        while (true) {
            System.out.print("Enter array size n (n >= 1): ");
            n = sc.nextInt();
            if (n >= 1) {
                break;
            }
            System.out.println("Invalid integer! Please enter again.");
        }

        System.out.print("Enter target value x to search: ");
        x = sc.nextInt();

        ArrList = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            ArrList[i] = sc.nextInt();
        }

        boolean found = false;
        for (int num : ArrList) {
            if (x == num) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

class Bai5 {
    Bai5() {
        for (int i = 1; i < 10; i++) {
            System.out.println("2 x " + i + " = " + 2 * i);
        }
        System.out.println();

        for (int i = 1; i < 10; i++) {
            System.out.println("3 x " + i + " = " + 3 * i);
        }
        System.out.println();

        for (int i = 1; i < 10; i++) {
            System.out.println("4 x " + i + " = " + 4 * i);
        }
        System.out.println();

        for (int i = 1; i < 10; i++) {
            System.out.println("5 x " + i + " = " + 5 * i);
        }
        System.out.println();

        for (int i = 1; i < 10; i++) {
            System.out.println("6 x " + i + " = " + 6 * i);
        }
        System.out.println();

        for (int i = 1; i < 10; i++) {
            System.out.println("7 x " + i + " = " + 7 * i);
        }
        System.out.println();

        for (int i = 1; i < 10; i++) {
            System.out.println("8 x " + i + " = " + 8 * i);
        }
        System.out.println();

        for (int i = 1; i < 10; i++) {
            System.out.println("9 x " + i + " = " + 9 * i);
        }
        System.out.println();
    }
}

class Bai6 {
    Scanner sc = new Scanner(System.in);
    int n;

    Bai6() {
        while (true) {
            System.out.print("Enter integer n (2 <= n <= 10^6): ");
            n = sc.nextInt();
            if (n >= 1) {
                break;
            }
            System.out.println("Invalid integer! Please enter again.");
        }

        if ( 2 <= n && n <= (Math.pow(10, 6))) {
            System.out.println("NO");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

class Bai7 {
    Scanner sc = new Scanner(System.in);
    int n;

    Bai7() {
        while (true) {
            System.out.print("Enter year n (1000 <= n <= 9999): ");
            n = sc.nextInt();

            if (n >= 1000 && n <= 9999) {
                break;
            } else {
                System.out.println("Invalid integer! Please enter again.");
            }
        }

        if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
            System.out.println("LEAP");
        } else {
            System.out.println("COMMON");
        }
    }
}

class Bai8 {
    Scanner sc = new Scanner(System.in);
    int n;
    int sumDivide3 = 0;

    Bai8() {
        while (true) {
            System.out.print("Enter integer n (n >= 1): ");
            n = sc.nextInt();
            if (n >= 1) {
                break;
            }
            System.out.println("Invalid integer! Please enter again.");
        }

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                sumDivide3 += i;
            }
        }
        System.out.println("Tong cac so chia het cho 3 tu 1-n la:" + sumDivide3);
    }
}

class Bai9 {
    Scanner sc = new Scanner(System.in);
    int n;

    Bai9() {
        while (true) {
            System.out.print("Enter n (1 <= n <= 20): ");
            n = sc.nextInt();

            if (n >= 1 && n <= 20) {
                break;
            } else {
                System.out.println("Invalid integer! Please enter again.");
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}