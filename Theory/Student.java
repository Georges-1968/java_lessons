package Theory;

public class Student extends Human{
    public double getMark() {
        return mark;
    }

    public Student(String name){
        super(name);
    }
    public void setMark(double mark) {
        this.mark = mark;
    }

    private double mark;
}
