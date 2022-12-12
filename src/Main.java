import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // 循环读入多组数据
    while (in.hasNextInt()) {
      int n = in.nextInt();

      // 计算划分数
      int count = getPartitionCount(n);
      System.out.println(count);
    }
  }

  // 计算划分数的函数
  private static int getPartitionCount(int n) {
    int[] p = new int[n + 1];
    p[0] = 1;

    // 使用循环枚举每个正整数
    for (int i = 1; i <= n; i++) {
      // 分别枚举不同的划分方案
      for (int j = i; j <= n; j++) {
        p[j] += p[j - i];
      }
    }

    // 返回划分数
    return p[n];
  }
}
