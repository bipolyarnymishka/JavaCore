package HomeWork_4;

import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<String> Name;
    private ArrayList<Integer> Phone;

    public PhoneBook() {
        Name = new ArrayList<>();
        Phone = new ArrayList<>();
    }

    public void add(String name, Integer phone) {
        Name.add(name);
        Phone.add(phone);
    }

    public ArrayList<Integer> get(String lastName) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < Name.size(); i++) {
            if (Name.get(i).equals(lastName)) result.add(Phone.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Борис", 8800555);
        phoneBook.add("Анастасия", 8700666);
        phoneBook.add("Юрий", 8900888);
        phoneBook.add("Анастасия", 8555111);

        System.out.println("Результат поиска по имени \"Анастасия\":" + phoneBook.get("Анастасия"));
    }

}
