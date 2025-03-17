package util;

import java.util.List;

public class DecadeUtil {

    public static boolean outsideTimeframe(int[] timeframeRef, int[] timeframeComp) {
        if (timeframeRef[0] >= timeframeComp[1]) {return true;}
        if (timeframeRef[1] <= timeframeComp[0]) {return true;}
        return false;
    }
}
