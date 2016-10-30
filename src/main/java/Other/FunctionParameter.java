package Other;


class Rectangle {



    int length;
    int width;

    Rectangle(int l, int b) {
        length = l;
        width = b;
    }

    void area(Rectangle r1) {
        r1.setLength(100);
        int areaOfRectangle = r1.length * r1.width;

       // System.out.println("Area of Rectangle : "
                //+ areaOfRectangle);
    }

    public void setLength(int length) {
        this.length = length;
    }
    public int getLength() {
        return length;
    }



}

class FunctionParameter {
    public static void main(String args[]) {
        Rectangle r1 = new Rectangle(10, 20);
        System.out.println(r1.getLength());
        r1.area(r1);
        System.out.println(r1.getLength());
    }
}