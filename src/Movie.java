import java.util.ArrayList;

public abstract class Movie {

	private String title;
	private int runTime;
	private String category;
	
	

	ArrayList <String> scenes = new ArrayList<>();
	
	public Movie(String title, int runtime, String category,  ArrayList<String> scenes) {
        this.title = title;
        this.runTime = runtime;
        this.scenes = scenes;
    }
	
	
	
	@Override
	public String toString() {
		return "Movie [title=" + title + ", runTime=" + runTime + ", scenes=" + scenes + "]";
	}

	public void printInfo() {
		System.out.println(getTitle() + getRunTime());
		
	}

	public ArrayList<String> setScenes(ArrayList<String> scenes) {
        this.scenes = scenes;
        return scenes;
    }

	public abstract void play();
	
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}
	

	public ArrayList<String> getScene() {
		return scenes;
	}

	public void setScene(ArrayList<String> scene) {
		this.scenes = scene;
	}


	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}


	
	

}
