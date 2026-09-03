package entities;

public class ProjectStep {
    public String name;
    public int time;
    public ProjectStep nextStep;

    public ProjectStep (String name, int time) {
        this.name = name;
        this.time = time;
        this.nextStep = null;
    }

    public ProjectStep (String name, int time, ProjectStep nextStep) {
        this.name = name;
        this.time = time;
        this.nextStep = nextStep;
    }
}
