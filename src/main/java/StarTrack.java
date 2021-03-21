class StarTrackTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(1);
        p1.setY(1);
        p1.setZ(1);

        Point p2 = new Point();
        p2.setX(1);
        p2.setY(1);
        p2.setZ(1);

        Point p3 = new Point();
        p3.setX(2);
        p3.setY(2);
        p3.setZ(3);

        StarTrack track1 = new StarTrack();
        track1.setStart(p1);
        track1.setFinish(p2);

        StarTrack track2 = new StarTrack();
        track2.setStart(p1);
        track2.setFinish(p2);

        StarTrack track3 = new StarTrack();
        track3.setStart(p1);
        track3.setFinish(p3);

        System.out.println(track1.equals(track2)); //Should be true
        System.out.println(track1.equals(track3)); //Should be false
        System.out.println(track1.hashCode() == track2.hashCode()); //Should be true

    }
}

class StarTrack extends StarTrackTest {
    private Point start;
    private Point finish;

    public Point getStart() {
        return start;
    }

    public Point getFinish() {
        return finish;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public void setFinish(Point finish) {
        this.finish = finish;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        StarTrack other = (StarTrack) obj;
        if (start.getX() != other.start.getX() && start.getY() != other.start.getY() && start.getZ() != other.start.getZ())  {
            return false;
        }
        if (finish.getX() != other.finish.getX() && finish.getY() != other.finish.getY() && finish.getZ() != other.finish.getZ()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + start.getX();
        result = prime * result + start.getY();
        result = prime * result + start.getZ();
        result = prime * result + finish.getX();
        result = prime * result + finish.getY();
        result = prime * result + finish.getZ();
        return result;
    }
}