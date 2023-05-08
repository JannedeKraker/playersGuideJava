package playersguide.day21en22;

import java.util.Scanner;



public class Arrow {
    private ArrowHeadType arrowHeadType;
    private FeatherType featherType;
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

   public void createEliteArrow() {
        Arrow eliteArrow = new Arrow();

        int lengthArrow= 95;
        arrowHeadType = arrowHeadType.STEEL;
        featherType = FeatherType.PLASTIC;

        eliteArrow.setArrowHeadType(arrowHeadType);
        eliteArrow.setArrowLength(lengthArrow);
        eliteArrow.setFeatherType(featherType);
       System.out.println("The arrow head is from: " + eliteArrow.getArrowHeadType()+ "\n"+ "The length of the shaft is: " + eliteArrow.getArrowLength()+" cm \n"+ "The feather is from: " + eliteArrow.getFeatherType());
   }

    public void createBeginnerArrow() {
        Arrow beginnerArrow = new Arrow();

        int lengthArrow= 75;
        arrowHeadType = arrowHeadType.WOOD;
        featherType = FeatherType.GOOSE;

        beginnerArrow.setArrowHeadType(arrowHeadType);
        beginnerArrow.setArrowLength(lengthArrow);
        beginnerArrow.setFeatherType(featherType);
        System.out.println("The arrow head is from: " + beginnerArrow.getArrowHeadType()+ "\n"+ "The length of the shaft is: " + beginnerArrow.getArrowLength()+" cm \n"+ "The feather is from: " + beginnerArrow.getFeatherType());
    }

    public void createMarksmanArrow() {
        Arrow marksmanArrow = new Arrow();

        int lengthArrow= 65;
        arrowHeadType = arrowHeadType.STEEL;
        featherType = FeatherType.GOOSE;

        marksmanArrow.setArrowHeadType(arrowHeadType);
        marksmanArrow.setArrowLength(lengthArrow);
        marksmanArrow.setFeatherType(featherType);
        System.out.println("The arrow head is from: " + marksmanArrow.getArrowHeadType()+ "\n"+ "The length of the shaft is: " + marksmanArrow.getArrowLength()+" cm \n"+ "The feather is from: " + marksmanArrow.getFeatherType());
    }
}
