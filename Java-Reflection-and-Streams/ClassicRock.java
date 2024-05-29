
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// see: https://fivethirtyeight.com/features/why-classic-rock-isnt-what-it-used-to-be/

public class ClassicRock {
    public static final Function<Stream<String>,Map<Integer,Long>>         countSongsPerYear               = 
    		s-> s.skip(1).map(t->t.split("\t")).filter(p-> !p[2].equals("")).map(ar-> Integer.valueOf(ar[2]))
    		.collect(Collectors.groupingBy(array->array , Collectors.counting()));
    		
    		
    		
    public static final Function<Stream<String>,List<String>>              topTwentySongs                  = null;
    public static final Function<Stream<String>,Map<String,Long>>          topTwentyFiveBandsBySongs       = null;
    public static final ToLongFunction<Stream<String>>                     totalPlayCount                  = null;
    public static final Function<Stream<String>,Map<String,Long>>          topTwentyFiveBandsByPlayCount   = null;
    public static final BiFunction<Stream<String>,Long,Map<String,Double>> topTwentyFiveBandsByPlayPercent = null;

    private ClassicRock() {
    }
}