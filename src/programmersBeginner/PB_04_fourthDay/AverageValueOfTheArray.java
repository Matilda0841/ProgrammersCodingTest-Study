package programmersBeginner.PB_04_fourthDay;

// 정수 배열 numbers가 매개변수로 주어질 때, numbers의 원소의 평균 값을
// return하도록 solution 함수를 완성 해 주세요

public class AverageValueOfTheArray {
  public static void main(String[] args) {

    Solution solution = new Solution();
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    double answer = solution.solution(numbers);

    System.out.println(answer);
  }

  static class Solution {
    public double solution(int[] numbers) {

      double answer = 0;
      int plus = 0;
      for (int i = 0; i < numbers.length; i++) {
        plus = numbers[i] + plus;
      }
      answer = (double) plus / numbers.length;

      return answer;
    }
  }
}
