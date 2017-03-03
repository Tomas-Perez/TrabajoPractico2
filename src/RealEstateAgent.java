import java.util.ArrayList;

public class RealEstateAgent {
    ArrayList<RealEstate> RealEstates;

    public RealEstateAgent(){}

    public RealEstate getRealEstate(int code){
        for (RealEstate r:RealEstates) {
            if(r.getCode() == code)
                return r;
        }
        throw new RuntimeException();
    }
}
