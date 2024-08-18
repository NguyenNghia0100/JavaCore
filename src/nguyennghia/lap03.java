package nguyennghia;

import java.util.Scanner;

public class lap03 {
//	Viết chương trình nhập vào bàn phím cạnh của một khối lập phương.
//	Tính và xuất ra thể tích của hình lập phương.
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Canh: ");
		int canh = scanner.nextInt();

		System.out.println("Thể tích của khối lập phương là:  " + Math.pow(canh, 3));
		scanner.close();

	}
}
