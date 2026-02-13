import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;
class ConvertPrimitivetoStreams {
    public static void main(String[] args) {
        int arr[] = {1,2,5};
        //convert Arrays to stream
        IntStream intStream = Arrays.stream(arr);
        intStream.forEach(a-> System.out.println(a));
       
        //Convert Object to Stream
         Integer[] arrInt = {1,4,6};
        Stream<Integer> objStream = Stream.of(arrInt);
        objStream.forEach((a)->System.out.println(a));

        //Convert collection to Stream
        List<Integer> list =Arrays.asList(1,3,4);
         list.stream().forEach((a)-> System.out.println(a));




    }
}