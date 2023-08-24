package com.mfcc.poke.data.model;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
public class Result {
    private int id;
    private String name;
    private double height;
    private double weight;
    private List<String> description;
    private List<String> type;
    private List<String> weaknesses;
    private List<String> basePoint;

    public static class ResultBuilder {

        @Override
        public String toString() {
            return "\n PokeDex \n" +
                    "------------------------------------------------------------------------------------"+
                    "\nCode: " + id +
                    "\n1. Name: " + name +
                    "\n2. Height: " + height +
                    "\n3. Weight: " + weight +
                    "\n4. Description: " + description +
                    "\n5. Type: " + type +
                    "\n6. Weaknesses: " + weaknesses +
                    "\n7. Base Point: " + basePoint+ "\n"+
                    "------------------------------------------------------------------------------------";
        }
    }

    @Setter
    @Getter
    public static class BasePoint {
        private String name;
        private String description;

        @Override
        public String toString() {
            return String.format("Name: %s Description: %s", name, description);
        }
    }
}
