public class Primes {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        boolean [] isPrime = new boolean[N + 1];
        // initialize all elements to True
        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        int p = 2;
        while (p * p <= N) {
            if (isPrime[p]) {
                int multiple = p * p;
                while (multiple <= N) {
                    isPrime[multiple] = false;
                    multiple += p;
                }
            }
            p++;
        }
        int primeCounter = 0;;
        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i] == true) {
                System.out.println(i);
                primeCounter++;
            }
        }
        System.out.println("There are " + primeCounter + " primes between 2 and " + N + " (" + ((int)(primeCounter * 100.0) / N) + "% are primes)");


    }
}