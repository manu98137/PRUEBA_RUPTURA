package modelos;

public class Suite extends  Habitacion implements Reservable{


    private boolean TieneJacuzzi;

    public Suite() {
        super(numero, precioBase);
        TieneJacuzzi = tieneJacuzzi;
    }

    @Override
    public void mostrarDetalles() {

    }

    @Override
    public void reservar() {

    }

    @Override
    public void cancelarReserva() {

    }
}
