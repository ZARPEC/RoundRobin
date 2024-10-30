package com.mycompany.roundrobin;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author ingri
 */
public class lista extends JPanel implements ListCellRenderer<String> {

    int bound = 3;
    JLabel ColorLabel = new JLabel();
    JLabel Proceso = new JLabel();

    private int[][] colores = {
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

    public lista() {
        setLayout(new GridLayout(1, 2, 5, 5));
        setBorder(new EmptyBorder(bound, bound, bound, bound));
        add(ColorLabel);
        add(Proceso);

    }

    @Override
    public Component getListCellRendererComponent(JList<? extends String> list, String value, int index, boolean isSelected, boolean cellHasFocus) {

        ColorLabel.setOpaque(true);
        ColorLabel.setPreferredSize(new Dimension(20, 1));
        ColorLabel.setBackground(new java.awt.Color(colores[index][0], colores[index][1], colores[index][2]));
        Proceso.setText(value);

        if (isSelected) {
            Proceso.setBackground(list.getSelectionBackground());
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            Proceso.setBackground(list.getBackground());
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        return this;
    }

}
