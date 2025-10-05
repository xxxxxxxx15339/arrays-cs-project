package samplearrays;

public class CourseNumbersArray {
    public static void main(String[] args) {
        int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};
        int newCourse = 2000;

        int[] updatedCourses = addCourse(registeredCourses, newCourse);

        int searchCourse = 2140;
        boolean exists = containsCourse(updatedCourses, searchCourse);
        if (exists) {
            System.out.println("The course number " + searchCourse + " is found");
        } else {
            System.out.println("The course number " + searchCourse + " is not found");
        }
    }

    public static int[] addCourse(int [] courses, int newCourse) {
        int[] updated = new int[courses.length + 1];
        for (int i = 0; i < courses.length; i++) {
            updated[i] = courses[i];
        }
        updated[courses.length] = newCourse;
        return updated;
    }

    public static boolean containsCourse(int [] courses, int courseNumber) {
        for (int course : courses) {
            if (course == courseNumber) {
                return true;
            }
        }
        return false;
    }

}
