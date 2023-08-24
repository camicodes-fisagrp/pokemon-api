package com.mfcc.poke.data.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Pokemon {
    private int id;
    private String name;
    private double height;
    private double weight;
    private List<Descriptions> descriptions;
    private List<Type> type;
    private List<Weaknesses> weaknesses;
    private List<BasePoint> basePoint;

    public void getName(String name) {
        this.name = name;
    }
    @Setter
    @Getter
    public static class Levels {
        private int id;
        private String level;
    }

    @Builder
    @Setter
    @Getter
    public static class Descriptions {
        private String language;
        private String description;
    }

    @Setter
    @Getter
    public static class Type {
        private int id;
        private Type type;
    }

    @Setter
    @Getter
    public static class Weaknesses {
        private int id;
        private String weaknesses;
    }

    @Setter
    @Getter
    public static class BasePoint {
        private int id;
        private String basePoint;
    }
}
