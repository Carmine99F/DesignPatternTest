package AdapterPattern.Figure;

public class RectangleObjectAdapter implements Polygon{

    private Rectangle adaptee;  //Oggetto da adattare alla nuova interfaccia
    private String name = "NO NAME";

    public RectangleObjectAdapter(){
        adaptee = new Rectangle();
    }

    @Override
    public void define(float x0, float y0, float x1, float y1, String color) {
        float a = x1 - x0;
        float l = y1 - y0;
        adaptee.setShape( x0, y0, a, l, color);
    }

    @Override
    public float[] getCoordinates() {
        float aux[] = new float[4];
        aux[0] = adaptee.getOriginX();
        aux[1] = adaptee.getOriginY();
        aux[2] = adaptee.getOppositeCornerX();
        aux[3] = adaptee.getOppositeCornerY();
        return aux;
    }

    @Override
    public float getSurface() {
        return adaptee.getArea();
    }

    @Override
    public void setId(String id) {
        this.name = id;
    }

    @Override
    public String getId() {
        return this.name;
    }

    @Override
    public String getColor() {
        return adaptee.getColor();
    }
}
