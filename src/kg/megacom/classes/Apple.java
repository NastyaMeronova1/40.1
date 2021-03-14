package kg.megacom.classes;

import kg.megacom.enums.Categories;

public class Apple {
    private String appleName;
    private Categories categories;

    public Apple(String appleName, Categories categories) {
        this.appleName = appleName;
        this.categories = categories;
    }

    public String getAppleName() {
        return appleName;
    }

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "appleName='" + appleName + '\'' +
                ", categories=" + categories +
                '}';
    }
}
