package entities;

public class SimpleList {
    private Element firstElement;
    private Element lastElement;
    private Element currentElement;

    public SimpleList () {
        firstElement = null;
        lastElement = null;
        currentElement = null;
    }

    public boolean isEmpty () {
        return firstElement == null;
    }

    public int length () {
        if (isEmpty()) {
            return 0;
        }
        int count = 1;
        currentElement = firstElement;
        while (currentElement.nextElement != null) {
            currentElement = currentElement.nextElement;
            count++;
        }
        return count;
    }

    public void add (Element newElement, ListPosition position) {
        if (isEmpty()) {
            firstElement = newElement;
            lastElement = newElement;
            currentElement = newElement;
        }
        if (!isEmpty() && position == ListPosition.FIRST) {
            newElement.nextElement = firstElement;
            firstElement = newElement;
        }
        if (!isEmpty() && position == ListPosition.LAST) {
            lastElement.nextElement = newElement;
            lastElement = newElement;
        }
    }

    public void removeElement (String name) {
        currentElement = firstElement;
        boolean wasElementRemoved = false;
        for (int i = 0; wasElementRemoved; i++) {
            if (currentElement.name.equals(name)) {
                // TODO: TERMINAR ESSE MÉTODO DAQUI E OS OUTROS 10000
            }
            currentElement = currentElement.nextElement;
        }
    }
}