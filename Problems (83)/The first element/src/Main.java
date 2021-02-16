// do not remove imports

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.Function;

class ArrayUtils {


    public static <E> E getFirst(E[] t) {
        if (Objects.isNull(t[0])) {
            return null;
        } else {
            return t[0];
        }
    }
    // define getFirst method here
}