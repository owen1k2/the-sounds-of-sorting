package edu.grinnell.csc207.soundsofsorting;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * A drawing panel for visualizing the contents of a @NoteIndices object.
 */
public class ArrayPanel extends JPanel {
    private NoteIndices notes;
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;
    private int total;
    private int constHeight;
    private int constWidth;

    /**
     * Create a new <code>ArrayPanel</code> with the given notes and dimensions.
     * 
     * @param notes  the note indices
     * @param width  the width of the panel
     * @param height the height of the panel
     */
    public ArrayPanel(NoteIndices notes, int width, int height) {
        this.notes = notes;
        this.setPreferredSize(new Dimension(width, height));

    }

    @Override
    public void paintComponent(Graphics g) {
        int i = 0;
        total = notes.getNotes().length;
        constHeight = (int) HEIGHT / total;
        constWidth = (int) WIDTH / total;
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        while (i < total) {
            if (notes.isHighlighted(i)) {
                g.setColor(Color.RED);
            } else if (i % 4 == 0) {
                g.setColor(Color.GREEN);
            } else if (i % 4 == 1) {
                g.setColor(Color.CYAN);
            } else if (i % 4 == 2) {
                g.setColor(Color.GRAY);
            } else {
                g.setColor(Color.BLUE);
            }
            g.fillRect(i * constWidth, HEIGHT - (notes.getNotes()[i] + 1) 
                      * constHeight, constWidth,
                    (notes.getNotes()[i] + 1) * constHeight);
            i++;
        }
        notes.clearAllHighlighted();
    }
}