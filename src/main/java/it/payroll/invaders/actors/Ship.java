package it.payroll.invaders.actors;

import java.awt.*;

public class Ship extends AbstractSprite {

    public Ship(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(getX(), getY(), getWidth(), getHeight());
    }

}
