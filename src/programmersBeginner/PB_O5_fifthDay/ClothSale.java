package programmersBeginner.PB_O5_fifthDay;

// 머쓱이네 옷가게는 10만원 이상 사면 5%, 30만원 이상 사면 10%, 50만원 이상 사면 20%를 할인해준다.
// 구매한 옷의 가격 price가 주어질 때, 지불 해야 할 금액을 return하도록 solution 메서드를 완성해주세요.

public class ClothSale {
  public static void main(String[] args) {

    Solution solution = new Solution();
    int price = 150_000;

    System.out.println(solution.solution(price));
  }

  static class Solution {
    public int solution(int price) {
      int answer = 0;

      if (price >= 500_000) {
        answer = (int) (price * 0.8);
      } else if (500_000 > price && price >= 300_000) {
        answer = (int) (price * 0.9);
      } else if (300_000 > price && price >= 100_000) {
        answer = (int) (price * 0.95);
      } else {
        answer = price;
      }

      return answer;
    }
  }
}
