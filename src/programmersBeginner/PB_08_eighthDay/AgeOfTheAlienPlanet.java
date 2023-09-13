package programmersBeginner.PB_08_eighthDay;

// 우주 여행을 하던 머쓱이는 엔진 고장으로 962행성에 불시착 하게 되었음
// 입국심사에서 나이를 말해야하는데 962행성은 나이를 알파벳 순으로 말합니다.
// a=0, b=1,c=2 이런 식으로 해서 23살은 cd, 51살은 fb가 됩니다.
// 나이 age가 매개변수로 주어질 때, 962식 나이를 return 하도록 solution 함수를 완성해 주세요.

public class AgeOfTheAlienPlanet {
  public static void main(String[] args) {
    int age = 23;
    System.out.println(solution(age));
  }

  static String solution (int age){
    String answer = "";

    String s = String.valueOf(age);
    String [] arr = s.split("");

    for (int i =0; i<arr.length; i++){
      answer += (char)(Integer.parseInt(arr[i])+97);
    }

    return answer;
  }
}
