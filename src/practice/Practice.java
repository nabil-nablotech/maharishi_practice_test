/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice;

/**
 *
 * @author Nabil Mohammed
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    //145 page exercises
    //pg1 , Q1
    static int isEvens(int n) {
        while (n != 0) {
            if ((n % 10) % 2 != 0) {
                return 0;
            }
            n = n / 10;
        }

        return 1;
    }

    //pg1 , Q2
    static int isMagicArray(int[] a) {
        int sum = 0;
        if (a.length == 1 && (a[0] == 0 || a[0] == 1)) {
            return 0;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 2; j < a[i]; j++) {
                if (a[i] % j == 0) {
                    break;
                }
                if (j == a[i] - 1) {
                    sum += a[i];
                }
            }
        }
        if (sum == a[0]) {
            return 1;
        }

        return 0;
    }

    //To be used for other questions 
    static int isPrime(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    //pg3 , Q1
    static int isPrimeProduct(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i) == 1 && n % i == 0) {
                if (isPrime(n / i) == 1) {
                    return 1;
                }
            }
        }
        return 0;
    }

    //pg4 , Q2
    static int isBalanced(int[] a) {

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0 && a[i] % 2 != 0) {
                return 0;
            }

            if (i % 2 != 0 && a[i] % 2 == 0) {
                return 0;
            }
        }
        return 1;
    }

    //pg4 , Q3
    static int isCentered(int[] a) {
        if (a.length % 2 == 0) {
            return 0;
        }

        int middleIndex = (a.length - 1) / 2;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= a[middleIndex] && middleIndex != i) {
                return 0;
            }
        }
        return 1;
    }

    //pg5 , Q1
    static boolean hasKSmallFactors(int k, int n) {

        for (int i = 1; i < n; i++) {
            if (i >= k) {
                return false;
            }
            if (n % i == 0 && n / i < k) {
                return true;
            }

        }

        return false;
    }

    //pg6 , Q2
    static int[] fill(int[] arr, int k, int n) {
        if (n < 0 || k < 0) {
            return null;
        }
        int[] arr2 = new int[n];
        int kIndex = 0;

        for (int i = 0; i < n; i++) {
            if (kIndex == k) {
                kIndex = 0;
            }
            arr2[i] = arr[kIndex];
            kIndex++;
        }

        return arr2;
    }

    //pg7 , Q1
    static int minDistance(int n) {
        int min = n - 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                for (int j = i + 1; j < n; j++) {
                    if (n % j == 0 && j - i < min) {
                        min = j - i;
                        break;
                    }
                }
            }
        }

        return min;
    }

    //pg7 , Q2
    static int isWave(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] % 2 == 0 && a[i + 1] % 2 == 0) {
                return 0;
            }
            if (a[i] % 2 != 0 && a[i + 1] % 2 != 0) {
                return 0;
            }
        }

        return 1;
    }

    //pg8 , Q3
    static int isBean(int a[]) {
        boolean containsNine = false;
        boolean containsThirteen = false;
        boolean containsSeven = false;
        boolean containsSixteen = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 9) {
                containsNine = true;
            }
            if (a[i] == 7) {
                containsSeven = true;
            }
            if (a[i] == 13) {
                containsThirteen = true;
            }
            if (a[i] == 16) {
                containsSixteen = true;
            }
        }

        if (containsNine && !containsThirteen) {
            return 0;
        }
        if (containsSeven && containsSixteen) {
            return 0;
        }

        return 1;

    }

    //pg8 , Q1
    static int countDigit(int n, int d) {
        if (n < 0 || d < 0) {
            return -1;
        }
        int digitCount = 0;
        int num = n;

        while (num != 0) {
            int x = num % 10;
            if (x == d) {
                digitCount++;
            }
            num /= 10;
        }

        return digitCount;

    }

    //pg9 , Q2
    static int isBunkerArray(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] % 2 != 0 && isPrime(a[i + 1]) == 1) {
                return 1;
            }
        }
        return 0;

    }

    //pg9 , Q3
    static int isMeera(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] * 2 == a[j]) {
                    return 0;
                }
            }
        }
        return 1;
    }

    //pg10 , Q1
    static int isAnotherMeera(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        if (n % count == 0) {
            return 1;
        }

        return 0;
    }

    //pg10 , Q2
    static int isAnotherBunkerArray(int[] a) {
        boolean containsOne = false;
        boolean containsPrime = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                containsOne = true;
            }
            if (isPrime(a[i]) == 1) {
                containsPrime = true;
            }
            if (containsOne && containsPrime) {
                return 1;
            }
        }

        return 0;
    }

    //pg11 , Q3
    static int isNice(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean containsValue = false;
            for (int j = 0; j < a.length; j++) {
                if ((a[j] == a[i] - 1) || (a[j] == a[i] + 1)) {
                    containsValue = true;
                }
            }

            if (!containsValue) {
                return 0;
            }
        }

        return 1;
    }

    //pg13 , Q2
    static int isTwin(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i]) == 1) {
                if (isPrime(a[i] + 2) == 1 || isPrime(a[i] - 2) == 1) {
                    boolean twinFound = false;
                    for (int j = 0; j < a.length; j++) {

                        if ((isPrime(a[j]) == 1 && a[j] == a[i] + 2) || (isPrime(a[j]) == 1 && a[j] == a[i] - 2)) {
                            twinFound = true;
                            break;
                        }
                    }
                    if (!twinFound) {
                        return 0;
                    }
                }
            }
        }

        return 1;

    }

    //pg13 , Q3
    static int isSetEqual(int[] a, int[] b) {
        if (a.length == 0 && b.length == 0) {
            return 1;
        } else if (a.length == 0 && b.length > 0) {
            return 0;
        } else if (a.length > 0 && b.length == 0) {
            return 0;
        }

        if (a.length >= b.length) {
            for (int i = 0; i < a.length; i++) {
                boolean valueExists = false;
                for (int j = 0; j < b.length; j++) {
                    if (a[i] == b[j]) {
                        valueExists = true;
                        break;
                    }
                }

                if (!valueExists) {
                    return 0;
                }
            }
        } else {
            for (int i = 0; i < a.length; i++) {
                boolean valueExists = false;
                for (int j = 0; j < b.length; j++) {
                    if (a[i] == b[j]) {
                        valueExists = true;
                        break;
                    }
                }
                if (!valueExists) {
                    return 0;
                }
            }
        }

        return 1;
    }

    //pg13 , Q1
    static int isSmart(int n) {
        int kElement = 1;

        if (n == 1) {
            return 1;
        }

//        0989407410 idris
        for (int i = 2; i <= n; i++) {

            kElement += (i - 1);

            if (kElement == n) {
                return 1;
            }
        }

        return 0;
    }

    //pg14 , Q3
    static int isComplete(int[] a) {
        int maxEven = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) {
                return 0;
            }
            if (a[i] % 2 == 0 && maxEven < a[i]) {
                maxEven = a[i];
            }
        }

        for (int j = 2; j < maxEven; j++) {
            if (j % 2 == 0) {
                boolean valueExists = false;
                for (int k = 0; k < a.length; k++) {
                    if (a[k] == j) {
                        valueExists = true;
                        break;
                    }
                }
                if (!valueExists) {
                    return 0;
                }

            }
        }
        return 1;
    }

    //pg15 , Q1
    static int isFactorEqual(int n, int m) {
        int nCount = 0;
        int mCount = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                nCount++;
            }
        }

        for (int i = 1; i <= m; i++) {
            if (m % i == 0) {
                mCount++;
            }
        }

        if (nCount == mCount) {
            return 1;
        }

        return 0;
    }

    //pg15 , Q2
    static int isAnotherTwoMeera(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= i) {
                return 0;
            }
            sum += a[i];
        }

        if (sum == 0) {
            return 1;
        }

        return 0;
    }

    //pg16 , Q3
    static int isTriple(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
                if (count > 3) {
                    return 0;
                }
            }
            if (count != 3) {
                return 0;
            }
        }

        return 1;
    }

    //pg17 , Q1
    static int isFibonacci(int n) {
        if (n == 1) {
            return 1;
        }

        int kMinusOne = 1;
        int kMinusTwo = 0;

        for (int i = 1; i <= n; i++) {
            int result = kMinusOne + kMinusTwo;

            if (result == n) {
                return 1;
            }

            kMinusTwo = kMinusOne;
            kMinusOne = result;
        }
        return 0;
    }

    //pg17 , Q2
    static int isAnotherThreeMeera(int[] a) {
        boolean zeroExists = false;
        boolean primeExists = false;

        for (int i = 0; i < a.length; i++) {
            if (!zeroExists && a[i] == 0) {
                zeroExists = true;
            }
            if (!primeExists && isPrime(a[i]) == 1) {
                primeExists = true;
            }
        }

        if (zeroExists && primeExists) {
            return 1;
        }
        if (!zeroExists && !primeExists) {
            return 1;
        }

        return 0;
    }

    //pg18 , Q3
    static int isAnotherBean(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean valueExists = false;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == a[i] + 1 || a[j] == a[i] - 1) {
                    valueExists = true;
                    break;
                }

            }
            if (!valueExists) {
                return 0;
            }
        }

        return 1;
    }

    //pg19 , Q1
    static int isFancy(int n) {
        int result = 0;
        int fancy1 = 1;
        int fancy2 = 1;

        if (n == 1) {
            return 1;
        }

        for (int i = 2; i <= n; i++) {
            result = (3 * fancy1) + (2 * fancy2);
            if (result == n) {
                return 1;
            }
            fancy2 = fancy1;
            fancy1 = result;
        }

        return 0;
    }

    //pg20 , Q2
    static int isAnotherFourMeera(int[] a) {
        boolean oneExists = false;
        boolean nineExists = false;

        for (int i = 0; i < a.length; i++) {
            if (!oneExists && a[i] == 1) {
                oneExists = true;
            }
            if (!nineExists && a[i] == 9) {
                nineExists = true;
            }
        }

        if (oneExists && nineExists) {
            return 1;
        }
        if (!oneExists && !nineExists) {
            return 1;
        }

        return 0;
    }

    //pg20 , Q3
    static int isAnotherBeanArray(int[] a) {
        if (a.length == 0) {
            return 0;
        }

        for (int i = 0; i < a.length; i++) {
            boolean valueExists = false;
            for (int j = 0; j < a.length; j++) {
                if ((a[j] == 2 * a[i]) || (a[j] == (2 * a[i]) + 1) || (a[j] == a[i] / 2)) {
                    valueExists = true;
                    break;
                }
            }
            if (!valueExists) {
                return 0;
            }
        }

        return 1;
    }

    //pg21 , Q1
    static int isAnotherBunker(int n) {
        int result = 0;
        int kMinusOne = 1;
        if (n == 1) {
            return 1;
        }

        for (int i = 2; i <= n; i++) {
            result = kMinusOne + (i - 1);

            if (result == n) {
                return 1;
            }
            kMinusOne = result;
        }

        return 0;
    }

    //pg21 , Q2
    static int isDual(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }

                if (count > 2) {
                    return 0;
                }
            }

            if (count != 2) {
                return 0;
            }
        }
        return 1;
    }

    //pg22 , Q3
    static int isFilter(int[] a) {
        boolean nineExists = false;
        boolean elevenExists = false;
        boolean thirteenExists = false;
        boolean sevenExists = false;

        for (int i = 0; i < a.length; i++) {
            if (!nineExists && a[i] == 9) {
                nineExists = true;
            }
            if (!elevenExists && a[i] == 11) {
                elevenExists = true;
            }
            if (!sevenExists && a[i] == 7) {
                sevenExists = true;
            }
            if (!thirteenExists && a[i] == 13) {
                thirteenExists = true;
            }
        }

        if (nineExists && !elevenExists) {
            return 0;
        }
        if (sevenExists && thirteenExists) {
            return 0;
        }

        return 1;
    }

    //pg23 , Q1
    static int isAnotherBalanced(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0 && a[i] % 2 != 0) {
                return 0;
            }
            if (i % 2 != 0 && a[i] % 2 == 0) {
                return 0;
            }
        }

        return 1;
    }

    //pg23 , Q2
    static int isOddHeavy(int[] a) {
        boolean oddExists = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                oddExists = true;
                for (int j = 0; j < a.length; j++) {
                    if (a[j] % 2 == 0 && a[i] < a[j]) {
                        return 0;
                    }
                }
            }

        }
        if (oddExists) {
            return 1;
        }
        return 0;

    }

    //pg24 , Q3
    static int isNormal(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0 && i % 2 != 0) {
                return 0;
            }
        }
        return 1;
    }

    //pg24 , Q1
    static int isAnotherCentered(int[] a) {
        if (a.length % 2 == 0) {
            return 0;
        }
        int middleIndex = a.length / 2;
        for (int i = 0; i < a.length; i++) {

            if (i != middleIndex && a[i] <= a[middleIndex]) {
                return 0;
            }
        }
        return 1;
    }

    //pg25 , Q2
    static int isAnotherDual(int[] a) {
        if (a.length % 2 != 0) {
            return 0;
        }

        if (a.length >= 2) {
            int sum = a[0] + a[1];
            for (int i = 2; i < a.length - 1; i += 2) {
                if (a[i] + a[i + 1] != sum) {
                    return 0;
                }
            }
        }

        return 1;
    }

    //pg25 , Q3
    static int isAllPossiblities(int[] a) {
        if (a.length == 0) {
            return 0;
        }

        for (int i = 0; i < a.length; i++) {
            boolean valueExists = false;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) {
                    valueExists = true;
                    break;
                }
            }
            if (!valueExists) {
                return 0;
            }
        }

        return 1;
    }

    //pg26 , Q1
    static int factorTwoCount(int n) {
        int count = 0;
        int x = n;
        while (x % 2 == 0) {
            count++;
            x = x / 2;
        }
        return count;
    }

    //pg26 , Q2
    static int isDaphine(int[] a) {
        boolean oddExists = false;
        int start = 0;
        int end = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                start++;
            }
            if (a[i] % 2 != 0) {
                oddExists = true;
                break;
            }
        }

        if (!oddExists) {
            return 0;
        }

        for (int i = a.length - 1; i > 0; i--) {
            if (a[i] % 2 == 0) {
                end++;
            }
            if (a[i] % 2 != 0) {
                break;
            }
        }

        if (start == end) {
            return 1;
        }

        return 0;
    }

    //pg27 , Q3
    static int goodSpread(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
                if (count > 3) {
                    return 0;
                }
            }
        }
        return 1;
    }

    //pg29 , Q1
    static int sumDigits(int n) {
        int sum = 0;
        if (n < 0) {
            n *= -1;
        }

        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

    //pg30 , Q3
    static int isAnotherTwoDual(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
                if (count > 2) {
                    return 0;
                }
            }
            if (count != 0) {
                return 0;
            }
        }
        return 1;
    }

    //pg31 , Q1
    static int isGuthrie(int n) {
        int kelement = 1;
        if (n == 1) {
            return 1;
        }
        for (int i = 2; i <= n; i++) {
            kelement += (i - 1);
            if (kelement == n) {
                return 1;
            }
        }
        return 0;
    }

    //pg31 , Q3
    static int isAnotherComplete(int[] a) {
        int maxEven = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) {
                return 0;
            }
            if (a[i] % 2 == 0 && a[i] > maxEven) {
                maxEven = a[i];
            }
        }
        for (int i = 2; i <= maxEven; i = i + 2) {
            boolean valueExists = false;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) {
                    valueExists = true;
                    break;
                }
            }
            if (!valueExists) {
                return 0;
            }
        }
        return 1;
    }

    //pg39 , Q1
    static int isPascal(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            if (sum == n) {
                return 1;
            }
        }

        return 0;
    }

    //pg48 , Q3
    static int countMax(int[] a) {
        int max = 0;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (max == a[i]) {
                count++;
            }

            if (max < a[i]) {
                max = a[i];
                count = 1;
            }
        }

        return count;
    }

    static class FinalPreparation {

        static int isEvens(int n) {
            while (n != 0) {
                int x = n % 10;
                if (x % 2 != 0) {
                    return 0;
                }
                n /= 10;
            }

            return 1;
        }

        static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;

        }

        static int isMagicArray(int[] a) {
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                if (isPrime(a[i])) {
                    sum += a[i];
                }
            }

            if (sum == a[0]) {
                return 1;
            }
            return 0;
        }

        static int isComplete(int[] a) {

            if (a.length == 0) {
                return 0;
            }

            boolean evenExists = false;
            int max = a[0];
            int min = a[0];

            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 == 0) {
                    evenExists = true;
                    if ((min > a[i]) || min % 2 != 0) {
                        min = a[i];
                    }
                    if (max < a[i] || max % 2 != 0) {
                        max = a[i];
                    }
                }
            }

            if ((min == max) || !evenExists) {
                return 0;
            }

            for (int i = min + 1; i < max; i++) {
                boolean valueExists = false;
                for (int j = 0; j < a.length; j++) {
                    if (i == a[j]) {
                        valueExists = true;
                        break;
                    }
                }
                if (!valueExists) {
                    return 0;
                }

            }

            return 1;
        }

        static int isContinuousFactored(int n) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    int product = i;
                    for (int j = i + 1; i < n; j++) {
                        if (n % j != 0) {
                            break;
                        } else {
                            product *= j;
                            if (product == n) {
                                return 1;
                            }
                        }
                    }
                }
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {2, 2};

        int[] b = {1, 7, 8};
        System.out.println(FinalPreparation.isContinuousFactored(90));
    }

}
