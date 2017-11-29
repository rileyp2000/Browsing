import java.util.Stack;

/**
 * 
 * @author rileyp
 *
 */
public class BrowserModel {
	
	private BrowserView v;
	private Stack<Integer> fwd;
	private Stack<Integer> back;
	private int lineNum;
	
	
	public BrowserModel(BrowserView view) {
		v = view;
		v.update(0);
		
		fwd = new Stack<Integer>();
		back = new Stack<Integer>();
	}

	public boolean hasBack() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasForward() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void back() {
		
	}
	
	public void forward() {
		
	}
		
	public void home() {
		// TODO Auto-generated method stub
	}
	
	public void followLink(int n) {
		
	}
}
