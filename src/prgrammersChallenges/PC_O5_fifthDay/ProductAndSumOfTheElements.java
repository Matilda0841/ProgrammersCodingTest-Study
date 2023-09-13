package prgrammersChallenges.PC_O5_fifthDay;

//정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의
// 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.

public class ProductAndSumOfTheElements {
  public static void main(String[] args) {
    int [] num_list = {3,4,5,2,1};
    System.out.println(solution(num_list));
  }

  static int solution(int[] num_list) {
    int answer = 0;

    int sum = 0;
    int product = 1;
    for (int num : num_list) {
      sum += num;
      product *= num;
    }
    sum = sum * sum;

    if (sum > product) {
      answer = 1;
    }

    return answer;
  }
}
