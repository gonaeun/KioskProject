public class MenuItem {
    // 속성
    private String name;
    private double price;
    private String description;

    // 생성자
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // 기능 (Getter 메서드)
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    // Setter 메서드 : 가격, 설명 변경
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("0보다 큰 값을 입력해주세요.");
        }
    }

    public void setDescription(String description) {
        this.description = description;
    }
}