package Class;

public class AccessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        ob.setAlpha(-99);
        System.out.println("ob.alpha: " + ob.getAlpha());

        // Обратиться к переменной alpha так, как показано ниже, нельзя
        // ob.alpha = 10; // Ошибка: alpha - закрытая переменная!

        ob.beta = 88;
        ob.gamma = 99;
    }
}
