import java.util.List;

public class Album {
    private String name;
    private List<Photo> photos;

    public Album(String name, List<Photo> photos) {
        this.name = name;
        this.photos = photos;
    }

    public void addPhoto(Photo photo) {
        photos.add(photo);
    }
}
