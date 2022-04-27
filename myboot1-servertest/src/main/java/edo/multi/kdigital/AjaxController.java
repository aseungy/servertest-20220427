package edo.multi.kdigital;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //restcontroller 쓰면 responsebody가 붙어있는것 으로 간주
public class AjaxController {

@RequestMapping("/helloajax")
public MemberDTO test() {
	return new MemberDTO("ID", "PASSWORD");//json자동변환(스프링부트내장)
}
}
