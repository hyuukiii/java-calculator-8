package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        System.out.println("더할 숫자를 입력하세요 : ");
        String input = Console.readLine(); // 1 2 3 입력

        // "1, 2, 3" ==> 을 구분자에 따라 다른 문자열 변환
        String[] numbers = input.split("[,:;]") ;

        if (input.startsWith("//")) {
            int    endString   = input.indexOf("\n");
            String delimeters  = input.substring(2,endString);
            String startNumIndex   = input.substring(endString +1);
        }

        // 반복문 밖에서 초기화 하기
        int parseSum = 0;
        for (String number : numbers) {
            int parseNums = Integer.parseInt(number);
            parseSum += parseNums;
        }

        System.out.println("합계 결과 :" + parseSum);
    }
}