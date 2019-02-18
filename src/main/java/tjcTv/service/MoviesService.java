package tjcTv.service;

import java.util.List;

import tjcTv.model.MoviesVO;

public interface MoviesService {
	List<MoviesVO> selectMovies();
}