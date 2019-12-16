import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args)
    {
        Graphics g;
        Cube cube = new Cube();
        cube.scale(100);
        cube.rotate(0,0,0);
        Viewer v = new Viewer(100,100,cube);
    }
}
