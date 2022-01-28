package changsoft.hrms.business.abstracts;

import org.springframework.stereotype.Service;

import changsoft.hrms.core.utilities.results.DataResult;
import changsoft.hrms.core.utilities.results.Result;
import changsoft.hrms.dataAccess.abstracts.UserDao;
import changsoft.hrms.entities.concretes.User;
import changsoft.hrms.entities.dtos.user.UserLoginDto;
import changsoft.hrms.entities.dtos.user.UserUpdatePasswordDto;

import java.util.List;

public interface UserService {
    //Get
    DataResult<List<User>> getAll();
    DataResult<User> getById(int id);
    DataResult<User> getByEmail(String email);
    DataResult<?> getUserTypeByEmail(String email);
    DataResult<User> getByEmailAndPassword(String email, String password);

    //Post
    Result save(User user);
    Result updateVerifiedById(boolean verified, int id);
    Result updateVerifiedByEmail(boolean verified, String email);
    Result updateEmail(int id, String email);
    Result updatePassword(UserUpdatePasswordDto dto);
    DataResult<?> login(UserLoginDto user);

    //Delete
    Result delete(User user);
    Result deleteById(int id);
}