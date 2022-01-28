package changsoft.hrms.core.utilities.helpers;

import changsoft.hrms.core.utilities.results.Result;
import changsoft.hrms.entities.concretes.User;

public interface EmailService {
    Result send(User user);
    Result check(String email);
    Result checkWithDomain(String email, String website);
}
