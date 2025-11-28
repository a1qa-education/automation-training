package enums;

public enum NavigationLinks {
    ADD_REMOVE_ELEMENT("Add/Remove Elements"),
    FRAMES("Frames"),
    FORM_AUTHENTICATION("Form Authentication");

    private final String navigationText;

    NavigationLinks(String navigationText){
        this.navigationText = navigationText;
    }

    public String navigationText(){
        return navigationText;
    }

    public static NavigationLinks fromText(String text) {
        for (NavigationLinks link : NavigationLinks.values()) {
            if (link.navigationText.equalsIgnoreCase(text)) {
                return link;
            }
        }
        throw new IllegalArgumentException("Неизвестная ссылка: " + text);
    }
}
