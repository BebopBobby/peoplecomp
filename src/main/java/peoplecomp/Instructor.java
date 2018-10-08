package peoplecomp;

public class Instructor extends Person implements Teacher {
    public Instructor(long id) {
        super(id);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        for (int x = 0; x < learners.length; x++){
            learners[x].learn(numberOfHours);
        }
    }
}
