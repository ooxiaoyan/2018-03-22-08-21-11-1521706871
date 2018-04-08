package practice11;

public class Klass implements Comparable{
    private int number;
    private Student leader;
    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Klass() {}

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
            if (getTeacher() != null) {
                getTeacher().becomeLeader(student);
            }
        }
    }

    public void appendMember(Student student) {
        student.getKlass().setNumber(getNumber());
        if (getTeacher() != null) {
            getTeacher().joinStudent(student);
        }
    }

    @Override
    public int compareTo(Object obj) {
        if (!(obj instanceof Klass))
            throw new RuntimeException("no Klass");

        Klass klass = (Klass) obj;
        int num = new Integer(this.number).compareTo(new Integer(klass.number));
        return num;
    }
}
