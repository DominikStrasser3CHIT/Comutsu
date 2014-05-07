import java.util.Timer;
import java.util.TimerTask;


public class Model {
	final int BHOEHE = 480;
	final int BBREITE= 720;
	public Timer startbild; int startbildzeit = 2;
	public Model() {
		startbild = new Timer();
	}
	public void startMoving(TimerTask task) {
		this.startbild.schedule(task, 1000, 1000);
	}
}
