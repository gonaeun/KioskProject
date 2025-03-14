import java.util.ArrayList;
import java.util.List;

public class Menu {
    @Override
    public String toString() {
        return category;  // 오류 해결 : 메뉴에서 카테고리 명만 출력되도록
    }

    // 1. 속성
    private String category;
    private List<MenuItem> menuItems;

    // 2. 생성자
    public Menu(String category) {
        this.category = category;
        this.menuItems = new ArrayList<MenuItem>();
    }

    // 3. 기능
    // 새로운 메뉴 아이템 추가
    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    // Getter 메서드 : 카테고리 이름
    public String getCategory() {
        return category;
    }

    // Getter 메서드 :  메뉴 리스트
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }


}
