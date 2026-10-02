# [level 1] 잡은 물고기 중 가장 큰 물고기의 길이 구하기 - 298515 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/298515) 

### 성능 요약

메모리: undefined, 시간: 

### 구분

코딩테스트 연습 > SUM， MAX， MIN

### 채점결과

합계: 100.0 / 100.0

### 제출 일자

2026년 10월 02일 17:24:25

### 문제 설명

<p>낚시앱에서 사용하는 <code>FISH_INFO</code> 테이블은 잡은 물고기들의 정보를 담고 있습니다. <code>FISH_INFO</code> 테이블의 구조는 다음과 같으며 <code>ID</code>, <code>FISH_TYPE</code>, <code>LENGTH</code>, <code>TIME</code>은 각각 잡은 물고기의 ID, 물고기의 종류(숫자), 잡은 물고기의 길이(cm), 물고기를 잡은 날짜를 나타냅니다. </p>
<table class="table">
        <thead><tr>
<th>Column name</th>
<th>Type</th>
<th>Nullable</th>
</tr>
</thead>
        <tbody><tr>
<td>ID</td>
<td>INTEGER</td>
<td>FALSE</td>
</tr>
<tr>
<td>FISH_TYPE</td>
<td>INTEGER</td>
<td>FALSE</td>
</tr>
<tr>
<td>LENGTH</td>
<td>FLOAT</td>
<td>TRUE</td>
</tr>
<tr>
<td>TIME</td>
<td>DATE</td>
<td>FALSE</td>
</tr>
</tbody>
      </table>
<p>단, 잡은 물고기의 길이가 10cm 이하일 경우에는 <code>LENGTH</code> 가 NULL 이며, <code>LENGTH</code> 에 NULL 만 있는 경우는 없습니다.</p>

<hr>

<h5>문제</h5>

<p><code>FISH_INFO</code> 테이블에서 잡은 물고기 중 가장 큰 물고기의 길이를 'cm' 를 붙여 출력하는 SQL 문을 작성해주세요.</p>

<p>이 때 컬럼명은 'MAX_LENGTH' 로 지정해주세요.</p>

<hr>

<h5>예시</h5>

<p>예를 들어 <code>FISH_INFO</code> 테이블이 다음과 같다면</p>
<table class="table">
        <thead><tr>
<th>ID</th>
<th>FISH_TYPE</th>
<th>LENGTH</th>
<th>TIME</th>
</tr>
</thead>
        <tbody><tr>
<td>0</td>
<td>0</td>
<td>13.37</td>
<td>2021/12/04</td>
</tr>
<tr>
<td>1</td>
<td>0</td>
<td>50.00</td>
<td>2020/03/07</td>
</tr>
<tr>
<td>2</td>
<td>0</td>
<td>40.00</td>
<td>2020/03/07</td>
</tr>
<tr>
<td>3</td>
<td>1</td>
<td>43.33</td>
<td>2022/03/09</td>
</tr>
<tr>
<td>4</td>
<td>1</td>
<td>NULL</td>
<td>2022/04/08</td>
</tr>
<tr>
<td>5</td>
<td>2</td>
<td>32.00</td>
<td>2020/04/28</td>
</tr>
</tbody>
      </table>
<p>가장 큰 물고기의 길이는 50cm 이므로 결과는 다음과 같아야 합니다.</p>
<table class="table">
        <thead><tr>
<th>MAX_LENGTH</th>
</tr>
</thead>
        <tbody><tr>
<td>50.00cm</td>
</tr>
</tbody>
      </table>

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges

---

### 🔍 쿼리 실행 순서 및 분석
1. **`MAX(LENGTH)`**: `FISH_INFO` 테이블에서 가장 큰 `LENGTH`(길이) 값을 찾습니다. (예: `50`)
2. **`FORMAT(..., 2)`**: 구한 최댓값을 소수점 둘째 자리까지 무조건 표시하는 **문자열**로 변환하며 자동 반올림합니다. (`50` ➡️ `'50.00'`)
3. **`CONCAT(..., 'cm')`**: 변환된 문자열 뒤에 `'cm'` 텍스트를 결합합니다. (`'50.00'` + `'cm'` ➡️ `'50.00cm'`)
4. **`AS MAX_LENGTH`**: 최종 출력 열의 별칭(Alias)을 `MAX_LENGTH`로 지정합니다.

---

## 🛠️ 함수별 상세 요약

### 1. 🔗 CONCAT (문자열 결합)
* **설명**: 여러 개의 문자열이나 컬럼 값을 **하나의 연속된 문자열**로 이어 붙입니다.
* **특징**: 숫자와 문자를 섞어 넣어도 전부 하나의 텍스트로 합쳐집니다.
* **예시**: `CONCAT('내 나이는 ', 20, '살')` ➡️ `'내 나이는 20살'`

### 2. 🎨 FORMAT (화면 표시용 반올림 + 쉼표)
* **설명**: 숫자를 **사람이 읽기 좋은 형태의 '문자열'**로 가공합니다.
* **특징**: 지정한 자릿수까지 **반올림**을 수행하며, 1,000 단위마다 **천 단위 쉼표(`,`)**를 자동으로 삽입합니다. 값이 정수여도 소수점 아래 자리를 강제로 채워줍니다.
* **예시**: `FORMAT(12345.678, 2)` ➡️ `'12,345.68'` *(※ 결과는 숫자가 아닌 문자열)*

### 3. 📐 ROUND (수학적 반올림)
* **설명**: 순수한 **숫자 데이터 상태를 유지하며 반올림**합니다.
* **특징**: 쉼표(`,`) 같은 기호는 붙지 않으며 데이터의 숫자 타입이 유지됩니다. 환경에 따라 소수점 아래가 `.0`으로 딱 떨어지면 출력을 생략하기도 합니다.
* **예시**: `ROUND(12345.678, 2)` ➡️ `12345.68` *(※ 결과는 숫자형)*

### 4. ⚙️ CAST (데이터 타입 형변환)
* **설명**: 컴퓨터가 내부 연산을 정확히 할 수 있도록 **데이터의 진짜 성질(자료형)을 강제로 변경**합니다.
* **특징**: 문자를 숫자로 바꾸거나, 정수를 실수로 바꿀 때 사용하며 화면을 꾸미는 기능은 없습니다.
* **예시**: `CAST('100' AS SIGNED)` ➡️ 문자였던 `'100'`을 연산 가능한 정수 `100`으로 변환

---
