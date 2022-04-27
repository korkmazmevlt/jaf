package activity7;

public class Periodicals {
	private String type;
	
	private String editor;
	private int pages;
	private int minAge;
	private int maxAge;
	public Periodicals(String type, String editor, int pages, int minAge, int maxAge) {
		this.type = type;
		this.editor = editor;
		this.pages = pages;
		this.minAge = minAge;
		this.maxAge = maxAge;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getMinAge() {
		return minAge;
	}
	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}
	public int getMaxAge() {
		return maxAge;
	}
	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}
	

}
	