package practice09;

public class Klass {
    private int number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public Klass(int number, Student leader) {
        this.number = number;
        this.leader = leader;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName() {
        return "Class " + getNumber();
    }

    public void assignLeader(Student student) {
        if (student.getKlass().getNumber() != getNumber()) {
            System.out.print("It is not one of us.\n");
        } else {
            leader = student;
        }
    }

    public void appendMember(Student student) {
        student.getKlass().setNumber(getNumber());
    }
}
