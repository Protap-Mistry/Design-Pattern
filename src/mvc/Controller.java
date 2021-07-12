package mvc;

public class Controller {
	private Model model;
	private View view;
	
	public Controller(Model m, View v) {
		this.model= m;
		this.view= v;
	}
	
	public void setUpdateName(String n) {
		model.setName(n);
	}
	public void setUpdateRoll(String r) {
		model.setRoll(r);
	}
	
	public String getUpdateName() {
		return model.getName();
	}
	public String getUpdateRoll() {
		return model.getRoll();
	}
	
	public void output() {
		view.showDetails(model.getName(), model.getRoll());
	}
}
