public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course vMat;
    Course fizik;
    Course vFizik;
    Course kimya;
    Course vKimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya, Course vMat, Course  vKimya, Course vFizik ) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.vKimya = vKimya;
        this.vMat = vMat;
        this.vFizik = vFizik;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya, int vMat, int vFizik, int vKimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if (vMat >= 0 && vMat <= 100) {
            this.vMat.note = vMat;
        }

        if (vFizik >= 0 && vFizik <= 100) {
            this.vFizik.note = vFizik;
        }

        if (vKimya >= 0 && vKimya <= 100) {
            this.vKimya.note = vKimya;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ((this.fizik.note * 0.8 + this.vFizik.note * 0.2) + (this.kimya.note * 0.8 + this.vKimya.note * 0.2) + (this.mat.note * 0.8 + this.vMat.note * 0.2)) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }
}