public enum DeliverTypes {
    FLY("Авиадоставка стоит 500 рублей"),
    STEP("Пешая доставка  - стоит 100 рублей"),
    AUTO("Автодоставка стоит 200 рублей"),
    WATER("Доставка морем стоит 330 рублей");
    private String value;

    DeliverTypes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    }
