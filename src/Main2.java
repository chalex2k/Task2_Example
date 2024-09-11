import java.util.Locale;
import java.util.Scanner;

/*
Задача: Вводится 3 стороны треугольника.
Определить вид треугольника: равносторонний, равнобедеренный, разносторонний.
*/

public class Main2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Scanner scanner = new Scanner(System.in);

        int a = inputSide(scanner, "a");
        int b = inputSide(scanner, "b");
        int c = inputSide(scanner, "c");

        TriangleKind kind = getKindOfTriangle(a, b, c);

        String message;
        switch (kind) {
            case EQUILATERAL:
                message = "Равносторонний треугольник!";
                break;
            case ISOSCELES:
                message = "Равнобедренный треугольник. 2 стороны равны!";
                break;
            case USUAL:
                message = "Разносторонний треугольник";
                break;
            default:
                message = "Неизвестный науке треугольник";
        }

        System.out.println(message);
    }
    
    // Метод определяет и возвращает вид треугольника 
    static TriangleKind getKindOfTriangle(int a, int b, int c) {
        if (a == b && b == c) {
            return TriangleKind.EQUILATERAL;
        }
        if (a == b || b == c || c == a) {
            return TriangleKind.ISOSCELES;
        }
        return TriangleKind.USUAL;
    }

    // Метод запрашивает у пользователя стророну side треугольника
    static int inputSide(Scanner scanner, String side) {
        System.out.printf("Введите сторону %s:%n", side);
        return scanner.nextInt();
    }
}
