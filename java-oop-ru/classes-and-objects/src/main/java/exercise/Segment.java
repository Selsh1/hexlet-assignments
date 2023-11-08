package exercise;

// BEGIN
public class Segment {
    private Point begin;
    private Point end;

    public Segment(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Point getBeginPoint() {
        return this.begin;
    }

    public Point getEndPoint() {
        return this.end;
    }

    public Point getMidPoint() {
        int x = Segment.mid(this.begin.getX(), this.end.getX());
        int y = Segment.mid(this.begin.getX(), this.end.getY());

        return new Point(x, y);
    }

    private static int mid(int begin, int end) {
        return (begin + end) / 2;
    }
}
// END
