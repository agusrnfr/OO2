package ar.edu.unlp.info.oo2.ejercicio7_ToDoItem;

import java.time.Duration;

public abstract class State {
	private ToDoItem task;
	
	public State (ToDoItem task) {
		this.task = task;
	}
	
	public ToDoItem getTask() {
		return task;
	}
	
	public Duration workedTime() {
		return Duration.between(this.task.getStart(),this.task.getEnd());
	}
	
	public void addComment(String comment) {
		this.task.getCommentaries().add(comment);
	}
	
	public abstract void start();
	public abstract void togglePause();
	public abstract void finish();
}

