public class Body {
    private String type;
    private String colour;

    public Body(String type, String colour) {
        this.type = type;
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "type: " + type +
                ", colour: " + colour;
    }
}
