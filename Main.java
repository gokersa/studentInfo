public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        Course vMat = new Course("Matematik", "MAT101", "MAT");
        Course vFizik = new Course("Fizik", "FZK101", "FZK");
        Course vKimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Göker", "90550000000", "MAT");
        Teacher t2 = new Teacher("Ayhan", "90550000001", "FZK");
        Teacher t3 = new Teacher("Gülay", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Çirko", 4, "110211", mat, fizik, kimya, vMat, vFizik, vKimya);
        s1.addBulkExamNote(50,20,40,100,80,95);
        s1.isPass();

        Student s2 = new Student("Max", 4, "110212", mat, fizik, kimya, vMat, vFizik, vKimya);
        s2.addBulkExamNote(100,50,40, 55,64,75);
        s2.isPass();

        Student s3 = new Student("Charles", 4, "110213", mat, fizik, kimya,vMat, vFizik, vKimya);
        s3.addBulkExamNote(50,20,40,55,45,75);
        s3.isPass();

    }
}