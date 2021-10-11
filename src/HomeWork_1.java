public class HomeWork_1 {
    public static void main(String[] args) {
        Member[] members = new Member[6];
        members[0] = new Member("Светлана", 30);
        members[1] = new Member("Борис", 28);
        members[2] = new Member("Виктория", 35);
        members[3] = new Member("Анастасия", 47);
        members[4] = new Member("Виталий", 50);
        members[5] = new Member("Иван", 52);

        Team team = new Team("участников: ", members);
        System.out.println(team);

        int[] barriers = {5,  7, 6, 10, 9};
        Course course = new Course(barriers);
        System.out.println("Полоса препятствий " + course);

        course.doIt(team);
        team.results();
    }
}
