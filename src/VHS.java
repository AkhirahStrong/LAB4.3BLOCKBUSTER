import java.util.ArrayList;

public class VHS extends Movie{
	
	private int currentTime = 0;
	
	public VHS(String title, int runtime, ArrayList<String> scenes) {
		super(title, runtime, title, scenes);
	}


	@Override
	public void play() {
		if (currentTime < getScene().size()) {
            System.out.printf("Scene %d: %s%n", currentTime + 1, getScene().get(currentTime));
            currentTime++;
        } else if (currentTime >= getScene().size()) {
            rewind();
        }
		
	}


	public void rewind() {
		currentTime = 0;
		 
	}


	public int getCurrentTime() {
		return currentTime;
	}


	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
	}



	
	

}
