package dhruv.bandaria.s301102928;

public class ListItems {
    int id;
    int image;
    int homeTitle,homeAddress,homePrice;
    boolean isChecked;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public ListItems(int image, int homeTitle, int homeAddress, int homePrice,int id) {
        this.image = image;
        this.homeTitle = homeTitle;
        this.homeAddress = homeAddress;
        this.homePrice = homePrice;
        this.isChecked=false;
        this.id=id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getHomeTitle() {
        return homeTitle;
    }

    public void setHomeTitle(int homeTitle) {
        this.homeTitle = homeTitle;
    }

    public int getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(int homeAddress) {
        this.homeAddress = homeAddress;
    }

    public int getHomePrice() {
        return homePrice;
    }

    public void setHomePrice(int homePrice) {
        this.homePrice = homePrice;
    }
}
