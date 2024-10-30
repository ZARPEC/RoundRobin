package com.mycompany.roundrobin;

import java.awt.Color;
import java.util.Random;

public class so {

    int aux = 1;

    public boolean quantum(int tamqu) {
        boolean respuesta = false;

        if (tamqu >= 10 && tamqu <= 100) {
            respuesta = true;

        }
        return respuesta;
    }

    public String agregarproceso() {
        int procesoN = 0;
        procesoN = aux;
        aux++;

        return "P" + procesoN;
    }

    public Color createColor() {
        Random random = new Random();
        int rgb = random.nextInt(255);
        Color color = new Color(rgb);
        return color;
    }

}
