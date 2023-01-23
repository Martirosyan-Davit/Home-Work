import java.util.List;

public class Restaurant {
    private String name;
    private String location;
    private String menu;
    private String reviews;

    public Restaurant(String name, String location) {
        this.name = name;
        this.location = location;
    }

    private List<String> listMenu;
    private List<String> listReviews;

    public void addMenuItem(String item) {
        listMenu.add(item);
    }
    public void addReview(String review) {
        listReviews.add(review);
    }
    public void displayReviews() {
        for(int i = 0;i < listReviews.size(); ++i){
            System.out.println(listReviews.get(i));
        } 
    } 
    
}
