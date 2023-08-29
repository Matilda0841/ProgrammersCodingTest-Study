package programmersBeginner.secondDay;

//첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1,
// 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어질때,
// 두 분수를 더한 값을 기약분수로 나타냈을 때 분자와 분모를 순서대로 다음 배열을 return하는 solution 함수를 작성해주세요.

// + 기약분수란?
// 기약분수는 분자와 분모의 최대공약수가 1인 분수를 말한다.
// + 최대공약수란?
// 최대공약수는 두 수의 공통된 약수 중 가장 큰 수를 말한다.


public class AdditionOfFractions {
  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] answer = solution.solution(2, 7, 3, 5);
    System.out.println(answer[0] + " " + answer[1]);
  }

  static class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
      int numer = numer1 * denom2 + numer2 * denom1;
      int denom = denom1 * denom2;
      int max = 1;
      for (int i = 1; i <= denom; i++) {
        if (numer % i == 0 && denom % i == 0) {
          max = i;
        }
      }
      numer = numer / max;
      denom = denom / max;

      int[] answer = {numer, denom};

      return answer;
    }
  }
}
