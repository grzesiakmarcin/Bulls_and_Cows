class Counter {
    public static int count2DShapes(Shape[] shapes) {
        int result =0;

        for (Shape element: shapes) {
            if (element instanceof Shape2D){
                if (element.getClass()!=Shape2D.class){
                    result++;
                }
            }
        }

        return result;
    }
}

// Don't change the code below

class Shape {
}

class Shape2D extends Shape {
}

class Shape3D extends Shape {
}


class Circle extends Shape2D {
}

class Shape2DSub1 extends Shape2D {
}

class Shape2DSub2 extends Shape2D {
}


class Cube extends Shape3D {
}

class Shape3DSub1 extends Shape3D {
}

class Shape3DSub2 extends Shape3D {
}