package Model;

public class Cliente {
	private String nombre, app, apm;

	public Cliente(String nombre, String app, String apm) {
		this.nombre = nombre;
		this.app = app;
		this.apm = apm;
	}
	
	public Cliente() {}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", app=" + app + ", apm=" + apm + "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getApm() {
		return apm;
	}

	public void setApm(String apm) {
		this.apm = apm;
	}
	
}
