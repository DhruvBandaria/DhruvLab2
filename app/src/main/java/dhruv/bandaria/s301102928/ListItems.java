package dhruv.bandaria.s301102928;

public class ListItems {
    int image;
    int homeTitle,homeAddress,homePrice;

    public ListItems(int image, int homeTitle, int homeAddress, int homePrice) {
        this.image = image;
        this.homeTitle = homeTitle;
        this.homeAddress = homeAddress;
        this.homePrice = homePrice;
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
