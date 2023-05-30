package ar.edu.unlp.info.oo2.ejercicio223_Monitoreo;

public abstract class ProcessStep {
	private boolean result;
	
	public void execute (MixingTank tank) {
		if (this.basicExecute(tank)) {
			this.setSuccess();
		}
		else this.setFailure();
	}
	
	protected abstract boolean basicExecute(MixingTank tank);
	
	public boolean isDone() {
		return this.result;
	}
	
	private void setSuccess() {
		this.result = true;
	}
	
	private void setFailure() {
		this.result = false;
	}
}
