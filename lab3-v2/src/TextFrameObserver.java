import javax.swing.*;
import java.awt.*;
import java.util.Observable;

public class TextFrameObserver extends Display{

    public TextFrameObserver()
    {
        //{{INIT_CONTROLS
        getContentPane().setLayout(null);
        setSize(227,196);
        setVisible(false);
        getContentPane().add(JLabelCount);
        JLabelCount.setFont(new Font("Dialog", Font.BOLD, 36));
        JLabelCount.setBounds(48,48,170,86);
        setTitle("TextFrame");
        setCount(0);
        //}}

        //{{REGISTER_LISTENERS
        SymWindow aSymWindow = new SymWindow();
        this.addWindowListener(aSymWindow);
        //}}

        //{{INIT_MENUS
        //}}

    }

    @Override
    public void update(Observable o, Object arg) {
        setCount((Integer) arg);

    }


    class SymWindow extends java.awt.event.WindowAdapter
    {
        public void windowClosing(java.awt.event.WindowEvent event)
        {
            Object object = event.getSource();
            if (object == TextFrameObserver.this)
                TextFrame_WindowClosing(event);
        }
    }

    void TextFrame_WindowClosing(java.awt.event.WindowEvent event)
    {
        dispose();		 // dispose of the Frame.
    }
    //{{DECLARE_CONTROLS
    JLabel JLabelCount = new JLabel();
    //}}

    //{{DECLARE_MENUS
    //}}

    public void setCount (int count){
        JLabelCount.setText(String.valueOf( count));
    }

}
