import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GeometricCalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> results = new ArrayList<>();

        while (true) {
            try {
                System.out.println("Seleccione una figura:");
                System.out.println("1. Círculo");
                System.out.println("2. Cuadrado");
                System.out.println("3. Triángulo");
                System.out.println("4. Rectángulo");
                System.out.println("5. Pentágono");
                System.out.println("6. Salir");
                int choice = scanner.nextInt();

                if (choice == 6) {
                    System.out.println("Saliendo...");
                    break;
                }

                System.out.println("Elija una operación:");
                System.out.println("1. Área");
                System.out.println("2. Perímetro");
                int operation = scanner.nextInt();

                String result = "";
                switch (choice) {
                    case 1:
                        result = calculateCircle(scanner, operation);
                        break;
                    case 2:
                        result = calculateSquare(scanner, operation);
                        break;
                    case 3:
                        result = calculateTriangle(scanner, operation);
                        break;
                    case 4:
                        result = calculateRectangle(scanner, operation);
                        break;
                    case 5:
                        result = calculatePentagon(scanner, operation);
                        break;
                    default:
                        System.out.println("Opción no válida");
                        continue;
                }
                if (!result.isEmpty()) {
                    results.add(result);
                    System.out.println("Resultado: " + result);
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor ingrese un número.");
                scanner.next(); // Limpiar la entrada incorrecta
            }
        }

        System.out.println("Resultados almacenados:");
        for (String res : results) {
            System.out.println(res);
        }

        scanner.close();
    }

    private static String calculateCircle(Scanner scanner, int operation) {
        try {
            System.out.println("Ingrese el radio:");
            double radius = scanner.nextDouble();

            if (operation == 1) {
                double area = Math.PI * radius * radius;
                return "Área del círculo: " + area;
            } else if (operation == 2) {
                double perimeter = 2 * Math.PI * radius;
                return "Perímetro del círculo: " + perimeter;
            } else {
                System.out.println("Operación no válida");
                return "";
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada no válida. Debe ingresar un número.");
            scanner.next(); // Limpiar la entrada incorrecta
            return "";
        }
    }

    private static String calculateSquare(Scanner scanner, int operation) {
        try {
            System.out.println("Ingrese el lado:");
            double side = scanner.nextDouble();

            if (operation == 1) {
                double area = side * side;
                return "Área del cuadrado: " + area;
            } else if (operation == 2) {
                double perimeter = 4 * side;
                return "Perímetro del cuadrado: " + perimeter;
            } else {
                System.out.println("Operación no válida");
                return "";
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada no válida. Debe ingresar un número.");
            scanner.next(); // Limpiar la entrada incorrecta
            return "";
        }
    }

    private static String calculateTriangle(Scanner scanner, int operation) {
        try {
            if (operation == 1) {
                System.out.println("Ingrese la base:");
                double base = scanner.nextDouble();
                System.out.println("Ingrese la altura:");
                double height = scanner.nextDouble();
                double area = 0.5 * base * height;
                return "Área del triángulo: " + area;
            } else if (operation == 2) {
                System.out.println("Ingrese el primer lado:");
                double side1 = scanner.nextDouble();
                System.out.println("Ingrese el segundo lado:");
                double side2 = scanner.nextDouble();
                System.out.println("Ingrese el tercer lado:");
                double side3 = scanner.nextDouble();
                double perimeter = side1 + side2 + side3;
                return "Perímetro del triángulo: " + perimeter;
            } else {
                System.out.println("Operación no válida");
                return "";
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada no válida. Debe ingresar un número.");
            scanner.next(); // Limpiar la entrada incorrecta
            return "";
        }
    }

    private static String calculateRectangle(Scanner scanner, int operation) {
        try {
            System.out.println("Ingrese el largo:");
            double length = scanner.nextDouble();
            System.out.println("Ingrese el ancho:");
            double width = scanner.nextDouble();

            if (operation == 1) {
                double area = length * width;
                return "Área del rectángulo: " + area;
            } else if (operation == 2) {
                double perimeter = 2 * (length + width);
                return "Perímetro del rectángulo: " + perimeter;
            } else {
                System.out.println("Operación no válida");
                return "";
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada no válida. Debe ingresar un número.");
            scanner.next(); // Limpiar la entrada incorrecta
            return "";
        }
    }

    private static String calculatePentagon(Scanner scanner, int operation) {
        try {
            System.out.println("Ingrese el lado:");
            double side = scanner.nextDouble();

            if (operation == 1) {
                System.out.println("Ingrese la apotema:");
                double apothem = scanner.nextDouble();
                double area = (5 * side * apothem) / 2;
                return "Área del pentágono: " + area;
            } else if (operation == 2) {
                double perimeter = 5 * side;
                return "Perímetro del pentágono: " + perimeter;
            } else {
                System.out.println("Operación no válida");
                return "";
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada no válida. Debe ingresar un número.");
            scanner.next(); // Limpiar la entrada incorrecta
            return "";
        }
    }
}
