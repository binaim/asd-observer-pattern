import javax.swing.*;
import java.util.Observer;

public abstract class Display extends JFrame implements Observer {
    abstract void setCount(int cnt);
}
