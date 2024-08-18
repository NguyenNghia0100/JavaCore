package nguyennghia;

import java.util.Scanner;

public class lap02 {
//	 Viết chương trình nhập từ bàn phím 2 cạnh của 1 hình chữ nhật.
//	 Tính toán và in ra console:
//	 - chu vi hình chữ nhật
//	 - diện tích hình chữ nhật
//	 - cạnh nhỏ nhất của hình chữ nhật

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Chiều dài: ");
		int num1 = scanner.nextInt();

		System.out.println("Chiều rộng: ");
		int num2 = scanner.nextInt();

		System.out.println("Chu vi của hình chữ nhật là:  " + (num1 + num2) * 2);
		System.out.println("Cạnh nhỏ nhất của hình chữ nhật là: " + Math.min(num1, num2));
		scanner.close();

	}
}
