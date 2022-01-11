package latifyilmaz.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import latifyilmaz.hrms.business.abstracts.UserService;
import latifyilmaz.hrms.core.utilities.results.DataResult;
import latifyilmaz.hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/account")
@CrossOrigin
public class AccountController {
    private final UserService userService;

    @Autowired
    public AccountController(UserService userService){
        this.userService = userService;
    }
    @GetMapping("")
    public DataResult<List<User>> getAll() {
        return this.userService.getAll();
    }
}
