package tjcTv.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import tjcTv.model.MoviesVO;
import tjcTv.service.MoviesService;

@Controller
@EnableAutoConfiguration
public class MainController {
	
	@Autowired
	MoviesService service;

	
	@RequestMapping(value = "/movies", method=RequestMethod.POST)
	public @ResponseBody List<MoviesVO> list(@RequestBody MoviesVO vo, HttpServletRequest request)  throws Exception{
		
		List<MoviesVO> movies = service.selectMovies();
		
		return movies;
	}
	
}
