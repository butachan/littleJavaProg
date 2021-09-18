import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ArrowKeys {

    public ArrowKeys()
    {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setFocusable(true);

        JPanel tableau = new JPanel();
        //create elements and their content
        JLabel up = new JLabel();  up.setText("Up : 0 ");
        JLabel down = new JLabel(); down.setText("Down : 0 ");
        JLabel right = new JLabel(); right.setText("Right : 0 ");
        JLabel left = new JLabel();  left.setText("Left : 0 ");

        //put label on the panel
        tableau.add(up);
        tableau.add(down);
        tableau.add(right);
        tableau.add(left);        

        frame.addKeyListener((KeyListener) new KeyListener(){
            int upCount = 0;
            int downCount = 0;
            int rightCount = 0;
            int leftCount = 0;
            public void keyTyped(KeyEvent e){}
            public void keyPressed(KeyEvent e){
                //store the keycode on keyboard
                int keycode = e.getKeyCode();
                switch(keycode){
                    case KeyEvent.VK_UP:
                    up.setText("Up " + Integer.toString(upCount++));
                    break;
                    case KeyEvent.VK_DOWN:
                    down.setText("Down" + Integer.toString(downCount++));
                    break;
                    case KeyEvent.VK_RIGHT:
                    right.setText("Right" + Integer.toString(rightCount++));
                    break;
                    case KeyEvent.VK_LEFT:
                    left.setText("Left" + Integer.toString(leftCount++));
                    break;
                }
            }
            public void keyReleased(KeyEvent e){}
        });

        //put panel on the window (once the content is set)
        frame.add(tableau);
    }
    
    public static void main(String[] args) {
        new ArrowKeys();
    }
}
