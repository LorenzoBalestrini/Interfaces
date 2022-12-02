package it.develhope.interfaces;

public class CollegePerson {

    public String name;
    public String surname;
    public int collegeId;

    public void goToCollege(){
        System.out.println("Name: " + name + " - surname: " + surname + " - college ID: " + collegeId);
    }
}
