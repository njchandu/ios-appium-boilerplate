package data;

import org.testng.annotations.DataProvider;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by chandanjavaregowda on 10/12/16.
 */
public class TestData {
    @DataProvider(name = "roundTripData")
    public Iterator<Object[]> roundTripBookingDataProvider() throws ParseException {
        Collection<Object[]> dp = new ArrayList<Object[]>() {
            {
                add(new Object[]{
                        "Bangalore, IN - Kempegowda International Airport (BLR)",
                        "Goa, IN - Dabolim Airport (GOI)",
                        "nj.chandu@gmail.com"
                });
            }
        };

        return dp.iterator();
    }
}
