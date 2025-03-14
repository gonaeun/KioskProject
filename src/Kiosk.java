import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<MenuItem> menuItems;

    public Kiosk() {
        menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n[ SHAKESHACK MENU ]");
            for (int i=0; i<menuItems.size(); i++) {  // 반복문을 통해 List안의 MenuItem을 하나씩 출력
                MenuItem menuItem = menuItems.get(i);
                System.out.println((i+1) + ". " + menuItem.getName() + " | W " + menuItem.getPrice() + " | " + menuItem.getDescription());
            }
            System.out.println("0. 종료");

            int choice = scanner.nextInt(); // 숫자 입력받아서 메뉴 선택

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                running = false; // 프로그램 종료
            } else if (choice >0 && choice <= menuItems.size()) {
                System.out.println("선택한 메뉴 : " + menuItems.get(choice-1).getName() + " | W " + menuItems.get(choice-1).getPrice() + " | " + menuItems.get(choice-1).getDescription());
            } else {
                System.out.println("올바른 번호를 입력하세요");
            }
        }
        scanner.close();
    }
}
