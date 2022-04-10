package CGlab;

public class GigaColor extends Vec3i {

    private int validateValue(int color){
        if (color < 0) {
            return 0;
        }

        if (color > 255) {
            return 255;
        } else {
            return color;
        }
    }

    public GigaColor(int x, int y, int z) {
        super(x,y,z);
        x = validateValue(x);
        y = validateValue(y);
        z = validateValue(z);
    }
}
