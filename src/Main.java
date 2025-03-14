import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;  // 실행시 햄버거 메뉴가 표시될 수 있도록

        while (running) {
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료");

            int choice = scanner.nextInt(); // 숫자 입력받아서 메뉴 선택

            switch (choice) {
                case 1 -> System.out.println("선택한 메뉴 : ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                case 2 -> System.out.println("선택한 메뉴 : SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                case 3 -> System.out.println("선택한 메뉴 : Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                case 4 -> System.out.println("선택한 메뉴 : Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
                case 0 -> {
                    System.out.println("프로그램을 종료합니다.");
                    running = false; // 프로그램 종료
                }
                default -> System.out.println("올바른 번호를 입력하세요");
            }
        }
        scanner.close();
    }
}
