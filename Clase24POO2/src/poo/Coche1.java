package poo;
import javax.swing.*; //Se utilizará JOptionPane

public class Coche1 {

	public static void main(String args[]) {
		
		Coche Coche1 = new Coche(); // <- instanciar la clase
		
		//System.out.println(Coche1.ruedas); <- no puedo obtener una propiedad encapsulada
		System.out.println(Coche1.dimeDatosGenerales()); // <- obtengo propiedad encapsulada porque se me dio el permiso
		
		//Coche1.estableceColor("azul"); // si comentamos esta linea nos devuelve null porque la variable colo está vacia y el método setter si se comenta no convocaráa al método
		Coche1.estableceColor(JOptionPane.showInputDialog("Introduce color"));
		
		//Coche1.color = "verde"; //Estoy modificando el color. Es azul o verde <- nunca podemos modificar la propiedad de un objeto desde su instancia <- no se puede violar el concepto de encapsulación <- tenemos que encapsular las prpiedades cómo color para que sea manipulada dentro de setters
		
		//Los métodos getters y setters son cómo los cables de conexión que permite obtener o modificar propiedades. En la linea anterior estabamos modificando estas propiedades sin pasar por los canales correspondientes. Por ese motivo se es necesario el concepto de encapsulamiento
		
		//Coche1.establecerAsientos(4);
		Coche1.establecerAsientos(Integer.parseInt(JOptionPane.showInputDialog("Cantidad de asientos")));
		Coche1.establecerClimatizador(true);
		
		System.out.println(Coche1.dimeColor());
		System.out.println(Coche1.dimeAsientos());
		System.out.println(Coche1.dimeClimatizador());
		//No fue necesario llamar a un setter porque las dos lineas de abajo se construyó un getter y setter a la vez para establecer y obtener tanto el peso cómo el precio.
		System.out.println(Coche1.dimePesoCoche());
		System.out.println(Coche1.dimePrecioCoche());
	}
}


//SALIDA

/*


La plataforma del vehículo tiene 4 ruedas. Mide 2 metros con un ancho de 300cm y un peso de plataforma de 500 kg.
El color del coche es azul.
El coche tiene 4 asientos.
El coche tiene climatizador
El peso del coche es 1060Kg.
El precio final es 13500


*/
