package tjcTv.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public @ResponseBody List<MoviesVO> movieList()  throws Exception{
		
		List<MoviesVO> movList = service.selectMovies();
		return movList;
	}

	@RequestMapping(value = "/login")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@CrossOrigin(origins = {"http://localhost:8100"}, maxAge = 4800, allowCredentials = "false") 
	public @ResponseBody Map login()  throws Exception{
		
		Map map = new HashMap();
		
		map.put("status", "success");
		map.put("user", "");
		
		return map;
	}

	
}
