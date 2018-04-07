package practice07;

public class Teacher extends Person {
    Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (getKlass() != null) {
            return super.introduce().concat(" I am a Teacher. I teach Class " + getKlass().getNumber() + ".");
        } else {
            return super.introduce().concat(" I am a Teacher. I teach No Class.");
        }
    }

    public String introduceWith(Student student) {
        if (student.getKlass().getNumber() == getKlass().getNumber()) {
            return super.introduce().concat(" I am a Teacher. I teach " + student.getName() + ".");
        } else {
            return super.introduce().concat(" I am a Teacher. I don't teach " + student.getName() + ".");
        }
    }
}
