package tjcTv.service.impl;

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
		return movies;
	}
}
