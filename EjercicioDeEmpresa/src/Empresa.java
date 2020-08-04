import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;
public class Empresa {

	public static double  diaDePago(ArrayList<Empleado>empleados) {
		double salario=0;
		for(int i = 0; i<empleados.size();i++) {
			Empleado emp = empleados.get(i);
			if(emp instanceof Oficinista) {
				Oficinista empofi = (Oficinista) emp;
			}
			else if(emp instanceof SupervisoresTecnicos) {
				SupervisoresTecnicos empsut = (SupervisoresTecnicos) emp;
			} 
			else if(emp instanceof Gerentes){
				Gerentes empge = (Gerentes) emp;
			}
			salario +=emp.getSalario();
		}
		return salario;
	}

	public static void main(String[] args) {
		double salario, anio, bono;
		ArrayList<Empleado>empleados = new ArrayList<>();
		Empleado emp1 = new Oficinista("Cristel", "0979472613", 813);
		Empleado emp2 = new SupervisoresTecnicos("Noemi", "0958261741", 900);
		Empleado emp3 = new Gerentes("Orlando", "0959423424",163);
		Empleado emp4 = new SupervisoresTecnicos("Lissette", "09868281715",915);
		
		System.out.println("Ingrese el salario: ");
		Scanner entrada = new Scanner(System.in);
		salario = entrada.nextInt();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese los años laborales: ");
		Scanner ent1 = new Scanner(System.in);
		anio = entrada.nextInt();
		Scanner in1 = new Scanner(System.in);
		
		System.out.println("Ingrese el bono:");
		Scanner entr2 = new Scanner(System.in);
		bono = entrada.nextInt();
		Scanner in2 = new Scanner(System.in);
		
		
		emp1.Sueldo(salario);
		emp2.Sueldo(salario); 
		emp3.Sueldo(salario);
		emp4.Sueldo(salario);
		
		empleados.add(emp1);
		empleados.add(emp2);
		empleados.add(emp3);
		empleados.add(emp4);
			
		System.out.println(diaDePago(empleados));
		
	}
}