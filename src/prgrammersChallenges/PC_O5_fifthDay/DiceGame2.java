package prgrammersChallenges.PC_O5_fifthDay;

// 1부터 6  주사위 세 개 있습니다. 세 주사위를 굴렸을 때 나온 숫자를 각각 a, b, c라고 했을 때
// 얻는 점수는 다음과 같습니다.
// 1. 세 숫자가 모두 다르다면 a + b + c 점을 얻습니다.
// 2. 세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면
// (a + b + c) × (a2 + b2 + c2 )점을 얻습니다.
// 3. 세 숫자가 모두 같다면 (a + b + c) × (a2 + b2 + c2 ) × (a3 + b3 + c3 )점을 얻습니다.
//세 정수 a, b, c가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.

public class DiceGame2 {
  public static void main(String[] args) {
    int a = 4;
    int b = 4;
    int c = 4;

    System.out.println(solution(a, b, c));
  }
  static int solution(int a, int b, int c) {
    int answer = 0;

    if (a == b && b == c && a == c) {
      answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
    }else if (a==b || b==c || a==c) {
      answer = (a + b + c) * (a * a + b * b + c * c);
    }else {
      answer = a + b + c;
    }

    return answer;
  }
}
