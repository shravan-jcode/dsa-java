
import java.util.Scanner;

class HashTable {

	private static final int SIZE = 10;
	private final int[] hashTable;

	public HashTable() {
		hashTable = new int[SIZE];

		for (int i = 0; i < SIZE; i++) {
			hashTable[i] = -1;
		}
	}

	private int hashFunction(int key) {
		return key % SIZE;
	}

	public void insertLinearProbing(int key) {

		int index = hashFunction(key);

		int startIndex = index;

		while (hashTable[index] != -1) {

			System.out.println("\n Collision found at address " + index + " for " + key);

			System.out.println("Searching next empty slot using linear probing!");

			index = (index + 1) % SIZE;

			if (index == startIndex) {

				System.out.println("\n Hash table is full. Cannot insert" + key);
				return;
			}
		}

		System.out.println("\n No collision at address " + index + " for " + key);

		hashTable[index] = key;
	}

	public void displayProbing() {

		System.out.println("\n\n Final hash table:");

		for (int i = 0; i < SIZE; i++) {
			if (hashTable[i] != -1)

			{
				System.out.println("Index" + i + ": " + hashTable[i]);

			} else {
				System.out.println("Index" + i + " :NULL");
			}
		}
	}
}

public class ModDivHash {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		HashTable ht = new HashTable();

		System.out.println("Hashing using modulo division with Linear Probing");
		System.out.print("\n Enter comma-intergrated integer values: ");

		String input = scanner.nextLine();

		String[] values = input.split(",");
		System.out.println("\n Processing input values...");

		for (String value : values) {
			try {
				int key = Integer.parseInt(value.trim());
				ht.insertLinearProbing(key);

			} catch (NumberFormatException e) {
				System.out.println("Invalid input ignored:" + value);
			}
		}

		ht.displayProbing();
		scanner.close();

	}

}
