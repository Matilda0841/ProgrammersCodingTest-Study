package programmersBeginner.PB_06_sixthDay;

// 문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어 있는 각 문자를
// n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해 주세요.

public class RepeatAndPrintTheCharacter {
  static String solution(String my_string, int n) {
    String answer = "";
    for (int i = 0; i < my_string.length(); i++) {
      for (int j = 0; j < n; j++) {
        answer += my_string.charAt(i);
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    String my_string = "abc";
    int n = 3;

    System.out.println(solution(my_string, n));
  }
}
