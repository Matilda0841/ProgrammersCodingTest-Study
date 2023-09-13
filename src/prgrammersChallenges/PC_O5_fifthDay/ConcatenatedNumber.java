package prgrammersChallenges.PC_O5_fifthDay;

// 정수가 담긴 리스트 num_list가 주어집니다. num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.

public class ConcatenatedNumber {
  public static void main(String[] args) {
    int[] num_list = {2, 3, 5, 7, 6};
    System.out.println(solution(num_list));
  }

  static int solution(int[] num_list) {
    int answer = 0;
    StringBuilder odd = new StringBuilder();
    StringBuilder even = new StringBuilder();

    for (int n : num_list) {
      if (n % 2 == 0) {
        even.append(n);
      } else if (n % 2 == 1) {
        odd.append(n);
      }
    }

    int evenSum = Integer.parseInt(even.toString());
    int oddSum = Integer.parseInt(odd.toString());

    answer = evenSum + oddSum;

    return answer;
  }
}
