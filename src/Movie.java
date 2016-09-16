
//THIS LAB WAS WORKED ON BY PURBA MEARS, JAMES HOBSON & ROBERT CHROBAK

public class Movie {

	@Override
	public String toString() {
		return "Movie [Title=" + Title + ", Category=" + Category + "]";
	}

	private String Title;
	private String Category;

	public Movie(String Title, String Category) {
		this.Title = Title;
		this.Category = Category;
	}

	public void setTitle(String Title) {
		this.Title = Title;
	}

	public void setCategory(String Category) {
		this.Category = Category;
	}

	public String getTitle() {
		return Title;
	}

	public String getCategory() {
		return Category;
	}

}