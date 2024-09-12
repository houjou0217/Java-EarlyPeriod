import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerFrame extends JFrame {
    private JTextField workTimeField;
    private JTextField breakTimeField;
    private JButton startButton;

    public TimerFrame() {
        setTitle("ポモドーロタイマー");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        JLabel workTimeLabel = new JLabel("集中時間 (分):");
        workTimeField = new JTextField();

        JLabel breakTimeLabel = new JLabel("休憩時間 (分):");
        breakTimeField = new JTextField();

        startButton = new JButton("開始");

        add(workTimeLabel);
        add(workTimeField);
        add(breakTimeLabel);
        add(breakTimeField);
        add(new JLabel());  // 空白セル
        add(startButton);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int workTime = Integer.parseInt(workTimeField.getText());
                int breakTime = Integer.parseInt(breakTimeField.getText());
                PomodoroTimer timer = new PomodoroTimer(workTime, breakTime);
                timer.startWorkTimer();
            }
        });
    }
}
