package tjcTv.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import tjcTv.model.MoviesVO;
import tjcTv.service.MoviesService;

@Controller
@EnableAutoConfiguration
public class MainController {
	
	@Autowired
	MoviesService service;

	
	@RequestMapping(value = "/movies")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@CrossOrigin(origins = {"http://localhost:8100"}, maxAge = 4800, allowCredentials = "false") 
	public @ResponseBody List<MoviesVO> list()  throws Exception{

		List<MoviesVO> movList = new ArrayList();
		
		List<MoviesVO> movies = service.selectMovies();
		for (MoviesVO mv : movies) {
			String content = mv.getContent();
			int st = content.indexOf("[embed]");
			int et = content.indexOf("[/embed]");
			if(st > 0 && et > 0) {
				String url = content.substring(content.indexOf("[embed]")+7, content.indexOf("[/embed]"));
				System.out.println("url = " + url);
				mv.setContent(url);
				movList.add(mv);
			}
		}
		return movList;
	}
	
	@RequestMapping(value="/")
	public String main() {
		return "index";
	}
}
