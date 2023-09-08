package prgrammersChallenges.PC_01_firstDay;

// 문자열 str과 정수 n이 주어질 때, str이 n번 반복된 문자열을 만들어 출력 하는 코드를 작성해 주세요

import java.util.Scanner;

public class PrintTheStringRepeatedly {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str = sc.next();
    int n = sc.nextInt();

    System.out.println(str.repeat(n));
  }
}
