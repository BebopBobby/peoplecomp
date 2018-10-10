package peoplecomp;

public class Student extends Person implements Learner {
    private double totalStudyTime;

    public Student(long id, double totalStudyTime, String name) {
        super(id, name);
        this.totalStudyTime = totalStudyTime;
    }

    public double learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
        return numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}

