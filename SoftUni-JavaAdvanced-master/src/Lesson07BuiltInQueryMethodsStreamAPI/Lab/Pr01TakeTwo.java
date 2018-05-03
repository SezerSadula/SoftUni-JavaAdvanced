package Lesson07BuiltInQueryMethodsStreamAPI.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Pr01TakeTwo {

    public static void main(String[] args) throws IOException {
        Arrays.stream((new BufferedReader(new InputStreamReader(System.in)).readLine().split("\\s+")))
                .mapToInt(Integer::parseInt)
                .filter(x -> (x >= 10) && (x <= 20))
                .distinct()
                .limit(2)
                .forEach(n -> System.out.print(n + " "));
    }
}