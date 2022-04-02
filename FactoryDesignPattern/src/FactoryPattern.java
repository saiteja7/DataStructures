import com.phone.OS;
import com.phone.OperatingSystemFactory;

public class FactoryPattern {
	
	public static void main(String[] args) {
		
		OperatingSystemFactory factory  = new OperatingSystemFactory();
		
		OS obj = factory.getInstance("Android");
		
		obj.spec();
		
		
		
	}

}
