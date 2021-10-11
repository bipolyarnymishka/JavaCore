package HomeWork_3;

import java.util.Arrays;

public class GenericBox<T> {
    private T[] members;

    public GenericBox(T... members) {
        this.members = members;
    }

    public String toString() {
        return Arrays.toString(members);
    }

    public void changeMembers(int a, int b) {
        T tmp;
        tmp = this.members[a];
        this.members[a] = this.members[b];
        this.members[b] = tmp;
    }

    public static void main(String[] args) {
        GenericBox<Integer> intBox = new GenericBox<>(1, 2, 3, 4);
        System.out.println(intBox);

        intBox.changeMembers(1,3);
        System.out.println(intBox);
    }
}
