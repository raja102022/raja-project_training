package polymorphisam;

import java.util.Date;

public class ShuntReactor extends Transformer{
      private double reactivePowerCompensation;

    ShuntReactor(VoltageLevel voltageLevel, CoolingMethod coolingMethod, Date installDate,double reactivePowerCompensation) {
        super(voltageLevel, coolingMethod, installDate);
        this.reactivePowerCompensation = reactivePowerCompensation;
    }

    double ageFactorInPercent(){
        return 1.0-(getAgeInYears()/10);
    }

    String getType(){
        return "Transformer.shuntReactor";
    }

}
