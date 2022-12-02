package it.develhope.interfaces;

public class Assistant extends CollegePerson implements ILearningPerson, ITeachingPerson{
    @Override
    public void studyAtHome() {
        System.out.println("I'm still learning");
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("I'm helping the professor to teach. Will I be a teacher in the future? " + isGoingToBeAPhD);
    }

    private boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int id, boolean willBeAPhD){
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.isGoingToBeAPhD = willBeAPhD;
    }
}
