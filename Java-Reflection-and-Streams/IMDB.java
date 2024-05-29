import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;

import org.checkerframework.checker.units.qual.s;

public class IMDB {
	public static final ToLongFunction<Stream<String>> countMovies = s -> s.map(t -> t.split("\t"))
			.map(array -> array[0] + array[1]).distinct().count();

	public static final ToLongFunction<Stream<String>> countDirectors = s -> s.map(t -> t.split("\t"))
			.map(array -> array).filter(i -> i[2].startsWith("director")).count();

	public static final Function<Stream<String>, Map<Integer, Long>> countMoviesPerYear = null;

	public static final BiFunction<String, Stream<String>, Long> countMoviesByActor = (i, s) -> s
			.map(t -> t.split("\t")).map(array -> array[1] + array[3]).filter(x-> x.contains(i)).distinct().count();

	public static final BiFunction<Integer, Stream<String>, Set<String>> getMoviesInYear = 
			(i,s) -> 
	s.map(t-> t.split("\t")).filter(p-> p[0].contains(String.valueOf(i))).distinct().map(p-> p[1]).
	collect(Collectors.toSet());
	
	public static final BiFunction<Integer, String, Function<Stream<String>, Set<String>>> getDirectorsInMovie = null;

	private IMDB() {
		
//		/(i,s) -> 
//		s.map(t-> t.split("\t")).filter(p-> p[0].contains(String.valueOf(i))).distinct().map(p-> p[1]).
//		collect(Collectors.toSet());
	}
}