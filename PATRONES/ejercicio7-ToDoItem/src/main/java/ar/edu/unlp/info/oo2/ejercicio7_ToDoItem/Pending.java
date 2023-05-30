package ar.edu.unlp.info.oo2.ejercicio7_ToDoItem;

import java.time.Duration;
import java.time.LocalDateTime;

public class Pending extends State{
	
	public Pending(ToDoItem task) {
		super(task);
	}

	@Override
	public void start() {
		this.getTask().setState(new InProgress(this.getTask()));
		this.getTask().setStart(LocalDateTime.now());
	}

	@Override
	public void togglePause() {
		throw new RuntimeException("ERROR: you can't pause (or unpause) in pending state");
	}

	@Override
	public void finish() {
	}

	@Override
	public Duration workedTime() {
		throw new RuntimeException("ERROR: the task never started");
	}
}
