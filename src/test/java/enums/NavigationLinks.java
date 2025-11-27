package enums;

public enum NavigationLinks {
    ADD_REMOVE_ELEMENT("Add/Remove Elements"),
    FRAMES("Frames");

    private final String navigationText;

    NavigationLinks(String navigationText){
        this.navigationText = navigationText;
    }

    public String navigationText(){
        return navigationText;
    }
}
