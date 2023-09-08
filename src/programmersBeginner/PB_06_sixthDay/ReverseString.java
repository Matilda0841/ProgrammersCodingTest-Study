package programmersBeginner.PB_06_sixthDay;

// 문자열 my_string 이 매개변수로 주어질 때, my_string 을 거꾸로 뒤집어서 return 하는 함수, solution 을 완성해주세요.

public class ReverseString {
  public static void main(String[] args) {
    String my_string = "abcde";
    System.out.println(solution(my_string));
  }
  static String solution(String my_string) {
    StringBuilder answer = new StringBuilder();

    for (int i = 0; i < my_string.length(); i++){
      answer.append(my_string.charAt(my_string.length() - 1 - i));
    }

    return answer.toString();
  }

}
