package polymorphisam;

import java.util.Date;

public abstract class Asset {

    Date installDate;
    abstract double ageFactorInPercent();
    abstract String getType();


}


