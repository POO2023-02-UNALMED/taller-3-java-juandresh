package taller3.televisores;

public class Control {
	private TV tv;

	
	public void enlazar(TV tv) {
		this.tv=tv;
		tv.setControl(this);
	}
	
	public void setTv(TV tel) {
		tv=tel;}
	public TV getTv() {
		return tv;}
	
	
	public void turnOn () {
		tv.turnOn();}
	
	public void turnOff () {
		tv.turnOff();}
	
	public void canalUp () {
		if(tv !=null) {
			tv.canalUp();
		}	
	}
	public void canalDown () {
		if(tv !=null) {
			tv.canalDown();
		}
	}
	
	public void volumenUp () {
		if(tv !=null) {
			tv.volumenUp();
		}
	}
	
	public void volumenDown () {
		if(tv !=null) {
			tv.volumenDown();
		}
	}
	
	public void setCanal (int canal) {
		if (tv != null) {
			tv.setCanal(canal);
		}
	}
	
	public void setVolumen (int volumen) { 
		if (tv != null) {
			tv.setVolumen(volumen);
		}
	}
	
}
