package moa.classifiers;

class PrimeNumFinder {

    static public Boolean isPrime(int num) {

        num = Math.abs(num);
        Double sqrtNum = Math.sqrt(num);

        for (int i = 2; i <= sqrtNum; i++)
            if (num % i == 0)
                return false;

        return true;
    }
}