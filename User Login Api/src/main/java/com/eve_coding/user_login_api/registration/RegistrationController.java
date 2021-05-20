package com.eve_coding.user_login_api.registration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(@RequestBody RegistrationRequest request){
        return registrationService.register(request);
    }

    @RequestMapping(value = "/confirm/{token}", method = RequestMethod.GET)
    public String confirm(@PathVariable String token) {
        return registrationService.confirmToken(token);
    }
}
