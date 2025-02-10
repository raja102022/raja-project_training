package polymorphisam;

import java.util.Date;

//Writing enums for particular given values for VoltageLevel and CoolingMethod
enum VoltageLevel{
    KVA_10, KVA_150
}

enum CoolingMethod{
   AIR_COOLED,OIL_IMMERSED
}

public class Transformer extends Asset {

    VoltageLevel voltageLevel;
    CoolingMethod coolingMethod;


    Transformer(VoltageLevel voltageLevel, CoolingMethod coolingMethod, Date installDate){
        this.voltageLevel = voltageLevel;
        this.coolingMethod = coolingMethod;
        this.installDate = installDate;
    }

    @Override
    double ageFactorInPercent() {
       return 0;
    }

    @Override
    String getType() {
        return null;
    }

    public double getAgeInYears(){
        long currentTime = System.currentTimeMillis();
        long installTime = installDate.getTime();
        long ageInMillies = currentTime-installTime;
        return  ageInMillies / (1000.0*60*60*24*365);
    }




}
