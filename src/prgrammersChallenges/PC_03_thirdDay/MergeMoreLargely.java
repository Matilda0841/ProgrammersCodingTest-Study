package prgrammersChallenges.PC_03_thirdDay;

// ⊕는 두 정수의 연산, 두 정수를 붙여서 쓴 값을 반환합니다. {12 ⊕ 3 = 123, 3 ⊕ 12 = 312}
//양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
//단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.

public class MergeMoreLargely {
  public static void main(String[] args) {
    int a = 99;
    int b = 8;
    System.out.println(solution(a, b));
  }

  static int solution(int a, int b) {
    int answer = 0;

    String temp1 = a + "" + b;
    String temp2 = b + "" + a;
    int te1 = Integer.parseInt(temp1);
    int te2 = Integer.parseInt(temp2);

    if (te1 < te2) {
      answer = te2;
    } else {
      answer = te1;
    }

    return answer;
  }
}
