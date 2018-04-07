package practice10;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Teacher extends Person {
    private TreeSet<Klass> classes = new TreeSet<>();

    public Teacher(int id, String name, int age, HashSet<Klass> classes) {
        super(id, name, age);
        this.classes.addAll(classes);
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        String result = super.introduce().concat(" I am a Teacher.");
        if (classes.size() != 0) {
            result = result.concat(" I teach Class ");
            for (Klass aClass : classes) {
                result = result.concat(String.valueOf(aClass.getNumber()) + ", ");
            }
            result = result.substring(0, result.length()-2);
            result = result.concat(".");
        } else {
            result = result.concat(" I teach No Class.");
        }
        return result;
    }

    public String introduceWith(Student student) {
        if (isTeaching(student)) {
            return super.introduce().concat(" I am a Teacher. I teach " + student.getName() + ".");
        } else {
            return super.introduce().concat(" I am a Teacher. I don't teach " + student.getName() + ".");
        }
    }

    public Set<Klass> getClasses() {
        return classes;
    }

    public boolean isTeaching(Student student) {
        for (Klass aClass : classes) {
            if (isIn(student, aClass)) {
                return true;
            }
        }
        return false;
    }

    public boolean isIn(Student student, Klass klass) {
        return student.getKlass().getNumber() == klass.getNumber();
    }
}
