public class Main {
    public static void main(String[] args) {
        FabricaModerna fabricaModerna = new FabricaModerna();
        Cliente cliente = new Cliente(fabricaModerna);

        System.out.println(cliente.crearMesilla());

    }
}

/*El patrón se usa cuando queremos crear objetos que cumplen la misma función pero
que difieren en su forma o estilo y cada uno debe crearse con los de su tipo.
Al mismo tiempo el cliente crea los objeto de cada tipo (pero limitandose a que sean del mismo)
a través de una misma interfaz que implementada en cada clase de cada objeto*/

/*En el ejemplo, si el cliente selecciona una fabrica de muebles moderna, solo puede crear
*silla, sofa y mesilla del estilo Moderna*/