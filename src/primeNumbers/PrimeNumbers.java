package primeNumbers;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println("La suma de los números primos hasta el 50 es: " + sumPrimeNumbersUnderFifty());
		System.out.println("La suma de los números primeros números primos es: " + sumFirstFiftyPrimeNumbers());

	}

	public static int sumPrimeNumbersUnderFifty() {
		int sum = 0;
		int limit = 50;
		for (int i = 0; i <=limit; i++) {
			if (isPrimeNumber(i)) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static int sumFirstFiftyPrimeNumbers() {
		int sum = 0;
		int count = 0;

		int i = 0;
		while (count < 51) {
			if (isPrimeNumber(i)) {
				sum = sum + i;
				count++;
			}
			i++;
		}
		return sum;
	}

	public static boolean isPrimeNumber(int number) {
		Boolean result = true;
		if (number < 4) {
			result = true;
		} else {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					result = false;
					break;
				}
			}
		}
		return result;
	}

}
