package work.service;

import work.dao.UserDaoImpl;
import work.entiy.Record;

import java.util.Objects;
import java.util.Scanner;

public class UserService {
	Record r = new Record();
	public UserService() {
		String[] userId = new String[99];
		boolean pd1 = true;
		boolean pd2;
		boolean pd3 = true;
		Scanner sc = new Scanner(System.in);
		String begin = "";
		String choice;
		long t1, t2;
		do {
			System.out.println("请输入用户ID，范例：AB1234，要求两位大写英文字母加上四位阿拉伯数字");
			do {
				userId[r.a] = sc.next();
				if ((userId[r.a].length() == 6) &&
						(userId[r.a].charAt(0) >= 'A' && userId[r.a].charAt(0) <= 'Z') &&
						(userId[r.a].charAt(1) >= 'A' && userId[r.a].charAt(1) <= 'Z') &&
						(userId[r.a].charAt(2) >= '0' && userId[r.a].charAt(2) <= '9') &&
						(userId[r.a].charAt(3) >= '0' && userId[r.a].charAt(3) <= '9') &&
						(userId[r.a].charAt(4) >= '0' && userId[r.a].charAt(4) <= '9') &&
						(userId[r.a].charAt(5) >= '0' && userId[r.a].charAt(5) <= '9')) {
					r.setUserId(userId[r.a]);
					begin = r.getUserId(r.a);
					pd2 = true;
				} else {
					pd2 = false;
					System.out.println("输入错误，请重新输入");
				}
			} while (!pd2);
			System.out.println("恭喜输入正确，当前用户：" + begin + "，欢迎使用对小学生来说很幼稚，对大学生来说刚刚好的小学生计算器");
			System.out.println("----------------菜单如下-----------------");
			System.out.println("""
					1.测试计算
					2.本次测试数据
					3.历史数据打印
					4.退出""");
			System.out.println("请输入你的选择：");
			do {
				choice = sc.next();
				if (!Objects.equals(choice, "1") &&
						!Objects.equals(choice, "2") &&
						!Objects.equals(choice, "3") &&
						!Objects.equals(choice, "4"))
					System.out.println("输入错误，请重新输入");
				else break;
			} while (true);
			switch (choice) {
				case "1" -> {
					System.out.println("挑战开始");
					t1 = System.currentTimeMillis() / 1000;
					switch (new UserDaoImpl().calculator()) {
						case 0 -> {
							r.setScores(0);
							r.setEvaluation("差");
						}
						case 1 -> {
							r.setScores(10);
							r.setEvaluation("差");
						}
						case 2 -> {
							r.setScores(20);
							r.setEvaluation("差");
						}
						case 3 -> {
							r.setScores(30);
							r.setEvaluation("差");
						}
						case 4 -> {
							r.setScores(40);
							r.setEvaluation("差");
						}
						case 5 -> {
							r.setScores(50);
							r.setEvaluation("差");
						}
						case 6 -> {
							r.setScores(60);
							r.setEvaluation("及格");
						}
						case 7 -> {
							r.setScores(70);
							r.setEvaluation("及格");
						}
						case 8 -> {
							r.setScores(80);
							r.setEvaluation("良");
						}
						case 9 -> {
							r.setScores(90);
							r.setEvaluation("优");
						}
						case 10 -> {
							r.setScores(100);
							r.setEvaluation("优");
						}
					}
					t2 = System.currentTimeMillis() / 1000;
					r.setTimeDifference((int) (t2 - t1));
					r.a += 1;
					System.out.println("恭喜你做完了10道题目，请再次输入ID号");
				}
				case "2" -> {
					if (r.a == 0) {
						System.out.println("还没有你的数据呢");
					} else
						System.out.println(r.getUserId(r.a - 1) + " " + r.getScores(r.a - 1) + " " + r.getTimeDifference(r.a - 1) + "秒 " + r.getEvaluation(r.a - 1));
				}
				case "3" -> {
					for (int b = 0; b < r.a; b++) {
						if (Objects.equals(r.getUserId(b), begin)) {
							pd3 = false;
							System.out.println(r.getUserId(b) + " " + r.getScores(b) + " " +r.getTimeDifference(b) + "秒 " + r.getEvaluation(b));
						}
						if(pd3){
							System.out.println("还没有你的数据呢");
						}
					}
					if (r.a == 0){
						System.out.println("还没有你的数据呢");
					}
				}
				case "4" -> {
					System.out.println("程序已经安全退出");
					pd1 = false;
				}
				default -> System.out.println("输入错误，请重新输入");
			}
		} while (r.a != 99 && pd1);
	}
}
