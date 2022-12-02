# Exercise: 2-interfaces
* define an interface `LearningPerson` that has an abstract method `studyAtHome`
* define an interface `TeachingPerson` that has an abstract method `teachToOtherPeople`
* define a Java superclass `CollegePerson` that has:
  * 3 attributes (`name`, `surname` and a numeric `collegeId`)
  * a method `goToCollege` that prints all the `CollegePerson` attributes
* considering that a student **is** a `CollegePerson` that **can learn**, define a subclass `Student` that:
  * implements the right interface and overrides the abstract method with an informative message
  * has an attribute `academicYear` of type `int`
  * has a constructor that takes 4 params (`name`, `surname`, `id`, `year`) and assigns their values to the right attributes
* considering that a professor **is** a `CollegePeorson` that **can teach**, define a subclass `Professor` that:
  * implements the right interface and overrides the abstract method with an informative message
  * has an attribute of type `String` called `teachingSubject`
  * has a constructor that takes 4 params (`name`, `surname`, `id`, `subject`) and assigns their values to the right attributes
* considering that an assistant **is** a `CollegePerson` that **can learn and teach**, define a subclass `Assistant` that:
  * implements the right interfaces and overrides the abstract methods with informative messages
  * has an attribute of type `boolean` called `isGoingToBeAPhD`
  * has a constructor that takes 4 params (`name`, `surname`, `id`, `willBeAPhD`) and assigns their values to the right attributes
* define a Java testing class where you:
  * create 3 objects, 1 for each subclass type
  * invoke the `goToCollege()` method for each of the newly created objects
  * invoke the implemented methods from interfaces (1 for `Student`, 1 for `Professor` and 2 for `Assistant`)
