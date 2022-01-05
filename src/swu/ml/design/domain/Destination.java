package swu.ml.design.domain;

public class Destination {
    private int id;
    private String place;
    private String img;
    private String describe;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "id=" + id +
                ", place='" + place + '\'' +
                ", img='" + img + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
