package changsoft.hrms.core.adapters.concretes;

import org.springframework.stereotype.Component;

import changsoft.hrms.core.adapters.abstracts.UserCheckService;

import java.util.Date;

@Component
public class FakeMernisServiceAdapter implements UserCheckService {
    public boolean isRealPerson(String identityNo, String firstName, String lastName, int birthYear) {
        return true;
    }
}