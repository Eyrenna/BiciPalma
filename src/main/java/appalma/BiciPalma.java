package appalma;

//_import bicicleta.Bicicleta;
import estacion.Estacion;
//_import tarjetaUsuario.TarjetaUsuario;

public class BiciPalma {

    public static void main(String[] args) {

        Estacion estacion = new Estacion(1, "Manacor", 6);

        /* caso TEST visualizar estado de la estacion
         * muestra id, direccion, anclaje
         * */

        System.out.println("\n **** caso TEST visualizar estado de la estacion **** \n");

        estacion.consultarEstacion();

        /* caso TEST visualizar anclajes libres */

        //_System.out.println("\n **** caso TEST visualizar anclajes libres **** \n");

        //_System.out.println("anclajesLibres: " + estacion.anclajesLibres());

        /* caso TEST anclar bicicleta(s) */

        //_System.out.println("\n **** caso TEST anclar bicicleta(s) **** \n");

        //_int[] bicicletas = {291, 292, 293, 294};

		/* // generar anclaje random
		for (int i: bicicletas){
			System.out.println( estacion.generarAnclaje());
		}
		*/

        //_for ( int id: bicicletas ){
        //_    Bicicleta bicicleta = new Bicicleta(id);
        //_    estacion.anclarBicicleta(bicicleta);
        }

        //_System.out.println("anclajesLibres tras generar "+ bicicletas.length + " bicis: " + estacion.anclajesLibres());

        /* caso TEST consultar bicicletas ancladas */

        //_System.out.println("\n **** caso TEST consultar bicicletas ancladas **** \n");

        //_estacion.consultarAnclajes();

        /* caso TEST retirar bicicleta */

        //_System.out.println("\n **** caso TEST retirar bicicleta **** \n");

        //_TarjetaUsuario tarjetaUsuario = new TarjetaUsuario("000456789", true);

        //_System.out.println("¿tarjeta de usuario activada? (true/false): " + estacion.leerTarjetaUsuario(tarjetaUsuario) );

        //_estacion.retirarBicicleta(tarjetaUsuario);

        //_estacion.consultarAnclajes();

        //_System.out.println("anclajesLibres: " + estacion.anclajesLibres());
    //_}
}
