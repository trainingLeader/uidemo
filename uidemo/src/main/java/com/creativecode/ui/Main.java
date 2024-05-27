package com.creativecode.ui;

import java.text.MessageFormat;


import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
       JOptionPane.showMessageDialog(null, "Hola programadores");
       //----------------------
       String nombre = JOptionPane.showInputDialog("Escriba su nombre :");
       JOptionPane.showMessageDialog(null, MessageFormat.format("Nombre : {0}",nombre));
       //----------------------
       JOptionPane.showConfirmDialog(null, "Mensaje", "Informacion", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
       JOptionPane.showConfirmDialog(null, "Mensaje", "Informacion", JOptionPane.OK_OPTION, JOptionPane.ERROR_MESSAGE);
       JOptionPane.showConfirmDialog(null, "Mensaje", "Informacion", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
       JOptionPane.showConfirmDialog(null, "Mensaje", "Informacion", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
       //---------------------
        String[] options = {"Español", "Inglés", "Francés", "Alemán"};
        Object defaultOption = options[3];
        // Mostrar el cuadro de diálogo y obtener la selección del usuario
        Object opcion = JOptionPane.showInputDialog(null, "mensaje", "", JOptionPane.QUESTION_MESSAGE,null,options,defaultOption);
        System.out.println("Idioma seleccionado: " + opcion);

    }
}