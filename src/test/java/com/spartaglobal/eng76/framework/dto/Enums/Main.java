package com.spartaglobal.eng76.framework.dto.Enums;

public enum Main {
    TEMPERATURE("temp"),
    FEELS_LIKE_TEMPERATURE("feels_like"),
    MIN_TEMPERATURE("temp_min"),
    MAX_TEMPERATURE("temp_max"),
    PRESSURE("pressure"),
    HUMIDITY("humidity"),
    PRESSURE_SEA_LEVEL("sea_level"),
    PRESSURE_GROUND_LEVEL("grnd_level");

    private String field;

    Main(String field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return field;
    }
}
