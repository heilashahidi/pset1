package pset1;

public class D extends C {
    int g;

    public D(int f, int g) { //constructor for D
        super(f);
        this.g = g;
    }

    @Override 
    public boolean equals(Object o){
        // assume this method is implemented for you
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        D other = (D) o;
        return this.f == other.f && this.g == other.g;
    }

    @Override
    public int hashCode() {
        //assume this method is implemented for you
        int result = Integer.hashCode(f);
        result = 31 * result + Integer.hashCode(g);
        return result;
    }


    
}
