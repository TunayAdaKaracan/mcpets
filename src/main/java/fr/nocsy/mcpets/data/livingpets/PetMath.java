package fr.nocsy.mcpets.data.livingpets;

import lombok.Getter;

import java.util.Arrays;

public enum PetMath {

    MULTIPLIER("multiply"),
    ADDITION("add");

    @Getter
    private final String operator;

    PetMath(String operator)
    {
        this.operator = operator;
    }

    /**
     * Get the calculated value using the given operator
     * @param first
     * @param second
     * @return
     */
    public double get(double first, double second)
    {
        switch (operator)
        {
            case "x":
                return first * second;
            case "+":
                return first + second;
        }
        return 0;
    }

    /**
     * Get the pet math corresponding to the operator
     * @param operator
     * @return
     */
    public static PetMath get(String operator)
    {
        return Arrays.stream(PetMath.values()).filter(math -> math.getOperator().equalsIgnoreCase(operator)).findFirst().orElse(PetMath.ADDITION);
    }

}
