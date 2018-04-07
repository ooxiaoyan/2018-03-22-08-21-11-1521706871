package practice07;

public class Student extends Person {

    Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        return super.introduce().concat(" I am a Student. I am at Class " + getKlass().getNumber() + ".");
    }

    public Klass getKlass() {
        return klass;
    }
}
