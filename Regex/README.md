## 정규표현식에 대해 알게된 내용 정리
<br/>

#### 길이 6 ~ 12 인 영문+숫자 조합의 문자열을 매칭 시키는 정규식 
* ^(?=.*[0-9])(?=.*[a-zA-Z])([a-zA-Z0-9]{6,12})$
* 정규식의 이론 중 전방탐색(?=)에 대해 알게 됐음

##### 전방탐색
전방탐색은 (?=정규식 패턴) 의 형태를 띄고 = 다음의 정규식 패턴을 문자열 안에서 찾아도 그 문자열을 소비하지 않음 (결과로 리턴하지 않음) <br/>
"1234567" 을 위의 정규식에 매칭시키면 (?=.*[a-zA-Z]) 때문에 문자열이 매칭되지 않음, 문자열에 a-zA-Z가 없기 때문임 <br/>
"abcdefr" 를 위의 정규식에 매칭시키면 (?=.*[0-9]) 때문에 문자열이 매칭되지 않음, 문자열에 [0-9] 가 없기 때문임 <br/>
결국 문자+숫자 조합이 되어야 문자열이 매칭됨