import java.util.ArrayList;
import java.util.List;

public class CounterSubject {
    private int count;
    private List<Display> observers;

    public CounterSubject() {observers = new ArrayList<>();}

    public void addObservers(Display frame) {observers.add(frame);}


    public void increment() {
        count++;
       notifyObserver();
    }

    public void decrement() {
        if (count > 0) {
            count--;
            notifyObserver();
        }
    }

    public void notifyObserver(){observers.forEach(obv-> obv.setCount(count));}
}
