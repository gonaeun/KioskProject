import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private final List<Menu> menus; // 리스트 선언 및 초기화
    // lv3->lv4 리팩토링 : List<MenuItem>을 List<Menu>로 수정하여 카테고리별 메뉴를 저장할 리스트 선언
    // lv4->lv5 리팩토링 : final을 추가하여 캡슐화 강화 (리스트 자체 변경 방지)

    public Kiosk() {  // Kiosk() 생성자
        menus = new ArrayList<>(); // 리스트 초기화 (초기화 하기 전에는 null, 초기화 한 후에는 [] 빈 리스트)

        // 햄버거 카테고리
        // "Burgers"라는 카테고리를 가지는 Menu 객체 생성
        Menu burgerMenu = new Menu("Burgers");
        // 해당 카테고리에 메뉴 추가 (Menu 클래스의 addMenuItem() 메서드 사용)
        burgerMenu.addMenuItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        menus.add(burgerMenu); // menus 리스트에 "Burgers" 카테고리 추가

        // 음료 카테고리
        // "Drinks"라는 카테고리를 가지는 Menu 객체 생성
        Menu drinkMenu = new Menu("Drinks");
        // 해당 카테고리에 메뉴 추가 (Menu 클래스의 addMenuItem() 메서드 사용)
        drinkMenu.addMenuItem(new MenuItem("Pepsi", 2.5, "청량한 탄산음료"));
        drinkMenu.addMenuItem(new MenuItem("Sprite", 2.5, "레몬향 탄산음료"));
        drinkMenu.addMenuItem(new MenuItem("Lemonade", 3.5, "직접 만든 상큼한 레모네이드"));
        drinkMenu.addMenuItem(new MenuItem("Milk shake", 4.0, "감자튀김과 어울리는 밀크쉐이크"));
        menus.add(drinkMenu); // menus 리스트에 "Drinks" 카테고리 추가

        // 디저트 카테고리
        // "Desserts"라는 카테고리를 가지는 Menu 객체 생성
        Menu dessertsMenu = new Menu("Desserts");
        // 해당 카테고리에 메뉴 추가 (Menu 클래스의 addMenuItem() 메서드 사용)
        dessertsMenu.addMenuItem(new MenuItem("Cheesecake", 5.0, "부드러운 뉴욕 치즈케이크"));
        dessertsMenu.addMenuItem(new MenuItem("Ice cream", 4.5, "달콤한 바닐라 아이스크림"));
        dessertsMenu.addMenuItem(new MenuItem("Yogurt", 4.5, "베리가 잔뜩 올라간 요거트"));
        menus.add(dessertsMenu); // menus 리스트에 "Desserts" 카테고리 추가
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n[ MAIN MENU ]");
            for (int i = 0; i< menus.size(); i++) {  // 반복문을 통해 List안의 Menus를 하나씩 출력
                System.out.println((i+1) + ". " + menus.get(i).getCategory());
            }
            System.out.println("0. 종료");

            int categoryChoice = scanner.nextInt(); // 숫자 입력 받아서 카테고리 선택

            if (categoryChoice == 0) {
                System.out.println("프로그램을 종료합니다.");
                running = false; // 프로그램 종료
            } else if (categoryChoice >0 && categoryChoice <= menus.size()) {
                // lv4->lv5 리팩토링 : 서브메뉴 캡슐화
                displayMenuItems(menus.get(categoryChoice-1)); // 입력 받은 카테고리 출력!
            } else {
                System.out.println("올바른 번호를 입력하세요");
            }
        }
        scanner.close();
    }

    // 서브메뉴 캡슐화
    private void displayMenuItems(Menu menu) {
        Scanner scanner = new Scanner(System.in);
        boolean subMenu = true;

        while (subMenu) {
            System.out.println("\n[ " + menu.getCategory() + " MENU ]");

            // 해당 메뉴 아이템 출력
            List<MenuItem> items = menu.getMenuItems();  // Menu 클래스의 getMenuItems()메서드 이용
            for (int i = 0; i < items.size(); i++) {
                MenuItem item = items.get(i);
                System.out.println((i + 1) + ". " + item.getName() + " | W " + item.getPrice() + " | " + item.getDescription());
            }
            System.out.println("0. 뒤로가기");

            // 서브 메뉴 입력받기
            int subMenuChoice = scanner.nextInt();
            if (subMenuChoice == 0) {
                subMenu = false; // 뒤로가기 선택시(0입력) 서브메뉴 종료되도록
            } else if (subMenuChoice > 0 && subMenuChoice <= items.size()) {
                System.out.println("선택한 메뉴 : " + items.get(subMenuChoice - 1).getName() + " | W " + items.get(subMenuChoice - 1).getPrice() + " | " + items.get(subMenuChoice - 1).getDescription());
            } else {
                System.out.println("올바른 번호를 입력하세요");
            }
        }
    }
}
