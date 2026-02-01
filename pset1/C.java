package pset1;

public class C {
    int f;

    public C(int f){ //constructor for C
        this.f = f;
    }

    @Override 
    public boolean equals(Object o){
        //asume this method is implemented for you
        if (this == o) return true; 
        if (o == null || getClass() != o.getClass()) return false;
        C other = (C) o;
        return this.f == other.f;
    }

    @Override 
    public int hashCode(){
        // assume this method is implemented for you
        return Integer.hashCode(f);
    }


}


