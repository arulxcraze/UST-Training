class Rectangle {
    private int width;
    private int height;
  
    public Rectangle(int width, int height) {
      this.width = width;
      this.height = height;
    }
  
    int calculateArea() {
      return width * height;
    }
  
    int calculatePerimeter() {
      return 2 * (width + height);
    }
  }
  
  class Calculate {
    public static void main(String[] args) {
      Rectangle r = new Rectangle(5, 10);
      System.out.println("Area: " + r.calculateArea());
      System.out.println("Perimeter: " + r.calculatePerimeter());
    }
  }
  