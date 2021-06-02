package com.termproject.mybookshelf;

import java.util.List;



public class DouBanJson {



    private String id;
    private String isbn10;
    private String isbn13;
    private String title;
    private String subtitle;
    private ImagesBean images;
    private String publisher;
    private String pubdate;
    private java.util.List<String> author;
    private java.util.List<String> translator;

    public static class ImagesBean {


        private String large;
        private String medium;

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }
    }

    public List<String> getAuthor() {
        return author;
    }

    public String getId() {
        return id;
    }

    public ImagesBean getImages() {
        return images;
    }

    public String getIsbn10() {
        return isbn10;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public String getPubdate() {
        return pubdate;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getTranslator() {
        return translator;
    }
}

