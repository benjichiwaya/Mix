package ahmad.site.Mix.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ArtistController {
    @RequestMapping(value ="/Artist",method = RequestMethod.GET)
    public String Artist()
    {
        return "sample";
    }
}
