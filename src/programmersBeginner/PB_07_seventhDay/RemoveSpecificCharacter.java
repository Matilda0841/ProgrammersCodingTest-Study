package programmersBeginner.PB_07_seventhDay;

public class RemoveSpecificCharacter {
  static String solution (String my_string, String letter){
    String answer = "";
    for (int i = 0; i < my_string.length(); i++){
      if (my_string.charAt(i) != letter.charAt(0)){
        answer += my_string.charAt(i);
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    String my_string = "abcdefg";
    String letter = "f";

    System.out.println(solution(my_string, letter));
  }
}
