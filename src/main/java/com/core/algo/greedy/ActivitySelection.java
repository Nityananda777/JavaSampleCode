package com.core.algo.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Activity {
    public Activity(String name, int startTime, int finishTime) {
        this.name = name;
        this.startTime = startTime;
        this.finishTime = finishTime;
    }

    private String name;
    private int startTime;
    private int finishTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(int finishTime) {
        this.finishTime = finishTime;
    }
}

public class ActivitySelection {


    void selction(List<Activity> activityList) {
        Collections.sort(activityList, (o1, o2) -> o1.getFinishTime() - o2.getFinishTime());
        Activity previousActivity = activityList.get(0);
        for (int i = 1; i < activityList.size(); i++) {
            if (activityList.get(i).getStartTime() >= previousActivity.getFinishTime()) {
                previousActivity = activityList.get(i);
                System.out.println(" activity are ..:  Start Time" + activityList.get(i).getStartTime()+" End Time "+activityList.get(i).getFinishTime());
            }
        }
    }

    public static void main(String[] args) {
        List<Activity> activityList = new ArrayList<>();
        ActivitySelection activity = new ActivitySelection();
        activityList.add(new Activity("A1", 0, 6));
        activityList.add(new Activity("A2", 3, 4));
        activityList.add(new Activity("A3", 1, 2));
        activityList.add(new Activity("A4", 5, 8));
        activityList.add(new Activity("A5", 5, 7));
        activityList.add(new Activity("A6", 8, 9));
        activity.selction(activityList);
    }
}
