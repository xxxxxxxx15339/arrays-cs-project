package samplearrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class ManageStudent {

    // 2) Find the Oldest Student
    public static Student findOldest(Student[] students) {
        if (students == null || students.length == 0) return null;
        Student oldest = students[0];
        for (Student student : students) {
            if (student != null && student.getAge() > oldest.getAge()) {
                oldest = student;
            }
        }
        return oldest;
    }

    // 3) Count Adult Students (age >= 18)
    public static int countAdults(Student[] students) {
        int count = 0;
        for (Student student : students) {
            if (student != null && student.isAdult()) count++;
        }
        return count;
    }

    // 4) Average Grade (returns NaN if no students or grades)
    public static double averageGrade(Student[] students) {
        double sum = 0;
        double count = 0;
        if (students == null || students.length == 0) return Double.NaN;
        for (Student student : students) {
            sum += student.getGrade();
            count++;
        }
        return count == 0 ? Double.NaN : sum / count;
    }

    // 5) Search by Name (ignore case)
    public static Student findStudentByName(Student[] students, String name) {
        for (Student s : students) {
            if (s != null && s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    // 6) Sort Students by Grade (descending)
    public static void sortByGradeDesc(Student[] students) {
        Arrays.sort(students, Comparator.comparingInt(Student::getGrade).reversed());
    }

    // 7) Print High Achievers (grade >= 15)
    public static void printHighAchievers(Student[] students) {
        for (Student s : students) {
            if (s != null && s.getGrade() >= 15) {
                System.out.println(s);
            }
        }
    }

    // 8) Update Student Grade by id
    public static boolean updateGrade(Student[] students, int id, int newGrade) {
        for (Student s : students) {
            if (s != null && s.getId() == id) {
                s.setGrade(newGrade);
                return true;
            }
        }
        return false;
    }

    // 9) Find Duplicate Names
    public static boolean hasDuplicateNames(Student[] students) {
        HashSet<String> seen = new HashSet<>();
        for (Student s : students) {
            if (s != null) {
                String name = s.getName().toLowerCase();
                if (seen.contains(name)) {
                    return true;
                }
                seen.add(name);
            }
        }
        return false;
    }

    // 10) Expandable Array: return a new array with one more slot and append student
    public static Student[] appendStudent(Student[] students, Student newStudent) {
        Student[] newArr = Arrays.copyOf(students, students.length + 1);
        newArr[newArr.length - 1] = newStudent;
        return newArr;
    }


    // 11) Print names of all students in a 2D array (general version)
    public static void printSchool(Student[][] school) {
        System.out.println("\n== Q11: School Students ==");
        for (int i = 0; i < school.length; i++) {
            System.out.println("Class " + (i + 1) + ":");
            for (int j = 0; j < school[i].length; j++) {
                if (school[i][j] != null) {
                    System.out.println(" - " + school[i][j].getName());
                }
            }
        }
    }



    // 1) Create an Array of Students + demos for all tasks
    public static void main(String[] args) {
        // Create & initialize array of 5 students
        Student[] arr = {
                new Student(1, "Ali"),
                new Student(2, "Basma", 19),
                new Student(3, "Omar", 22),
                new Student(4, "Dina", 20, 16),
                new Student(5, "Ali", 21, 10)
        };

        // Print all
        System.out.println("== All Students ==");
        for (Student s : arr) System.out.println(s);
        System.out.println("Total created: " + Student.getNumStudent());

        // 2) Oldest
        System.out.println("\nOldest: " + findOldest(arr));

        // 3) Count adults
        System.out.println("Adults count: " + countAdults(arr));

        // 4) Average grade
        System.out.println("Average grade: " + averageGrade(arr));

        // 5) Find by name
        System.out.println("Search Dina: " + findStudentByName(arr, "dina"));

        // 6) Sort by grade desc
        sortByGradeDesc(arr);
        System.out.println("\n== Sorted by grade (desc) ==");
        for (Student s : arr) System.out.println(s);

        // 7) High achievers >= 15
        System.out.println("\nHigh achievers:");
        printHighAchievers(arr);

        // 8) Update grade by id
        boolean updated = updateGrade(arr, 4, 19);
        System.out.println("\nUpdated id=4? " + updated);
        System.out.println(findStudentByName(arr, "Dina"));

        // 9) Duplicate names
        System.out.println("\nHas duplicate names? " + hasDuplicateNames(arr));

        // 10) Append new student
        arr = appendStudent(arr, new Student(6, "Sara", 23, 18));
        System.out.println("\nAfter appending:");
        for (Student s : arr) System.out.println(s);

        // 11) 2D array with 2 classes and 3 students per class
        Student[][] school = {
                {
                        new Student(101, "Adam", 18, 12),
                        new Student(102, "Basma", 19, 15),
                        new Student(103, "Karim", 20, 14)
                },
                {
                        new Student(201, "Layla", 21, 16),
                        new Student(202, "Omar", 22, 13),
                        new Student(203, "Dina", 20, 17)
                }
        };

        printSchool(school);

    }
}
