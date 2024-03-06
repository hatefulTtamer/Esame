import java.util.Objects;

public class Student {
    private String name;
    private double bestMark;

    public Student(String name, double bestMark) {
        if (!Objects.equals(name, "")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name can't be empty.");
        }
        if (bestMark > 0.0 && bestMark < 5.0) {
            this.bestMark = bestMark;
        } else {
            throw new IllegalArgumentException("Best mark must be in 0 to 5 range.");
        }
    }

    public String getName() {
        return name;
    }

    public double getBestMark() {
        return bestMark;
    }
}


