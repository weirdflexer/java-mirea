public class Circle implements Comparable<Circle>{
  public float radius;

  public Circle(float radius) {
    this.radius = radius;
  }

  @Override
  public int compareTo(Circle obj) {
    if(this.radius > obj.radius) {
      return 1;
    } else if(this.radius < obj.radius)  {
      return -1;
    } else {
      return 0;
    }
  }
}
