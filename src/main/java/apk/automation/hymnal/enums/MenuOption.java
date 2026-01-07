package apk.automation.hymnal.enums;

public enum MenuOption {
    HIMNARIO("Himnario"),
    BUSCAR("Buscar"),
    FAVORITOS("Favoritos"),
    CONOCIDOS("Conocidos"),
    CLASIFICACION_HIMNOS("Clasificación de Himnos"),
    LISTAS_PERSONALIZADAS("Listas Personalizadas");

    private final String label;

    MenuOption(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
