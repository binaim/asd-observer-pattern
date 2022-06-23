import java.awt.image.ImageObserver;
import java.util.Observable;

public  class ObservableCounter extends Observable implements Counter{

    private int count;

    @Override
    public void increment() {
        count++;
        setChanged();
        notifyObservers(count);
    }

    @Override
    public void decrement() {
        if(count > 0){
            count--;

            setChanged();
            notifyObservers(count);
        }

    }
}
