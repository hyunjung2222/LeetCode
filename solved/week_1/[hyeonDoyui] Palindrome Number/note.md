# 정리 노트

1. 음수인 경우 reverse 했을 때 대칭이 될 수 없으므로 return false
2. temp 가 0이 아닐 때 while문 반복
3. temp % 10 으로 일의 자리 숫자를 int로 변환하여 num에 저장
4. 기존의 reversed의 자리 숫자를 왼쪽으로 이동하고 일의 자리에 num 입력
5. temp /= 10을 하여 자리 숫자를 오른쪽으로 이동
6. reversed 와 x 의 값이 같으면 반환