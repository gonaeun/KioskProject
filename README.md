# 🍔 키오스크 프로젝트 (객체지향 설계 기반)

## 📌 프로젝트 개요
이 프로젝트는 **객체지향 프로그래밍(OOP)**을 활용하여 햄버거 키오스크 시스템을 설계하고 구현하는 과정입니다. 키오스크의 카테고리별 메뉴 관리, 주문 내역 처리, 예외 처리 등을 통해 유지보수성과 확장성을 고려한 객체지향적 설계 방식을 실습하는 것이 목표입니다.

---

## 📆 프로젝트 기간 및 인원

- **기간** : 2024.03.10 ~ 2024.03.14
- **인원** : 1인 개발 (개인 프로젝트)

---

## 🛠️ 기술 스택

- **언어** : Java  
- **패턴** : 객체지향 프로그래밍(OOP)  
- **입출력 방식** : 콘솔 기반 (`Scanner` 사용)  
- **컬렉션 활용** : List<Menu>, List<MenuItem>을 사용하여 메뉴 카탈로그와 세세한 메뉴 아이템 관리

---

## **☀️ 요구사항 정의와 설계**
 **🔹 키오스크 기능 요구사항 **
1. 카테고리별 메뉴 제공
   - 햄버거 / 음료 / 디저트 카테고리 구성
   - 각 카테고리별로 메뉴 아이템을 관리 (이름, 가격, 설명 포함)
2. 메뉴 선택 기능
   - 사용자가 특정 카테고리를 선택하면 해당 카테고리 내 메뉴를 출력
   - 원하는 메뉴를 선택하면 해당 메뉴 정보를 출력
3. 프로그램 종료 및 예외 처리
   - 0을 입력하면 프로그램 종료
   - 숫자가 아닌 값을 입력하면 오류 메시지를 출력하고 다시 입력받도록 처리 (try-catch 활용)







---

## **🌕 프로젝트 회고**
- 일단 필수 기능들만 구현해보았는데도 리스트 사용할 때 제네릭을 사용한다거나, 캡슐화를 강화하기 위하여 private에 final을 붙여주는 것과 같은 코드들은 정말 어색했다. 내가 먼저 필요에 의해서 술술 쓸 수 있을 때까지 그 개념들이랑은 더 친해져야 할 것 같다.
- 그리고 좀 어처구니 없는 실수는, 리스트 명을 헷갈렸던 것. 메인메뉴에서 서브메뉴까지 만들다보니까 리스트명이 헷갈려서 서브메뉴의 루프에 items.size()라고 써야하는데, menus.size()라고 잘못 작성했다. 오류가 났는데 코드 구성에는 문제가 없는 듯 하여 꽤 오래 고민했다. 변수나 리스트를 많이 생성할수록 이름을 잘 구별해서 사용하도록 신경 써야겠다. 웬만하면 애초에 이름에서 해당 기능이 직관적으로 보이도록 작명해야겠음. 직관적으로 이름 지을 필요성을 제대로 느꼈다.
- 저번이랑 계산기 프로젝트랑 개념은 비슷했는데 더 큰 사이즈로 작성할 수 있어서 기본적으로 뿌듯한 프로젝트였다. 그럼에도 이번 '요구사항 정의 및 설계'를 작성하면서 생긴 한가지 고민은, 혼자서 프로젝트 할 때 내가 생각하고 있는 설계를 어떻게 시각적인 클래스 다이어그램으로  표현할 수 있을지! 그러니까 어떤 사이트나 프로그램의 도움을 받아서 출력할 수 있을지 궁금하다.
