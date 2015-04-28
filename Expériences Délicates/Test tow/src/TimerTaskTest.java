import java.util.Timer;
import java.util.Date;
import java.util.TimerTask;

public class TimerTaskTest extends TimerTask {

    public void run() {
        System.out.println("Start time:" + new Date());
        doSomeWork();
        System.out.println("End time:" + new Date());
    }

    public void doSomeWork() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.getCause();
        }
    }

    public static void main(String args[]) {
        TimerTask timerTask = new TimerTaskTest();
        // running timer task as daemon thread
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask, 0, 10 * 1000);
        System.out.println("TimerTask begins! :" + new Date());
        // cancel after sometime
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.cancel();
        System.out.println("TimerTask cancelled! :" + new Date());
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
