class Solution {
public int solution(String dartResult) {
		int answer = 0;
		int[] arr = new int[3]; // 기회가 3번이므로
    char[] arrSp = new char[3];
    int arrayCount = 0; // 몇 번째 다트를 던지는 것인지 Count
    // 점수 계산 로직
    for(int i = 0; i < dartResult.length();i++) {
        if(Character.isDigit(dartResult.charAt(i))) {
            int num = Character.getNumericValue(dartResult.charAt(i));
            char sdt;
            char sp = ' ';
            // num이 10인 경우 확인
            if(num == 1 && Character.getNumericValue(dartResult.charAt(i+1)) == 0) {
                num = 10;
                sdt = dartResult.charAt(i+2); // S, D, T
                if((i+3) < dartResult.length()) {
                    sp = dartResult.charAt(i+3);
                }
            } else { // num이 10이 아닌 경우
                sdt = dartResult.charAt(i+1); // S, D, T
                if((i+2) < dartResult.length()) {
                    sp = dartResult.charAt(i+2);
                }
            }
            // 영역 체크
            if(sdt == 'D') {
                arr[arrayCount] = num * num;
            } else if (sdt == 'T') {
                arr[arrayCount] = num * num * num;
            } else {
                arr[arrayCount] = num;
            }
            // # * 체크
            if(sp == '#' || sp == '*') {
                arrSp[arrayCount] = sp;
            }
						// 다트 점수에 대한 계산이 끝났으므로 ++
            arrayCount++;
            i ++;
        }

    }
		// 특수문자 연산 적용
    for(int i = 0; i < arrSp.length; i++) {
        if(arrSp[i] == '#') {
            arr[i] *= -1;
        } else if (arrSp[i] == '*') {
            if(i == 0) {
                arr[i] *= 2;
            } else {
                arr[i] *= 2;
                arr[i-1] *= 2;
            }
        }

    }
		// 정답 구하기
    for(int i = 0; i < arr.length; i++) {
        answer += arr[i];
    }

    return answer;
}
}
