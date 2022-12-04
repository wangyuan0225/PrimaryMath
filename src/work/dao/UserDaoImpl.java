package work.dao;

import work.UserDao;

import java.util.Random;
import java.util.Scanner;

public class UserDaoImpl implements UserDao {
	/**
	 *加法运算
	 *
	 * @return answer
	 */
	@Override
	public int plus() {
		int first, last;
		do {
			first = 1 + (int) (Math.random() * 98);
			last = 1 + (int) (Math.random() * 98);
		} while (first + last >= 100 || first / 10 == 0 || last / 10 == 0);
		int answer = first + last;
		System.out.println(first + " + " + last + " = ");
		return answer;
	}

	/**
	 * 减法运算
	 *
	 * @return answer
	 */
	@Override
	public int minus() {
		int first, last;
		do {
			first = 1 + (int) (Math.random() * 98);
			last = 1 + (int) (Math.random() * 98);
		} while (first - last >= 100 || first - last <= 0 || first / 10 == 0 || last / 10 == 0);
		int answer = first - last;
		System.out.println(first + " - " + last + " = ");
		return answer;
	}

	/**
	 * 乘法运算
	 * @return answer
	 */
	@Override
	public int multiply() {
		int first, last;
		do {
			first = 1 + (int) (Math.random() * 98);
			last = 1 + (int) (Math.random() * 98);
		} while (first * last >= 100 || first * last < 10 || first == 1 || last == 1);
		int answer = first * last;
		System.out.println(first + " * " + last + " = ");
		return answer;
	}

	/**
	 * 除法运算
	 * @return answer
	 */
	@Override
	public int divide() {
		int first, last;
		do {
			first = 1 + (int) (Math.random() * 98);
			last = 1 + (int) (Math.random() * 98);
		} while (first % last != 0 || first / last == first || first / last == last || first == last);
		int answer = first / last;
		System.out.println(first + " / " + last + " = ");
		return answer;
	}

	@Override
	public int calculator() {
		int[] num = new int[11];
		int i = 0;
		int grade = 0;
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		num[0] = (int) (Math.random() * 3);
		do {
			do {
				num[i + 1] = r.nextInt(4);
			} while (num[i + 1] == num[i]);

			switch (num[i]) {
				case 0 -> {
					if (plus() == sc.nextInt()) {
						grade++;
					}
				}
				case 1 -> {
					if (minus() == sc.nextInt()) {
						grade++;
					}
				}
				case 2 -> {
					if (multiply() == sc.nextInt()) {
						grade++;
					}
				}
				case 3 -> {
					if (divide() == sc.nextInt()) {
						grade++;
					}
				}
			}
			i++;
		} while (i != 10);
		return grade;
	}

}
