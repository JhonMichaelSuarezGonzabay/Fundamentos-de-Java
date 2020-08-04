public class SupervisoresTecnicos extends Empleado {
	public SupervisoresTecnicos(String nombre, String cedula, int codigo) {
		super(nombre, cedula, codigo);
	}

	public void Sueldo(double salario) {
		this.salario=salario+(salario*((getAnio()*5)/100));
	}

}
