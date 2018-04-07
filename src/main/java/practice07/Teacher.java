package practice07;

import practice06.Person;

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

    public String introduceWith(Student jerry) {
        if (jerry.getKlass().getNumber() == getKlass().getNumber()) {
            return super.introduce().concat(" I am a Teacher. I teach " + jerry.getName() + ".");
        } else {
            return super.introduce().concat(" I am a Teacher. I don't teach " + jerry.getName() + ".");
        }
    }
}
