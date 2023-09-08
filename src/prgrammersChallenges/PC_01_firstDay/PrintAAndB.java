package prgrammersChallenges.PC_01_firstDay;

// 정수 a와 b가 주어질 때, 각 수를 입력 받아 입출력 하는 코드를 작성해 보세요.

import java.util.Scanner;

public class PrintAAndB {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }
}
