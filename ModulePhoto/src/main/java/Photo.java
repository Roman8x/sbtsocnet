import java.util.Objects;

/**
 Iloadasset - фото можно загрузить из БД
 IAsset -
  */
public class Photo implements ILoadAsset  {
    private String name;
    private String url;
    private String description;
    private float latitude;
    private float longitude;

    public Photo(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    @Override
    public void loadAsset() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Photo photo = (Photo) o;
        return Float.compare(photo.latitude, latitude) == 0 &&
                Float.compare(photo.longitude, longitude) == 0 &&
                Objects.equals(name, photo.name) &&
                Objects.equals(url, photo.url) &&
                Objects.equals(description, photo.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, url, description, latitude, longitude);
    }
}
