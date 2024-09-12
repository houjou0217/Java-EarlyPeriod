public class PomodoroTimer {
    private int workTime;  // 集中時間（分）
    private int breakTime; // 休憩時間（分）

    public PomodoroTimer(int workTime, int breakTime) {
        this.workTime = workTime;
        this.breakTime = breakTime;
    }

    public void startWorkTimer() {
        System.out.println("集中時間スタート: " + workTime + " 分");
        // ここに集中時間の処理を追加（例：タイマーをカウントダウン）
        try {
            Thread.sleep(workTime * 60 * 1000);  // 集中時間を待機
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("休憩時間です！");
        startBreakTimer();
    }

    public void startBreakTimer() {
        System.out.println("休憩時間スタート: " + breakTime + " 分");
        // ここに休憩時間の処理を追加（例：タイマーをカウントダウン）
        try {
            Thread.sleep(breakTime * 60 * 1000);  // 休憩時間を待機
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("集中時間に戻りましょう！");
        startWorkTimer();
    }

    public static void main(String[] args) {
        TimerFrame frame = new TimerFrame();
        frame.setVisible(true);
    }
}

