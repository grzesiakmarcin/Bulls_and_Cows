class Publication {

    private String title;

    public Publication(String title) {

        this.title = title;
    }

    public final String getInfo() {
     return getType()+getDetails();
    }

    public String getType() {
        return title;
    }

    public String getDetails() {
        return "";
    }

}

class Newspaper extends Publication {

    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;

    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public String getDetails() {
        return super.getDetails();
    }
}

class Article extends Publication {

    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public String getDetails() {
        return super.getDetails();
    }
}

class Announcement extends Publication {

    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }


    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public String getDetails() {
        return super.getDetails();
    }
}