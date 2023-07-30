package Final;

public class Cliente
{
int IDCliente; 
private String Nombre, Telefono,Direccion,Cedula;
public int getID_Cliente() {
	return IDCliente;
}
public void setIDCliente(int iD_Cliente) {
	IDCliente = iD_Cliente;
}

public String getCedula() {
	return Cedula;
}
public void setCedula(String cedula) {
	Cedula = cedula;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public String getTelefono() {
	return Telefono;
}
public void setTelefono(String telefono) {
	Telefono = telefono;
}
public String getDireccion() {
	return Direccion;
}
public void setDireccion(String direccion) {
	Direccion = direccion;
}

}
