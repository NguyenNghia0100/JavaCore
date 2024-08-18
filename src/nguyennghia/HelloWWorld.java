package nguyennghia;

import java.util.Scanner;

public class HelloWWorld {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập tên sinh viên: ");
		String tsv = scanner.nextLine();

		System.out.println("Điểm đầu: ");
		int num1 = scanner.nextInt();

		System.out.println("Điểm cuối: ");
		int num2 = scanner.nextInt();

		System.out.println("Tên sinh viên:  " + tsv + " Điểm trung bình là: " + (num1 + num2) / 2);
		scanner.close();

	}
}
