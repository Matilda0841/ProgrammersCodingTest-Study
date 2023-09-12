package prgrammersChallenges.PC_02_secondDay;

// 두 정수 a, b가 주어질 때 a+b = c 형태의 계산식을 출력 하는 코드를 작성해 주세요

import java.util.Scanner;

public class PrintTheAdditionExpression {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println(a + " + " + b + " = " + (a + b));
  }
}
