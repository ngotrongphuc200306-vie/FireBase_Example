package vn.edu.ueh.thanhdnh.firebase_example;

import com.google.firebase.firestore.Exclude;

public class Article {
    @Exclude
    private String id;
    private String title;
    private String shortDesc;

    public Article() {
    }

    public Article(String title, String shortDesc) {
        this.title = title;
        this.shortDesc = shortDesc;
    }

    @Exclude
    public String getId() {
        return id;
    }

    @Exclude
    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", shortDesc='" + shortDesc + '\'' +
                '}';
    }
}