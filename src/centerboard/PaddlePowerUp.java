package centerboard;

import models.Ball;
import models.Paddle;

import java.awt.*;

/**
 * Created by Faiz Ghifari Haznitrama on 22/04/2017.
 */

public class PaddlePowerUp extends Cell implements PowerUp {
    @Override
    public void usePU(Ball b, Paddle p) {
        p.startTimer();
        p.changeLength();
    }

    @Override
    public void spawn() {
        type = PAD_POWERUP;
    }

    @Override
    public Color getColor() {
        return PAD_PU_COLOR;
    }
}