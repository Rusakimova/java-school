package homework.lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorFrame extends JFrame {
    class Counter {
        private int value;
        public int Increment() {
            value++;
            return value;
        }
        Counter (int counter) {
            this.value = counter;
        }
    }

    public ColorFrame(int counter) throws HeadlessException {
        setSize(500,500);
        JButton button = new JButton("click me to be red");
        Counter counterModified = new Counter(counter);

       /* List.of("","sd").sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });*/


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("now the counter is " + counterModified.Increment());
            }
        });

        getContentPane().add(button, BorderLayout.NORTH);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ColorFrame(10);
    }
}
