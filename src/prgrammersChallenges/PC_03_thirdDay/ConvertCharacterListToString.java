package prgrammersChallenges.PC_03_thirdDay;

// 문자 배열 arr가 주어질 때, arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.

public class ConvertCharacterListToString {
  public static void main(String[] args) {
    String[] arr = {"a", "b", "c"};
    System.out.println(solution(arr));
  }

  static String solution(String[] arr) {
    String answer = "";

    for (int i = 0; i < arr.length; i++) {
      answer += arr[i];
    }

    return answer;
  }
}
