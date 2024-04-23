public class TriangleType {
    public static void main(String[] args) {
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;

        String triangleType = checkTriangleType(side1, side2, side3);
        System.out.println(triangleType);
    }

    public static String checkTriangleType(int side1, int side2, int side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0)
            return "NotATriangle"; // Không phải tam giác với cạnh âm hoặc bằng 0

        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1)
            return "NotATriangle"; // Không phải tam giác với tổng hai cạnh nhỏ hơn cạnh còn lại

        if (side1 == side2 && side2 == side3)
            return "Equilateral"; // Tam giác đều

        if (side1 == side2 || side1 == side3 || side2 == side3)
            return "Isosceles"; // Tam giác cân

        // Kiểm tra tam giác vuông
        if (isRightTriangle(side1, side2, side3))
            return "RightTriangle"; // Tam giác vuông
        return "Scalene"; // Tam giác thường
    }

    private static boolean isRightTriangle(int side1, int side2, int side3) {
        int maxSide = Math.max(side1, Math.max(side2, side3));
        int sumOfSquares = 0;

        if (maxSide == side1) {
            sumOfSquares = side2 * side2 + side3 * side3;
        } else if (maxSide == side2) {
            sumOfSquares = side1 * side1 + side3 * side3;
        } else {
            sumOfSquares = side1 * side1 + side2 * side2;
        }

        return sumOfSquares == maxSide * maxSide;
    }
}
