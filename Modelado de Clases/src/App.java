public class App {
    public static void main(String[] args) throws Exception {
        
        Empresa empresa = new Empresa("Manolo", 5578137, "Calle Tortolo");
        Parada paradaOrigen = new Parada("1A", "Av. Carlos", "San Fernando", "Chaco");
        Parada paradaDestino = new Parada("2A", "Av. 25 Mayo", "Chamaco", "San Luis");
        Viaje viaje = new Viaje(6, 18, 1000000, paradaOrigen, paradaDestino, 50);
        Pasajero pasajero1 = new Pasajero("Juan Perez", 99909);
        Pasajero pasajero2 = new Pasajero("Rolando Deprisa", 1195609);
        Pasajero pasajero3 = new Pasajero("Casi Mekago", 1233211233);
        Vendedor vendedor = new Vendedor();
        
        empresa.addParada(paradaOrigen);
        empresa.addParada(paradaDestino);
        empresa.addViaje(viaje);
        empresa.addVendedor(vendedor);
        empresa.addPasajero(pasajero1);
        empresa.addPasajero(pasajero2);
        empresa.addPasajero(pasajero3);

        Asiento asiento1 = new Asiento(1);
        Reserva reserva1 = new Reserva(21, 21, 21, 1, 5000.0, pasajero1, viaje, asiento1, vendedor);
        viaje.agregarReserva(reserva1, asiento1);
        vendedor.addReserva(reserva1);
        Asiento asiento2 = new Asiento(2);
        Reserva reserva2 = new Reserva(22, 22, 22, 2, 5000.0, pasajero2, viaje, asiento2, vendedor);
        viaje.agregarReserva(reserva2, asiento2);
        vendedor.addReserva(reserva2);
        Asiento asiento3 = new Asiento(3);
        Reserva reserva3 = new Reserva(23, 23, 23, 3, 5000.0, pasajero3, viaje, asiento3, vendedor);
        viaje.agregarReserva(reserva3, asiento3);
        vendedor.addReserva(reserva3);

        vendedor.getReservasRealizadas();

    }
}
