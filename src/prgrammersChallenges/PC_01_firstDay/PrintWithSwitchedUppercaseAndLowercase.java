package prgrammersChallenges.PC_01_firstDay;

// 영어 알파벳으로 이루어 진 문자열 str이 주어 집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로
// 변환 해서 출력 하는 코드를 작성해 주세요

import java.util.Scanner;

public class PrintWithSwitchedUppercaseAndLowercase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String a = sc.next();

    char[] b = a.toCharArray();

    for (int i = 0; i < b.length; i++) {
      if (Character.isLowerCase(b[i])) {
        b[i] = Character.toUpperCase(b[i]);
      } else if (Character.isUpperCase(b[i])) {
        b[i] = Character.toLowerCase(b[i]);
      }
    }

    String answer = new String(b);
    System.out.println(answer);

  }
}
