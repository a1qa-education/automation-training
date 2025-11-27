package enums;

public enum NavigationLinks {
    ADD_REMOVE_ELEMENT("ABC"),
    NESTED_FRAMES("DEF");

    private String navigationText;

    NavigationLinks(String navigationText){
        this.navigationText = navigationText;
    }

    public String navigationText(){
        return navigationText;
    }
}
