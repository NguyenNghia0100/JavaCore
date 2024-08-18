package nguyennghia;

import java.util.Scanner;

public class lap01 {
//		Viết chương trình cho phép nhập tên sinh viên, điểm trung bình từ bàn phím.
//		In ra màn hình với định dạng:
//		<tên_sinh_viên> có điểm = <điểm>
//		Ví dụ: "Eric" có điểm = 9.6
//		<tên sinh viên>: Eric
//		<điểm> : 10
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập tên sinh viên: ");
		String tsv = scanner.nextLine();

		System.out.println("Điểm đầu: ");
		int num1 = scanner.nextInt();

		System.out.println("Điểm cuối: ");
		int num2 = scanner.nextInt();

		System.out.println("Tên sinh viên:  " + tsv);
		System.out.println(" Điểm trung bình là: " + (num1 + num2) / 2);
		scanner.close();

	}
}
