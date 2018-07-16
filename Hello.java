import java.text.SimpleDateFormat;
import java.util.Date;

public class Hello {

	public static void main(String[] args) {
		
		System.out.println("Versione 16/07/2018-01");
		for (int i=1;i<=5;i++) {
			System.out.println("Hello World ... "+i);
		}
		System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()));
	}
}
