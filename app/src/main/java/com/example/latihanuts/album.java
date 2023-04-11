package com.example.latihanuts;

public class album {
    String albumName, isBookmark;
    Integer id;

    public album(String albumName, String isBookmark, Integer id) {
        this.albumName = albumName;
        this.isBookmark = isBookmark;
        this.id = id;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getIsBookmark() {
        return isBookmark;
    }

    public void setIsBookmark(String isBookmark) {
        this.isBookmark = isBookmark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
