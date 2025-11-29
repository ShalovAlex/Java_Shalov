package tests8_4;

class StartSauce {
    public static void main(String[] args) {
        Sauce sauce1 = new Sauce("Кетчуп", Sauce.SpicyLevel.NOT_SPICY);
        Sauce sauce2 = new Sauce("Мистер Рико", Sauce.SpicyLevel.SPICY);
        Sauce sauce3 = new Sauce("Табаско", Sauce.SpicyLevel.VERY_SPICY);

        System.out.println(sauce1);
        System.out.println(sauce2);
        System.out.println(sauce3);
    }
}
public class Sauce {
    private final String name;
    private final SpicyLevel spiciness;

    public enum SpicyLevel {
        NOT_SPICY("не острый"),
        SPICY("острый"),
        VERY_SPICY("очень острый");

        private final String description;
        SpicyLevel(String description) {
            this.description = description;
        }
        public String getDescription() {
            return description;
        }
    }

    public Sauce(String name, SpicyLevel spiciness) {
        this.name = name;
        this.spiciness = spiciness;
    }

    @Override
    public String toString() {
        return String.format("Соус %s: %s", name, spiciness.getDescription());
    }

    public String getName() {
        return name;
    }
    public SpicyLevel getSpiciness() {
        return spiciness;
    }
}