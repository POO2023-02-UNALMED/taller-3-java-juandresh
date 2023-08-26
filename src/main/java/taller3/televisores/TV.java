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
		this.control=new Control();
		numTV++;}
	
	
	public void setCanal(int can) {
		canal=can;}
	public int getCanal() {
		return canal;}
	
	public void setMarca(Marca tag) {
		marca=tag;}
	public Marca getMarca() {
		return marca;}
	
	public void setPrecio(int pre) {
		precio=pre;}
	public int getPrecio() {
		return precio;}
	
	public void setVolumen(int vol) {
		volumen=vol;}
	public int getVolumen() {
		return volumen;}
	
	public void setControl(Control cont) {
		control=cont;}
	public Control getControl() {
		return control;}
	
	
	public static void modificar(int valor) {}
	
	public void turnOn() {
		estado=true;}
	
	public void turnOff() {
		estado=false;}
	
	public boolean getEstado() {
		return estado;}
	
	public void volumenUp() {
		if (estado && volumen<7) {
			volumen++;}
	}
	public void volumenDown() {
		if (estado && volumen>0) {
			volumen--;}
	}
	public void canalUp() {
		if (estado && canal<120) {
			canal++;}
	}
	public void canalDown() {
		if (estado && canal>1) {
			canal--;}
	}
}
