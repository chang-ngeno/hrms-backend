package changsoft.hrms.core.adapters.concretes;

//import changsoft.hrms.services.MernisService.MAMKPSPublicSoap;
import org.springframework.stereotype.Component;

import changsoft.hrms.core.adapters.abstracts.UserCheckService;

import java.util.Date;

@Component
public class MernisServiceAdapter implements UserCheckService {
    public boolean isRealPerson(String identityNo, String firstName, String lastName, int birthYear) {
        //MAMKPSPublicSoap soapClient = new MAMKPSPublicSoap();
        boolean checkResult = false;
        try{
           //checkResult = soapClient.TCKimlikNoDogrula(Long.parseLong(identityNo), firstName, lastName, birthYear);
            checkResult = true;
        }
        catch (Exception e){
            System.out.println("Mernis Error");
        }
        return checkResult;
    }
}
