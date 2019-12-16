import org.w3c.dom.css.RGBColor;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;
import java.nio.file.Path;
import java.util.Scanner;
public class Facet {
    private R3Vector[] vertex;

    public Facet(R3Vector v1, R3Vector v2, R3Vector v3, R3Vector v4){
        vertex = new R3Vector[4];

        vertex[0] = v1;
        vertex[1] = v2;
        vertex[2] = v3;
        vertex[3] = v4;
    }

    public void out(){
        for(int i=0; i<4; i++){
            vertex[i].out();
        }
    }

    public void rotate(double ux,double uy,double uz){
        for (int i=0; i<4; i++){
            vertex[i].rotate(ux,uy,uz);
        }
    }

    public void scale(double k){
        for (int i=0; i<4; i++){
            R3Vector.scale(k, vertex[i]);
        }
    }

    public void translate(double x, double y, double z){
        for (int i=0; i<4; i++){
            vertex[i].translate(x,y,z);
        }
    }

    public void draw(Graphics2D g){
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        Path2D p=new Path2D.Double();
        p.moveTo(vertex[0].GetX(),vertex[0].GetY());
        p.lineTo(vertex[1].GetX(),vertex[1].GetY());
        p.lineTo(vertex[2].GetX(),vertex[2].GetY());
        p.lineTo(vertex[3].GetX(),vertex[3].GetY());
        p.lineTo(vertex[0].GetX(),vertex[0].GetY());
        p.closePath();
        g.fill(p);
    }
    public R3Vector normal(){
        return R3Vector(vertex[1].GetX() - vertex[0].GetX())
    }
}