import java.util.*;
public class Main {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        //Задание 1
        //- В консоль выводятся только нечетные числа,
        //- Код работает с любой последовательностью и объемом списка чисел.
        System.out.println("Задание 1");
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.println(nums.get(i));
            }
        }
        //Задание 2
        //- В консоль выводятся только четные числа
        //- Все выведенные числа следуют в порядке возрастания
        //- Ни одно число не повторяется
        //- Код работает с любой последовательностью и объемом списка чисел
        System.out.println("Задание 2");
        nums.sort(null);
        Set<Integer> set = new LinkedHashSet<>(nums);
        List<Integer> numsWithoutDoublicates = new ArrayList<>(set);
        for (int i = 0; i < numsWithoutDoublicates.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                System.out.println(numsWithoutDoublicates.get(i));
            }
        }
        //Задание 3
        System.out.println("Задание 3");
        List<String> arr = new ArrayList<String>();
        Collections.addAll(arr, "Гусененок", "Утка", "Собака", "Ящерица", "Дикобраз", "Хомяк");
        ArrayList<String> arr1 = new ArrayList<String>();
        Collections.addAll(arr1, "Ящерица", "Дикобраз", "Хомяк", "Лев", "Цапля");
        arr.addAll(arr1);
        System.out.println("Коллекция с дублями" + arr.toString());
        Set<String> uniqueWords = new LinkedHashSet<>(arr);
        ArrayList<String> arrWithoutDoublicates = new ArrayList<>(uniqueWords);
        System.out.println("Коллекция без  дублей" + arrWithoutDoublicates.toString());
        //Задание 4
        System.out.println("Задание 4");
        List<String> arr3 = new ArrayList<String>();
        Collections.addAll(arr3, "Гусененок", "Утка", "Собака", "Ящерица", "Дикобраз", "Хомяк");
        ArrayList<String> arr4 = new ArrayList<String>();
        Collections.addAll(arr4, "Ящерица", "Дикобраз", "Хомяк", "Лев", "Цапля");
        System.out.println("бъединенеие списков");
        System.out.print(arr3.toString());
        System.out.print(arr4.toString());
        System.out.println();
        var items = new ArrayList<>(arr3);
        items.retainAll(arr4);
        System.out.println("Слова присутствующие в двух списках" + items.toString());

    }
}