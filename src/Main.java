import java.util.Locale;
import java.util.Scanner;

/*
Задача: Вводится 3 стороны треугольника.
Определить вид треугольника: равносторонний, равнобедеренный, разносторонний.
*/

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сторону а:");
        int a = scanner.nextInt();

        System.out.println("Введите сторону b:");
        int b = scanner.nextInt();

        System.out.println("Введите сторону c:");
        int c = scanner.nextInt();

        TriangleKind kind = getKindOfTriangle(a, b, c);

        if (kind == TriangleKind.EQUILATERAL){
            System.out.println("Равносторонний треугольник!");
        } else if (kind == TriangleKind.ISOSCELES) {
            System.out.println("Равнобедренный треугольник. 2 стороны равны!");
        } else if (kind == TriangleKind.USUAL) {
            System.out.println("Разносторонний треугольник");
        } else {
            System.out.println("Неизвестный науке треугольник");
        }
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
}
