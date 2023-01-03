package hello.springmvc.basic.reponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReponseViewController {

    @RequestMapping("/response-view-v1")
    public ModelAndView reponseViewV1() {
        ModelAndView mav = new ModelAndView("reponse/hello")
                .addObject("data","hello");
        return mav;
    }

    @RequestMapping("/response-view-v2")
    public String responseViewV2(Model model) {
        model.addAttribute("data", "hello!!");
        return "response/hello";
    }

    @RequestMapping("/response/hello")
    public void responseViewV3(Model model) {
        //컨트롤러경로 이름과 뷰의 논리적이름이 같으면 반환을 안해도 요청 url이름을 논리적 뷰의 이름으로 진행이된다 [비추천]  [v2를 추천]
        model.addAttribute("data", "hello!!");
    }
}
