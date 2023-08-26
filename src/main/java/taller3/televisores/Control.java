package taller3.televisores;

public class Control {
	private TV tv;

	
	public void enlazar(TV tv) {
		this.tv=tv;
		tv.setControl(this);
	}
	
	public void setTv(TV tel) { //Pendiente
		tv=tel;}
	public TV getTv() {
		return tv;}
	
	
	public void turnOn () {
		tv.turnOn();}
	
	public void turnOff () {
		tv.turnOff();}
	
	public void canalUp () {
		tv.canalUp();}
	
	public void canalDown () {
		tv.canalDown();}
	
	public void volumenUp () {
		tv.volumenUp();}
	
	public void volumenDown () {
		tv.volumenDown();}
	
	public void setCanal (int cambio) {
		if (cambio>=0 && cambio<=120) {
			tv.setCanal(cambio);}	
	}
	
	public void setVolumen (int nuevo) {
		if (nuevo>=0 && nuevo<=7) {
			tv.setVolumen(nuevo);
		}
	}
	
}
