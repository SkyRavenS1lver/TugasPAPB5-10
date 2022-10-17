package com.example.myapplication;

public class Games {
    String name;
    String desc;
    int pic;
    String category;

    public Games(
            String name,
            String desc,
            int pic,
            String category
    ) {
        this.name =  name;
        this.desc = desc;
        this.pic = pic;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
