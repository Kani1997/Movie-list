package co.code.movies.dataacess;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.coder.movies.model.Movie;


public interface MovieListRepsitory extends  JpaRepository<Movie,Long>{
	List<Movie>findMoviesByActor(String name);
	

}
