package practice10;

public class Student extends Person {

    Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (getKlass().getLeader() != null) {
            return super.introduce().concat(" I am a Student. I am Leader of " + getKlass().getDisplayName() + ".");
        } else {
            return super.introduce().concat(" I am a Student. I am at " + getKlass().getDisplayName() + ".");
        }
    }
}
