public class Team {
    private String name;
    private Member[] members = new Member[6];

    public Team(String name, Member[] members) {
        this.name = name;
        for (int i = 0; i < 6; i++) {
            if (i < members.length) this.members[i] = members[i];
            else this.members[i] = new Member("noname", 0);

        }
    }

    public String getName() {
        return name;
    }

    public Member[] getMembers() {
        return members;
    }

    public String toString() {
        String str = "";
        for(Member member : members) {
            str += member.getName() + " " + member.getPower() + " ";
        }
        return "Команда " + name + str;
    }

    public void results() {
        System.out.println("Прошли полосу препятствий ");
        for (Member member : members) {
            if (member.isWin()) System.out.println(member.getName());
        }
    }
}
