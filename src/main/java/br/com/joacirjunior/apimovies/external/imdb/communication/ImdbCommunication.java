package br.com.joacirjunior.apimovies.external.imdb.communication;

import br.com.joacirjunior.apimovies.exception.ApiMoviesException;
import br.com.joacirjunior.apimovies.external.imdb.dto.ImdbResponse;

import java.util.Optional;

public interface ImdbCommunication {

    Optional<ImdbResponse> searchMovie(String title) throws ApiMoviesException;

}
