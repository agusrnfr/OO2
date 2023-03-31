package ar.edu.unlp.info.oo2.ejercicio7_ToDoItem;

import java.time.Duration;
import java.time.LocalDateTime;

public class Paused extends State{

	public Paused(ToDoItem task) {
		super(task);
	}

	@Override
	public void start() {
	}

	@Override
	public void togglePause() {
		this.getTask().setState(new InProgress(this.getTask()));
		
	}

	@Override
	public void finish() {
		this.getTask().setState(new Finished(this.getTask()));
		this.getTask().setEnd(LocalDateTime.now());
	}
}
