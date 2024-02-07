package com.zaurtregulov.nested_classes.static_nested_class.lyambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentInfo {
                                       /* StudentChecks studentChecks*/
    void testStudents(ArrayList<Student> al, Predicate<Student> pr) {
        for (Student s : al) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }


    void printStudentsOverGrade(ArrayList<Student> al, double grade) {
        for (Student s : al) {
            if (s.avgGrade > grade) {
                System.out.println(s);
            }
        }
    }

    void printStudentsUnderAge(ArrayList<Student> al, int age) {
        for (Student s : al) {
            if (s.age < age) {
                System.out.println(s);
            }
        }
    }

    void printStudentsMixCondition(ArrayList<Student> al, int age, double grade, char sex) {
        for (Student s : al) {
            if (s.age > age && s.avgGrade < grade && s.sex == sex) {
                System.out.println(s);
            }
        }
    }

}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();

        System.out.println("_________________________");
/*        info.testStudents(students, new CheckOverGrade() {

            @Override
            public boolean check(Student s) {
                return s.age < 30;
            }
        });*/
        System.out.println("_________________________");
        info.testStudents(students, (Student s) -> {
            return s.age < 30;
        });

        info.testStudents(students, (Student p) -> {
            return p.avgGrade > 8;
        });
        info.testStudents(students, p -> p.avgGrade > 8);

        info.testStudents(students, p -> {
            System.out.println("hello");
            return p.avgGrade > 8;
        });

        Predicate<Student> p1 = student -> student.avgGrade > 7.5;
        Predicate<Student> p2 = student -> student.sex == 'm';
        System.out.println("***************");
        info.testStudents(students,p1);
        System.out.println("***************");
        info.testStudents(students,p2);
        System.out.println("*******and********");
        info.testStudents(students,p1.and(p2));
        System.out.println("*******or********");
        info.testStudents(students,p1.or(p2));
        System.out.println("*******negate********");
        info.testStudents(students,p1.negate());


        info.testStudents(students, (Student p) -> {
            return p.avgGrade > 20 && p.avgGrade < 9.3 && p.sex == 'f';
        });


//        info.testStudents(students, new CheckOverGrade());
        System.out.println("_________________________");

        info.printStudentsOverGrade(students, 8);
        System.out.println("_________________________");
        info.printStudentsUnderAge(students, 30);
        System.out.println("_________________________");
        info.printStudentsMixCondition(students, 20, 9.5, 'f');
    }
}

/*interface StudentChecks {
    boolean check(Student s);
}*/

/*
class CheckOverGrade implements StudentChecks {

    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8;
    }
}*/
