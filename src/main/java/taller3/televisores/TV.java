package taller3.televisores;

public class TV {
	
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	private static int numTV=0;
	
	public TV(Marca marca, boolean estado){
		this.marca=marca;
		this.estado=estado;
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
		numTV++;
	}
	
	public void setCanal(int canal) {
		this.canal=canal;}
	public int getCanal() {
		return canal;}
	
	public static void setNumTV(int nume) {
		numTV=nume;}
	public static int getNumTV() {
		return numTV;}
	
	public void setMarca(Marca tag) {
		marca=tag;}
	public Marca getMarca() {
		return marca;}
	
	public void setPrecio(int pre) {
		precio=pre;}
	public int getPrecio() {
		return precio;}
	
	public void setVolumen(int volumen) {
		this.volumen=volumen;}
	public int getVolumen() {
		return volumen;}
	
	public void setControl(Control cont) {
		control=cont;}
	public Control getControl() {
		return control;}
	
	
	public void turnOn() {
		estado=true;}
	
	public void turnOff() {
		estado=false;}
	
	public boolean getEstado() {
		return estado;}
	
	public void volumenUp() {
		if (estado && volumen<7 && volumen>=0) {
			volumen+=1;}
	}
	public void volumenDown() {
		if (estado && volumen>0 && volumen<=7) {
			volumen-=1;}
	}
	public void canalUp() {
		if (estado && canal<120 && canal>=1) {
			canal+=1;}
	}
	public void canalDown() {
		if (estado && canal>1 && canal<=120) {
			canal-=1;}
	}
}
