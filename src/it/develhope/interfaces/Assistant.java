package it.develhope.interfaces;

public class Assistant extends CollegePerson implements ILearningPerson, ITeachingPerson{
    @Override
    public void studyAtHome() {
        System.out.println("I'm still learning");
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("I'm helping the professor to teach");
    }

    private boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int collegeId, boolean willBeAPhD){
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
        this.isGoingToBeAPhD = willBeAPhD;
    }
}
