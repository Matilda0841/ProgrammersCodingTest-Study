package prgrammersChallenges.PC_03_thirdDay;

// 문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.

public class MultiplyTheString {
  public static void main(String[] args) {
    String my_string = "love";
    int k = 5;
    System.out.println(solution(k, my_string));
  }
  static String solution(int k,String my_string ){
    String answer = "";

    for(int i = 0; i < k; i++){
      answer += my_string;
    }

    return answer;
  }
}
