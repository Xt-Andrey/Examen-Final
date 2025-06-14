public class ConsumoGasolina {
    public static int contarConsumosAltos(int[][] matriz) {
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > 8) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public static double promedioConsumoModerado(int[][] matriz) {
        int suma = 0;
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] >= 4 && matriz[i][j] <= 7) {
                    suma += matriz[i][j];
                    contador++;
                }
            }
        }
        return contador > 0 ? (double) suma / contador : 0;
    }
    public static void imprimirConsumoBajo(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 3) {
                    System.out.println("Posición [" + i + "][" + j + "]: " + matriz[i][j] + " galones");
                }
            }
        }
    }

    public static int[] posicionConsumoMaximo(int[][] matriz) {
        int max = Integer.MIN_VALUE;
        int[] posicion = new int[2];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    posicion[0] = i;
                    posicion[1] = j;
                }
            }
        }
        return posicion;
    }
    public static double[] eficienciaPorVehiculo(int[][] matriz) {
        double[] eficiencias = new double[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            double suma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
            eficiencias[i] = suma / matriz[i].length;
        }
        return eficiencias;
    }
}
//profe no me sirvio java para correrlo no se si me sirva :(