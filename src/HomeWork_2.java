public class HomeWork_2 {
    public static void main(String[] args) {
        String[][] arr = {{"11", "11", "11", "11"}, {"22", "22", "22", "22"}, {"33", "33", "33", "33"}, {"44", "44", "44", "44"}};
        try {
            System.out.println("Сумма = " + sumArray(arr));
        }
        catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int sumArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {

        int sum = 0;

        int s;

        if (arr.length != 4) throw new MyArraySizeException("Массив не равен 4х4");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) throw new MyArraySizeException("Массив не равен 4х4");
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    s = Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Элемент в строке " + (i + 1) + " столбце " + (j + 1) + " не число");
                }
                sum += s;
            }
        }

        return sum;
    }
}
