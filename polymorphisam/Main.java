package polymorphisam;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date installDate = new Date(122,3,10);

        Transformer transformerTypeOne = new ShuntReactor(VoltageLevel.KVA_150,CoolingMethod.OIL_IMMERSED,installDate,500.0);

        System.out.println("Type:"+transformerTypeOne.getType());
        System.out.println("Age Factor:-"+transformerTypeOne.ageFactorInPercent()+"%");

        Transformer transformerTypeTwo = new IsolationTransformer(VoltageLevel.KVA_150,CoolingMethod.OIL_IMMERSED,installDate,200.0);
        System.out.println("Type:"+transformerTypeTwo.getType());
        System.out.println("Age Factor:-"+transformerTypeTwo.ageFactorInPercent()+"%");
    }
}
