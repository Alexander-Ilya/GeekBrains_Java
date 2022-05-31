package ru.gb.ilyashuk.secondquarter.homework2_2;

public class Main {
    public static void main(String[] args) {
        Main test = new Main();
        String[][] valid = {
                {"1", "2", "3", "4" },
                {"1", "2", "3", "4" },
                {"1", "2", "3", "4" },
                {"1", "2", "3", "4" },

        };
        String[][] invalidOne = {
                {"1", "2", "3", "4" },
                {"1", "2", "3", "4" },
                {"1", "2", "3", "4" },
        };
        String[][] invalidTwo = {
                {"1", "2", "3", "4" },
                {"1", "2", "3", "4" },
                {"1", "2", "3" },
                {"1", "2", "3", "4" },

        };
        String[][] invalidThree = {
                {"1", "2", "3", "4" },
                {"1", "2", "g", "4" },
                {"1", "2", "3", "4" },
                {"1", "2", "3", "4" },

        };
        try {
            try {
                //int result = test.arrayTest(valid);
                // int result = test.arrayTest(invalidOne);
                // int result = test.arrayTest(invalidTwo);
                int result = test.arrayTest(invalidThree);
                System.out.println("result = " + result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива не корректен");
                e.printStackTrace();
            }
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных в ячейке [" + e.i + "] [" + e.j + "]" + ", В ней значение \"" + e.s[e.i][e.j] + "\"");
            e.printStackTrace();
        }
    }


    public int arrayTest(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (array.length != 4) {
            throw new MyArraySizeException("Количество строк некорректно");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4)
                throw new MyArraySizeException(String.format("Количество столбцов в строке %d некорректно", i));
            for (int j = 0; j < array.length; j++) {
                try {
                    count = count + Integer.parseInt(array[i][j]);

                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, array);
                }
            }

        }
        return count;
    }
}
