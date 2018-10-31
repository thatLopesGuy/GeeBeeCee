package display;

/**
 * Interface defining a screen painter
 *
 * @Author thatLopesGuy 26/10/2018
 */
public interface ScreenPainter {

    void paint(int x, int y, int rgba);

    void paintAll();

    void clear(int x, int y);

    void clearAll();

}
