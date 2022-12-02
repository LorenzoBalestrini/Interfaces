package it.develhope.interfaces;

public class Professor extends CollegePerson implements ITeachingPerson {
    @Override
    public void teachToOtherPeople() {
        System.out.println("I'm teaching");
    }

    private String teachingSubject;

    public Professor(String name, String surname, int collegeId, String teachingSubject){
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
        this.teachingSubject = teachingSubject;
    }
}
