package playersguide.day39;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.TemporalUnit;
import java.util.Random;

public class Player implements Movable {

    private int arrows = 5;
    private int currentRow;
    private int currentColumn;
    LocalTime startTime;
    LocalTime endTime;
    Duration duration;

    public void setStartTime() {
        this.startTime = LocalTime.now();
    }

    public void setEndTime() {
        this.endTime = LocalTime.now();
        setDuration();
    }

    public String getDuration() {
        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;
        long seconds = duration.getSeconds() % 60;

        return hours + " Hours, " + minutes + " Minutes, " + seconds + " Seconds.";
    }

    public void setDuration() {
        this.duration = Duration.between(startTime, endTime);
    }

    public void setInGrid(String sizeGrid) {
        Random random = new Random();
        if (sizeGrid.equals("small")) {
            currentRow = random.nextInt(4);
            currentColumn = random.nextInt(4);
        } else if (sizeGrid.equals("medium")) {
            currentRow = random.nextInt(6);
            currentColumn = random.nextInt(6);
        } else {
            currentRow = random.nextInt(8);
            currentColumn = random.nextInt(8);
        }
    }

    @Override
    public void move() {
        currentRow--;
        currentColumn += 2;
    }

    public int getCurrentColumn() {
        return currentColumn;
    }

    public void setCurrentColumn(int currentColumn) {
        this.currentColumn += currentColumn;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow += currentRow;
    }

    public String showAmountOffArrows() {
        return "Arrows: [" + this.arrows + "]\n";
    }


    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows += arrows;
    }

    public boolean areThereArrows() {
        return arrows >= 1;
    }
}
