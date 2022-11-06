public class Rectange {
    private double width;
    private double height;
    private String color;
    
    public Rectange(){
        height = 1;
        width = 1;
    }

    public Rectange(double width, double height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public String getColor(){
        return color.substring(1, 2).toUpperCase() + color.substring(2).toLowerCase();
    }

    public void setColor(String color){
        this.color = color;
    }

    public int findArea(){
        return (int)height * (int)width;
    }

    public int findPerimeter(){
        return ((int)height + (int)width) * 2;
    }

    @Override
    public String toString(){
        if (height <= 0 || width <= 0) return "INVALID";
        else return findPerimeter() + " " + findArea() + " " + getColor();
    }
}
