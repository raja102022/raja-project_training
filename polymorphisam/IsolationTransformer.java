package polymorphisam;

import java.util.Date;

public class IsolationTransformer extends Transformer {
   private double clampingVoltage;

    IsolationTransformer(VoltageLevel voltageLevel, CoolingMethod coolingMethod, Date installDate,double clampingVoltage) {
        super(voltageLevel, coolingMethod, installDate);
        this.clampingVoltage = clampingVoltage;
    }

    double ageFactorInPercent(){
        return 1.0-(getAgeInYears()/20);
    }

    String getType(){
        return "Transformer.isolationTransformer";
    }
}
