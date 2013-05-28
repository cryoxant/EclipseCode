import javax.swing.JFrame;

public class ClientTest {
	public static void main(String[] args){
		Client brayden;
		brayden = new Client("127.0.0.1");
		brayden.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		brayden.startRunning();
	}
}
