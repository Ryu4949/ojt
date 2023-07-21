package Part_02_02_OOP.ch18;

public class Company {
    // 싱글톤 패턴

    private static Company instance = new Company(); // 유일한 인스턴스는 내부에서 만들고, 단 외부에서 이 인스턴스는 사용할 수 있도록
    private Company() { // 다른 인스턴스는 생성되지 못하도록 생성자를 private로 설정
    }

    public static Company getInstance() {
        if ( instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
