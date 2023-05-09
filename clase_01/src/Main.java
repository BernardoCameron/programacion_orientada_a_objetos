public class Main {
    public static void main(String[] args) {
        String [] animal = {"Perro", "Pez", "Gato", "Tortuga", "Pajaro"};
        String [] nombre = {"Manchitas", "Nemo", "Silvestre", "Manuelita", "Gardel"};
        int [] edad = {2, 1, 3, 12, 1};
        double [] cantAlimento = {1.5, 0.14, 0.5, 0.3, 0.35};
        String [] sonido = {"woof woof", "glu glu", "miau miau", "Pehuajo", "pio pio"};

        for (int i = 0; i< animal.length; i++) {
            if(animal[i] == "Tortuga"){
                System.out.println("La " + animal[i] + " llamada " + nombre[i] + " tiene " + edad[i] + " anios, come " + cantAlimento[i] + " kilos de alimento y vivia en " + sonido[i]);

            }else
                System.out.println("El " + animal[i] + " llamado " + nombre[i] + " tiene " + edad[i] + " anios, come " + cantAlimento[i] + " kilos de alimento y hace " + sonido[i]);
            }
        }
    }