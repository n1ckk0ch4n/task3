public class Program {
    public static final Line L1 = new Line(5, -4, 5.0 / 2);
    public static final Rectangle R1 = new Rectangle(2, 4, 4, -5);
    public static final HorizontalParabola P1 =
            new HorizontalParabola(6, 1, 1.41); //sqrt 2
    public static final HorizontalParabola P2 =
            new HorizontalParabola(-6, 1, -1.41);
    public static SimpleColor getColor(double x, double y) {

        if (R1.isPointInRectangle(x, y)) {
            return SimpleColor.BLUE;
        }
        if (!(P2.isPointRightOfParabola(x, y))) {
            return SimpleColor.BLUE;
        }

        if (!(P1.isPointRightOfParabola(x, y))&& L1.isPointAboveLine(x, y)) {
            return SimpleColor.GRAY;
        }
        if (L1.isPointAboveLine(x, y)) {
            return SimpleColor.WHITE;
        }
        if (!(P1.isPointRightOfParabola(x, y) && (!L1.isPointAboveLine(x, y)))){
            return SimpleColor.WHITE;
        }
        return SimpleColor.ORANGE;
    }
}
