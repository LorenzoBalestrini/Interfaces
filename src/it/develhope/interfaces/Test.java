package it.develhope.interfaces;

public class Test {
    public static void main(String[] args) {

        Student student = new Student("Lorenzo", "Balestrini", 123, 2);
        Professor professor = new Professor("Silvia", "Bagni", 456, "History");
        Assistant assistant = new Assistant("Marco", "Fontana", 789, true);

        student.goToCollege();
        professor.goToCollege();
        assistant.goToCollege();

        System.out.println("-------------------");

        student.studyAtHome();

        System.out.println("-------------------");

        professor.teachToOtherPeople();

        System.out.println("-------------------");

        assistant.studyAtHome();
        assistant.teachToOtherPeople();


    }
}
