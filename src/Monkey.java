public class Monkey extends Animal{
    private String favoriteFood;
    public Monkey(int weight, String name, String favoriteFood) {
        super(weight, name);
        this.favoriteFood=favoriteFood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
}
