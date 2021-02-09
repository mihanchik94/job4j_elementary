package ru.job4j.array;

public class FindLoop {
    /**
     * Поиск номера индекса конкретного значения в массиве.
     * @param data - используемый массив.
     * @param el - искомое значение в массиве.
     * @return - вывод искомого значения.
     * int rst = -1 - если элемента нет в массиве, то возвращаем -1.
     */
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * Поиск номера индекса конкретного значения в определенном диапазоне массива.
     * @param data - используемый массив.
     * @param el - искомое значение в массиве.
     * @param start - номер индекса в массиве, с которого начинается поиск.
     * @param finish - номер индекса в массиве, на котором закагнчивается поиск.
     * @return - вывод искомого значения.
     * int rst = -1 - если элемента нет в массиве, то возвращаем -1.
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
