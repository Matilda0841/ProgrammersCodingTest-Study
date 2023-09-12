package prgrammersChallenges.PC_02_secondDay;

// 두 개의 문자열 str1, str2가 공백으로 구분 되어 입력으로 주어집니다.
// apple pen >> applepen str1과 str2를 이어서 출력 하는 코드를 작성해 보세요

import java.util.Scanner;

public class PrintConcatenatedStrings {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();

    System.out.println(a + b);
  }
}
