
public class PenAdapter implements Pen {
	
	PilotPen p = new PilotPen();

	@Override
	public void write(String s) {
		// TODO Auto-generated method stub
		p.mark(s);
		
	}

}
