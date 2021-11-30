package main.java.com.utility;

public class Pos implements Position {

    /**
     * Value of the x-coordinate.
     */
    private final int x;
    /**
     * Value of the y-coordinate.
     */
    private final int y;

    public Pos(final int x, final int y) {
        super();
        this.x = x;
        this.y = y;
    }

    /** {@inheritDoc} */
    @Override
    public int getX() {
        return x;
    }

    /** {@inheritDoc} */
    @Override
    public int getY() {
        return y;
    }

    /**
     * Generated HashCode method.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

    /**
     * Generated equals method.
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pos other = (Pos) obj;
        if (x != other.x) {
            return false;
        } else if (y != other.y) {
            return false;
        }
        return true;
    }

    /**
     * Generated toString method.
     */
    @Override
    public String toString() {
        return "Pos [x=" + x + ", y=" + y + "]";
    }

}
