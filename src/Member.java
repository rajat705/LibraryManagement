public class Member {
    private String name;
    private String memberId;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return "Name: " + name + ", Member ID: " + memberId;
    }
}
