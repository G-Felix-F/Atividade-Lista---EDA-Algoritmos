package entities;

public class SimpleList {
    private ProjectStep firstStep;
    private ProjectStep lastStep;
    private ProjectStep currentStep;

    public SimpleList () {
        firstStep = null;
        lastStep = null;
        currentStep = null;
    }

    public boolean isEmpty () {
        return firstStep == null;
    }

    public int length () {
        if (isEmpty()) {
            return 0;
        }
        int count = 1;
        currentStep = firstStep;
        while (currentStep.nextStep != null) {
            currentStep = currentStep.nextStep;
            count++;
        }
        return count;
    }

    public void showAll () {
        if (isEmpty()) {
            return;
        }
        currentStep = firstStep;
        while (currentStep != null) {
            System.out.println(currentStep.name);
            currentStep = currentStep.nextStep;
        }
    }

    public void add (ProjectStep newProjectStep, ListPosition position) {
        if (isEmpty()) {
            firstStep = newProjectStep;
            lastStep = newProjectStep;
            currentStep = newProjectStep;
        }
        if (!isEmpty() && position == ListPosition.FIRST) {
            newProjectStep.nextStep = firstStep;
            firstStep = newProjectStep;
        }
        if (!isEmpty() && position == ListPosition.LAST) {
            lastStep.nextStep = newProjectStep;
            lastStep = newProjectStep;
        }
    }

    public void remove (String name) {
        if (isEmpty()) {
            return;
        }
        ProjectStep auxiliar = firstStep;
        currentStep = firstStep.nextStep;
        boolean wasStepRemoved = false;
        for (int i = 0; !wasStepRemoved; i ++) {
            if (currentStep.name.equals(name)) {
                auxiliar.nextStep = currentStep.nextStep;
                wasStepRemoved = true;
            } else {
                auxiliar = currentStep;
                currentStep = currentStep.nextStep;
            }
        }
    }
}