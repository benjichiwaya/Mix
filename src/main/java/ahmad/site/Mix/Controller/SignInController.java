package ahmad.site.Mix.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ahmad.site.Mix.Model.User;

@Controller
public class SignInController {
    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public String SignIn () {
        return "signin";
    }
}
