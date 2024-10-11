package bikeproject;

public interface RoadParts {
  final String TERRAIN = "track_racing";

  public int getTyreWidth();
  public void setTyreWidth(int newValue);

  public int getPostHeight();
  public void setPostHeight(int newValue);
}
