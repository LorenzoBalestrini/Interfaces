package it.develhope.interfaces;

public class Professor extends CollegePerson implements ITeachingPerson {
    @Override
    public void teachToOtherPeople() {
        System.out.println("I'm teaching the " + teachingSubject + " subject");
    }

    private String teachingSubject;

    public Professor(String name, String surname, int id, String subject){
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.teachingSubject = subject;
    }
}
