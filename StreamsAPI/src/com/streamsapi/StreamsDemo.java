package com.streamsapi;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo {

    public void show() {

        List<Movie> movies = List.of(
                new Movie("The Call", 15, Genre.THRILLER),
                new Movie("Tenet", 20, Genre.ACTION),
                new Movie("Predestination", 10, Genre.THRILLER),
                new Movie("Triangle", 12, Genre.THRILLER),
                new Movie("Interstellar", 25, Genre.SCIFRI)
        );

//        IntStream.range(1,5)
//                .forEach(System.out::println);

//////////////////////////////////////////////////////////////////////////////////////

//        var result = movies.stream()
//                .collect(Collectors.partitioningBy(
//                        Movie::getGenre, Collectors.mapping(
//                                Movie::getTitle, Collectors.joining(","))));
//                .collect(Collectors.groupingBy(
//                        Movie::getGenre, Collectors.mapping(
//                                Movie::getTitle, Collectors.joining(",")
//                        )));
                        //Movie::getGenre, Collectors.joining()));
                        //Movie::getGenre,
                        //Collectors.counting()));


//        System.out.println(result);

////////////////////////////////////////////////////////////////////////////
            // collect, Collectors.toMap, Collectors.toList, Collectors.toSet
            // Collectors.summarizingInt

//        var result = movies.stream()
//                .filter(m-> m.getLikes() > 10)
//                .map(Movie::getLikes)
//                .collect(Collectors.joining(","));
                //.collect(Collectors.summarizingInt(Movie::getLikes));
                //.collect(Collectors.toMap(Movie::getTitle, Function.identity()));
                //.collect(Collectors.toMap(Movie::getTitle, Movie::getLikes));
                //.collect(Collectors.toList());
                //.collect(Collectors.toSet());
//        System.out.println(result);


//////////////////////////////////////////////////////////////////////////
        //allMatch, findFirst, get, max, reduce

//       Optional<Integer> sum = Optional.ofNullable(movies.stream()
//                .map(m-> m.getLikes())
//                .reduce(0,Integer::sum));
//
//       //sum.get();
//        System.out.println(sum);

//        var result = movies.stream()
//                //.allMatch(m-> m.getLikes() > 20);
//                //.findFirst()
//                .max(Comparator.comparing(Movie::getLikes))
//                .get();
//
//        System.out.println(result.getTitle());

/////////////////////////////////////////////////////////////////////////////

        //peek
//        movies.stream()
//                .filter(m-> m.getLikes() > 10)
//                .peek(m-> System.out.println("Filtered: " + m.getTitle()))
//                .map(Movie::getTitle)
//                .peek(m-> System.out.println("Mapped: " + m))
//                .forEach(System.out::println);

////////////////////////////////////////////////////////////////////////////
        //flatMap

//        var stream = Stream.of(List.of(1,2,3), List.of(4,5,6));
//        stream.forEach(list -> System.out.println(list));
//
//        stream
//                .flatMap(list -> list.stream())
//                .forEach(n-> System.out.println(n));


////////////////////////////////////////////////////////////////////////////
                //Limit, distinct, skip, sorted, Comparator.comparing

//        movies.stream()
//                .map(Movie::getLikes)
//                //.forEach(like -> System.out.println(like));
//                .distinct()
//                .forEach(System.out::println);

//                .limit(2)
//                .skip(2)
//                .takeWhile(m-> m.getLikes() < 25)
//                .dropWhile(m-> m.getLikes() < 12)
//                .forEach(m-> System.out.println(m.getTitle()));
                //.sorted( (a, b) -> a.getTitle().compareTo(b.getTitle()) )
                //.sorted(Comparator.comparing(m-> m.getTitle()))
//                .sorted(Comparator.comparing(Movie::getTitle).reversed())
//                .forEach(m-> System.out.println(m.getTitle()));

/////////////////////////////////////////////////////////////////////////////

        //Predicate
//        Predicate<Movie> isPopular = m->m.getLikes() > 10;
//
//        movies.stream()
//                .filter(isPopular)
//                .forEach(m -> System.out.println(m.getTitle()));

///////////////////////////////////////////////////////////////////////////

                    //map
//                .map(movie -> movie.getTitle())
//                .forEach(name -> System.out.println(name));

////////////////////////////////////////////////////////////////////////////

        //Imperative programming
//    int count = 0;
//    for(var movie :movies)
//
//    {
//        if (movie.getLikes() > 10)
//            count++;
//    }

//////////////////////////////////////////////////////////////////////////

        //Declarative(Functional Programming)
//        var count2 = movies.stream()
//                .filter(movie -> movie.getLikes() > 10)
//                .count();

////////////////////////////////////////////////////////////////////////////

    }

}
