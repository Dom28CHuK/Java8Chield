package Class;

public class MyClass {
    private int alpha;   // закритий доступ
    public int beta;     // відкритий доступ
    int gamma;   // ти доступа по замовчуванням (по суті шо public)

    void setAlpha(int a) {
        alpha = a;
    }
    int getAlpha() {
        return alpha;
    }
}
