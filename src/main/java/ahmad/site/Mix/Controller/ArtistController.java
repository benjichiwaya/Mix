package ahmad.site.Mix.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ArtistController {
    @RequestMapping(value = "/Artist")
    @ResponseBody
    public String Artist()
    {
        return "sample.html";
    }
}
