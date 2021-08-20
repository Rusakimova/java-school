package homework.lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicInteger;

public class ColorFrame extends JFrame {

    public ColorFrame(AtomicInteger counter) throws HeadlessException {
        setSize(500,500);
        JButton button = new JButton("click me to be red");

       /* List.of("","sd").sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });*/


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("now the counter is " + counter.addAndGet(1));
            }
        });

        getContentPane().add(button, BorderLayout.NORTH);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger(10);
        new ColorFrame(counter);
    }
}
