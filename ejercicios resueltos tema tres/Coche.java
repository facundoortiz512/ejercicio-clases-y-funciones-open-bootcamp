public class Coche {
    private int puertas;

    Coche (int puertas) {
        this.puertas = puertas;
    }

    public void incrementarPuertas() { // Función que incrementa el número de puertas
        this.puertas += 1;
    }


    public int getPuertas() { // Muestra las puertas (la variable es privada así que usamos el método)
        return this.puertas;
    }


    public void setPuertas(int puertas) {// Coloca un valor en la variable puerta
        this.puertas = puertas;
    }

     public static void main (String[] args) {
      var miCoche = new Coche(3);
        miCoche.incrementarPuertas();
        System.out.println(miCoche.getPuertas());
        var micoche2 = new Coche (4);

    }
}