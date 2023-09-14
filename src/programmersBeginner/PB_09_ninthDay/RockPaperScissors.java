package programmersBeginner.PB_09_ninthDay;

// 가위 2 바위 0 보 5로 rsp로 매개변수가 주어질 때, rsp에 저장된 가위 바위 보를 모두 이기는
// 경우를 순서 대로 나타낸 문자열을 return 하도록 solution 메소드를 완성해 주세요.

public class RockPaperScissors {
  public static void main(String[] args) {
    String rsp = "2";
    System.out.println(solution(rsp));
  }
  static String solution(String rsp){
    String answer = "";
    String [] rspArr = rsp.split("");

    for (int i = 0; i<rspArr.length; i++){
      if (rspArr[i].equals("2")){
        answer += "0";
      } else if (rspArr[i].equals("0")){
        answer += "5";
      } else if (rspArr[i].equals("5")){
        answer += "2";
      }
    }

    return answer;
  }
}
