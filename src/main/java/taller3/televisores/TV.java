package taller3.televisores;

public class TV {
	
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	private static int numTV=0;
	
	
	public TV(Marca tag, boolean status){
		marca=tag;
		estado=status;}
	
	public TV(int canal, int volumen, int precio) {
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;}
	
	
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
	
	
	void modificar(int numTV) {
		numTV++;
	}
}
