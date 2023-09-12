package prgrammersChallenges.PC_03_thirdDay;

// ⊕는 두 정수의 연산, 두 정수를 붙여서 쓴 값을 반환합니다. {12 ⊕ 3 = 123, 3 ⊕ 12 = 312}
// a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
//단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.

public class CompareTheOperationValuesOfTwoNumbers {
  public static void main(String[] args) {

    int a = 2;
    int b = 91;
    System.out.println(solution(a, b));

  }

  static int solution(int a, int b) {
    int answer = 0;

    String temp1 = a + "" + b;

    int te1 = Integer.parseInt(temp1);
    int te3 = a * b * 2;

    int maxConcate = Math.max(te1, te3);

    answer = maxConcate;
    return answer;
  }
}
