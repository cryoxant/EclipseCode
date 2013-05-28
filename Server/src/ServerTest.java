import javax.swing.JFrame;

public class ServerTest{
	public static void main(String[] args){
		Server josh = new Server();
		josh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		josh.startRunning();
	}
}