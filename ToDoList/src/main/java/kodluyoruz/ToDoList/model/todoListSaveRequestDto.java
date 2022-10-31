package kodluyoruz.ToDoList.model;

public class todoListSaveRequestDto {

	 String day;
	 String content;
	 boolean done;
	 
	 
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	 
}
