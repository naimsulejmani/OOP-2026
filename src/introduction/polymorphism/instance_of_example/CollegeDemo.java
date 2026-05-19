package introduction.polymorphism.instance_of_example;

public class CollegeDemo {
    static void main() {
        College c1 = new CacttusEducation("1", "Cacttus Education",
                "123 Main St", 6);
        College c2 = new NaimisCollege("2", "Naimis College",
                "456 Elm St", "Computer Science");

        print(c1);
        print(c2);
    }

    public static void print(College college) {


//        if(college instanceof CacttusEducation) {
//            CacttusEducation cacttusEducation = (CacttusEducation) college;
//            System.out.println(cacttusEducation.getDuration());
//        }
        if (college instanceof Object obj) {
            System.out.println(obj.toString());
        }
        if (college instanceof CacttusEducation cacttusEducation) {
            System.out.println(cacttusEducation.getDuration());
        } else if (college instanceof NaimisCollege naimisCollege) {
            System.out.println(naimisCollege.getCourse());
        } else {
            System.out.println("Unknown College");
        }



        switch (college) {
            case CacttusEducation cacttusEducation -> System.out.println(cacttusEducation.getDuration());
            case NaimisCollege naimisCollege -> System.out.println(naimisCollege.getCourse());
            default -> System.out.println("Unknown College");
        }
    }


}
