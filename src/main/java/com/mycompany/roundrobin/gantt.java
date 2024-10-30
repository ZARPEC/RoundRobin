package com.mycompany.roundrobin;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author ingri
 */
public class gantt extends javax.swing.JPanel {

    private final int altopanel = 200;
    private final int anchopanel = 570;
    private final int bound = 30;
    private final int alturagrafica = altopanel - bound;
    private final int anchografica = anchopanel - 2 * bound;
    private final int alturainicial = (altopanel - alturagrafica) / 2;
    int rafaga = 0;
    int contador = 0;
    boolean saltar = false;
    int sumTime = 0;
    int[] ArrayRafaga = new int[interfaz.tabla.getRowCount()];
    int tamañoR = ArrayRafaga.length;

    private final int[][] colores = {
        {215, 13, 4},
        {230, 153, 245},
        {24, 248, 217},
        {86, 131, 228},
        {110, 241, 167},
        {54, 250, 11},
        {251, 199, 5},
        {248, 68, 128},
        {40, 247, 250},
        {18, 7, 127},
        {72, 180, 184},
        {28, 198, 77},
        {116, 28, 198}
    };

    public gantt() {
        initComponents();
    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, anchopanel, altopanel);
        g.setColor(Color.BLACK);
        g.drawRect(bound, alturainicial, anchografica, alturagrafica);
        sumTime = 0;
        for (int H = 0; H < ArrayRafaga.length; H++) {
            ArrayRafaga[H] = interfaz.Grafaga[H];

        }
        sumTime = getSumTime();
        while (existeCero(ArrayRafaga)) {
            saltar = false;
            System.out.println(contador + " contador");

            int startTime = 0, startWidth = 0, runTime = 0, width = 0, endTime = 0, endWidth = 0;

            if (existeCero(ArrayRafaga) && ArrayRafaga[contador] > 0) {
                startTime = TiempoInicial();

                startWidth = convertTimeToWidth(TiempoInicial(), sumTime, true);
                runTime = ArrayRafaga[contador];
                if (rafaga == 0) {
                    startTime = TiempoInicial();

                    startWidth = convertTimeToWidth(TiempoInicial(), sumTime, true);
                    runTime = ArrayRafaga[contador];
                    width = convertTimeToWidth(interfaz.tamqu, sumTime, false);

                    endTime = startTime + rafaga;

                    endWidth = startWidth + width;

                    g.setColor(new java.awt.Color(colores[contador][0], colores[contador][1], colores[contador][2]));
                    g.fillRect(startWidth, alturainicial, width, alturagrafica);

                    g.setColor(Color.BLACK);
                    g.drawString(startTime + "", startWidth, alturainicial);
                    g.drawLine(endWidth, alturainicial, endWidth, alturainicial + alturagrafica);

                } else {

                    width = convertTimeToWidth(rafaga, sumTime, false);

                    endTime = startTime + rafaga;

                    endWidth = startWidth + width;

                    g.setColor(new java.awt.Color(colores[contador][0], colores[contador][1], colores[contador][2]));
                    g.fillRect(endWidth, alturainicial, width, alturagrafica);
                    System.out.println(endWidth + ", " + alturainicial + ", " + width + ", " + alturagrafica);

                    g.setColor(Color.BLACK);
                    g.drawString(startTime + "", startWidth, alturainicial);
                    g.drawLine(endWidth, alturainicial, endWidth, alturainicial + alturagrafica);

                    if (ArrayRafaga[contador] > 0) {

                        System.out.println("ancho" + (endWidth + startWidth) / 2);
                        g.drawString(endTime + "", endWidth, alturainicial);
                    }
                }

            }
            if (ArrayRafaga[contador] > 0) {
                rafaga += RestQuan(ArrayRafaga[contador], contador);
                for (int k = 0; k < ArrayRafaga.length; k++) {
                    System.out.print(ArrayRafaga[k] + " ");
                }
                System.out.println("\n");
            } else {
                contador++;
                saltar = true;
            }

            if (!saltar) {
                contador++;
            }
            if (contador == tamañoR) {
                contador = 0;

            }

        }

        g.setColor(Color.WHITE);
        g.fillRect(anchopanel - bound, alturainicial, 50, alturagrafica);
        g.setColor(Color.BLACK);
        g.drawString(sumTime + "", anchopanel - bound, alturainicial);
        g.drawRect(bound, alturainicial, anchografica, alturagrafica);

    }

    private int convertTimeToWidth(int time, int sumTime, boolean haveBound) {

        int width = 0;
        width += (int) (((double) time * anchografica / sumTime));
        if (!haveBound) {
            return width;
        }
        width += bound;
        return width;
    }

    private int getSumTime() {
        int sumTime = 0;
        if (existeCero(ArrayRafaga)) {
            for (int i = 0; i < ArrayRafaga.length; i++) {
                sumTime += ArrayRafaga[i];
            }

        }
        return sumTime;
    }

    public int RestQuan(int rafaga, int pos) {
        int tamaño = 0;
        int rafagaRestante = ArrayRafaga[pos];
        if (rafaga > interfaz.tamqu) {
            rafaga -= interfaz.tamqu;
            tamaño = interfaz.tamqu;

            ArrayRafaga[pos] = rafaga;
        } else {
            tamaño = ArrayRafaga[pos] -= rafagaRestante;
            ArrayRafaga[pos] = tamaño;
            //rafaga = tamaño;
            tamaño = rafagaRestante;

        }
        return tamaño;
    }


    int tiempo = 0;
    int cont = 0;

    public int TiempoInicial() {

        if (cont == 0) {
            tiempo = 0;
            cont++;

        } else {

            //tiempo += interfaz.tamqu;
            tiempo = 0;
        }
        return tiempo;

    }

    public boolean existeCero(int[] verificar) {
        boolean existe = false;
        for (int i = 0; i < verificar.length; i++) {
            if (verificar[i] > 0) {
                existe = true;
            }
        }
        return existe;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(153, 255, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
