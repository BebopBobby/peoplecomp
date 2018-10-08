package peoplecomp;

public class Student extends Person implements Learner {
    private double totalStudyTime;

    public Student(long id, double totalStudyTime) {
        super(id);
        this.totalStudyTime = totalStudyTime;
    }

    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}

