package gr.aueb.cf.ch14;

import java.util.ArrayList;

public class ImmutablePointFlyWeightPattern {
    
    private static final ArrayList<ImmutablePoint> points = new ArrayList<>();

    private ImmutablePointFlyWeightPattern() {

    }

    public static ImmutablePoint getFlyWeightPoint (int x , int y) {
        ImmutablePoint point = null;


        int position = getPosition(x,y);

        if (position == -1) {
            point = new ImmutablePoint(x,y);
            points.add(point);
        }   else {
            point = points.get(position);
        }

        return point;
    }

    private static int getPosition (int x , int y){
        int positionToReturn = -1;

        for (int i = 0; i < points.size(); i++){
            if((points.get(i).getX() == x ) && (points.get(i).getY() == y)) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }
}
