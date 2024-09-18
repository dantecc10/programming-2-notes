package practices.cafe7;

public class Datos {

    private String nombre;
    private int numMaquina;
    private int horaEntrada;
    private int minutoEntrada;
    private int horaSalida;
    private int minutoSalida;
    private int horaIncremento;
    private int minutoIncremento;
    private double pagoTotal;
    
    // Constructor
    public Datos(String nombre, int numMaquina, int horaEntrada, int minutoEntrada) {
        this.nombre = nombre;
        this.numMaquina = numMaquina;
        this.horaEntrada = horaEntrada;
        this.minutoEntrada = minutoEntrada;
        this.horaSalida = horaEntrada;
        this.minutoSalida = minutoEntrada;
        pagoTotal = 0.0;
    }
    
    // Métodos para modificar y mostrar datos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNumMaquina(int numMaquina) {
        this.numMaquina = numMaquina;
    }
    
    public int getNumMaquina() {
        return numMaquina;
    }
    
    public void setHoraEntrada(int hora, int minuto) {
        horaEntrada = hora;
        minutoEntrada = minuto;
    }
    
    public String getHoraEntrada() {
        return String.format("%02d:%02d", horaEntrada, minutoEntrada);
    }
    
    public void setHoraSalida(int hora, int minuto) {
        horaSalida = hora;
        minutoSalida = minuto;
    }
    
    public String getHoraSalida() {
        return String.format("%02d:%02d", horaSalida, minutoSalida);
    }
    
    public String getTiempoIncremento() {
        return String.format("%02d:%02d", horaIncremento, minutoIncremento);
    }
    
    public double getPagoTotal() {
        return pagoTotal;
    }
    
    // Método para calcular el pago
    public void calculaPago() {
        int llegada = (horaEntrada * 60 + minutoEntrada);
        int salida = (horaSalida * 60 + minutoSalida);
        if (salida > llegada) {
            int minutosUsados = salida - llegada;
            pagoTotal = (minutosUsados / 60.0) * 11.50;
        } else
            System.out.print("E R R O R !");
    }
    
    // Método para incrementar el tiempo
    public void incrementaTiempo(int minutoIncremeto, int horaIncremento) {
        minutoSalida += minutoIncremento;
        horaSalida += horaIncremento;
        
        if (minutoSalida >= 60) {
            horaSalida += minutoSalida / 60;
            minutoSalida %= 60;
        }
    }
}