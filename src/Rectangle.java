public class Rectangle {
  public int length;
  public int width;

  public Rectangle(int legth, int width) {
    this.length = length;
    this.width = width; 
  }
  
  public int getArear() {
    return length * width;
  }
  
  public int getPerimeter() {
    return 2 * (length + width);
  }

}
