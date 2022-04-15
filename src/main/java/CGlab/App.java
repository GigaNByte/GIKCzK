package CGlab;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    String version = "0.02";

    public static void main(String[] args) throws IOException {

        System.out.println("=========ARGS=========");
        System.out.println("path to png file:");
        System.out.println(args[0]);
        System.out.println("png width:");
        System.out.println(args[1]);
        System.out.println("====================");
        System.out.println("png height:");
        System.out.println(args[2]);
        System.out.println("line drawing method:");
        System.out.println(args[3]);
        System.out.println("====================");
/*
        Renderer mainRenderer = new Renderer(args[0],Integer.parseInt(args[1]),Integer.parseInt(args[2]),args[3]);
        mainRenderer.clear();

        lab 1,2
        mainRenderer.clear();
        mainRenderer.drawPoint( Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        mainRenderer.clear();

        mainRenderer.drawLine(50,50,100, 50 +5,  Renderer.LineAlgo.valueOf(args[3])); //octet: 0 Work
        mainRenderer.drawLine(50,50,100, 0 +5,  Renderer.LineAlgo.valueOf(args[3]));//octet: 1 Work
        mainRenderer.drawLine(50,50,50, 0+5,  Renderer.LineAlgo.valueOf(args[3]));//octet: 2 Doesnt work

        mainRenderer.drawLine(50,50,0, 0+5,  Renderer.LineAlgo.valueOf(args[3]));//octet: 3 Doesnt Work
        mainRenderer.drawLine(50,50,0, 50+5,  Renderer.LineAlgo.valueOf(args[3]));//octet: 4 Doesnt Work

        mainRenderer.drawLine(50,50,0, 100 -5,  Renderer.LineAlgo.valueOf(args[3]));//octet: 5 Doesnt Work
        mainRenderer.drawLine(50,50,50, 100 -5,  Renderer.LineAlgo.valueOf(args[3]));//octet: 6 Doesnt Work
        mainRenderer.drawLine(50,50,100, 100 -5,  Renderer.LineAlgo.valueOf(args[3]));//octet: 7  Work


       // lab 3,4
        mainRenderer.drawLine(50,50,0, 20,  Renderer.LineAlgo.valueOf(args[3]));
        mainRenderer.drawTriangle(new Vec2i(10,10),new Vec2i(10,30), new Vec2i(40,10),new GigaColor(255,0,0));

*/

        RandomColorRenderer mainRenderer = new RandomColorRenderer(args[0],Integer.parseInt(args[1]),Integer.parseInt(args[2]),args[3]);
        Model myszojelen = new Model();
        myszojelen.readOBJ("deer.obj");
        mainRenderer.clear();
        mainRenderer.render(myszojelen);


        try {
            mainRenderer.save();
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String getVersion() {
	return this.version;
    }
}
