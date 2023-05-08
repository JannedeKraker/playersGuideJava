package playersguide.day21;

import java.util.Scanner;

import static playersguide.day21.ArrowHeadType.*;

public class Arrow {
    ArrowHeadType arrowHeadType;
    FeatherType featherType;
   private float arrowLength; // length between 60 and 100 cm long
    public ArrowHeadType getArrowHeadType() {
        return arrowHeadType;
    }

    public void setArrowHeadType(ArrowHeadType arrowHeadType) {
        this.arrowHeadType = arrowHeadType;
    }

    public FeatherType getFeatherType() {
        return featherType;
    }

    public void setFeatherType(FeatherType featherType) {
        this.featherType = featherType;
    }

    public float getArrowLength() {
        return arrowLength;
    }

    public float getCost(Arrow newArrow){
        float costPerLength = 0.05F;
        float arrowLengthCosts = newArrow.getArrowLength() * costPerLength;

        return arrowLengthCosts + arrowHeadType.getCost() + featherType.getCost();
    }

    public void setArrowLength(int arrowLength) {
        if ((arrowLength >= 60) && (arrowLength <= 100)){
        this.arrowLength = arrowLength;}
        else
        {System.out.println("the length of the shaft must be between 60 and 100 cm long. \nHow long do you want the shaft to be? ");
            Scanner intInput = new Scanner(System.in);
            setArrowLength(intInput.nextInt());
    }
    }


}
