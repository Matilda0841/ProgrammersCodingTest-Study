package prgrammersChallenges.PC_02_secondDay;

// 문자열 my_string, overwrite_string과 정수 s가 주어집니다. 문자열 my_string의
// 인덱스 s부터 overwrite_string의 길이만큼을 문자열 overwrite_string으로 바꾼 문자열을
// return 하는 solution 함수를 작성해 주세요.

// 제한사항
// my_string와 overwrite_string은 숫자와 알파벳으로 이루어져 있습니다.
// 1 ≤ overwrite_string의 길이 ≤ my_string의 길이 ≤ 1,000
// 0 ≤ s ≤ my_string의 길이 - overwrite_string의 길이


public class OverlapOrSuperimposeTheStrings {
  static String solution(String my_string, String overwrite_string, int s) {
    String answer = "";

    char [] msChar = my_string.toCharArray();

    char [] osChar = overwrite_string.toCharArray();

    for (int i = 0; i < msChar.length; i++) {
      if (i >= s && i < s + osChar.length) {
        msChar[i] = osChar[i - s];
      }
    }

    answer = String.valueOf(msChar);

    return answer;
  }

  public static void main(String[] args) {
    String my_string = "he11owor1d";
    String overwrite_string = "lloworl";
    int s = 2;
    String result = solution(my_string, overwrite_string, s);

    System.out.println(result);
  }
}
