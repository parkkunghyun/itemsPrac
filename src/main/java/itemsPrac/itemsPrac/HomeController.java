package itemsPrac.itemsPrac;

import itemsPrac.SessionConst;
import itemsPrac.itemsPrac.domain.member.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
@Slf4j
public class HomeController {
    // session 검사하고 있으면 loginHome / 아니면 home으로 가게!
    @GetMapping("/")
    public String home(@SessionAttribute(name = SessionConst.SESSION_MEMBER, required = false) Member member, Model model) {
        if(member == null) {
            return "home";
        }
        model.addAttribute("member", member);
        return "loginHome";
    }
}
