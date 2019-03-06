package tjcTv.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tjcTv.dao.MoviesDao;
import tjcTv.model.MoviesVO;
import tjcTv.service.MoviesService;

@Service
public class MoviesServiceImpl implements MoviesService {
	
	@Autowired
	private MoviesDao dao;

	@Override
	public List<MoviesVO> selectMovies() {
		List<MoviesVO> movies = dao.getMovies();
		
		List<MoviesVO> movList = new ArrayList();
		
		for (MoviesVO mv : movies) {
			String content = mv.getContent();
			int st = content.indexOf("[embed]");
			int et = content.indexOf("[/embed]");
			if(st > 0 && et > 0) {
				String url = content.substring(content.indexOf("[embed]")+7, content.indexOf("[/embed]"));
				System.out.println("url = " + url);
				mv.setUrl(url);
				movList.add(mv);
				if(url.indexOf(".be/") > 0)
					mv.setYoutube_id(url.substring(url.indexOf(".be/")+4));
			}
		}
		return movList;
	}
}
