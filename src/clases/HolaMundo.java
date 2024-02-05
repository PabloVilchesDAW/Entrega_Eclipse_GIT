package clases;

public class HolaMundo {
	private String mensaje="Hola Mundo";

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return this.getMensaje();
	}
	
	
}
