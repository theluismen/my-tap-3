package exercise4;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return this.state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers(state);
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(int state){
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}