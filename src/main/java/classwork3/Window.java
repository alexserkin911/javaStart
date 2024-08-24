package classwork3;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Window extends JFrame {

    private static final ImageIcon ICON_X = new ImageIcon(Objects.requireNonNull(Window.class.getResource("X.png")));
    private static final ImageIcon ICON_O = new ImageIcon(Objects.requireNonNull(Window.class.getResource("O.png")));
    private static final ImageIcon ICON_DEF = new ImageIcon(Objects.requireNonNull(Window.class.getResource("def.png")));

    private final JButton [][] MAP = new JButton[3][3];
    private static int clickCount = 0;


    private void initMap(JPanel panel){

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                MAP[i][j] = new JButton();
                JButton btn = MAP[i][j];
                btn.setIcon(ICON_DEF);
                btn.addActionListener(e -> {
                    btn.setIcon(ICON_X);
                    btn.setDisabledIcon(ICON_X);
                    btn.setEnabled(false);
                    clickCount++;
                    if (clickCount ==9){
                        JFrame frame = new JFrame("Ничья");
                        frame.setSize(300,100);
                        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                        frame.setLocationRelativeTo(null);
                        JPanel pan = new JPanel();
                        JButton close = new JButton("close");
                        close.addActionListener(e1 -> {
                            dispose();
                            frame.dispose();
                        });
                        JButton newGame = new JButton("new game");
                        newGame.addActionListener(e1 -> {
                            clickCount = 0;
                            new Window();
                            dispose();
                            frame.dispose();
                        });
                        pan.add(close);
                        pan.add(newGame);
                        frame.add(pan);
                        frame.setVisible(true);
                    }
                });
                panel.add(btn);
            }
        }
    }

    public Window() throws HeadlessException {
        setSize(300, 300);
//        setLocation(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

//        JMenuBar bar = new JMenuBar();
//        bar.add(new JMenu("1"));
//        bar.add(new JMenu("2"));
//        bar.add(new JMenu("3"));

        JPanel panel = new JPanel(new GridLayout(3, 3));
//      //panel.add(bar);
        initMap(panel);
//        for (int i = 0; i < 9; i++) {
//            JButton button = new JButton();
//            button.setIcon(ICON_DEF);
//            button.addActionListener(actionEvent -> {
//                button.setIcon(ICON_X);
//            });
//            panel.add(button);
//        }
        add(panel);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Window();

    }
}
