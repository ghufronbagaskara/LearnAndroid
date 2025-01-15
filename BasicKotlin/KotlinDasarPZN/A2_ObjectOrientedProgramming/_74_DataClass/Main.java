package A2_ObjectOrientedProgramming._74_DataClass;

class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;

    public Student() {
        this.name = "";
        this.address = "";
        this.age = 0;
    }

    public Student(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public Student(String name, String address, int age, double mathGrade, double englishGrade, double scienceGrade) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.scienceGrade = scienceGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    public void setEnglish(int englishGrade) {
        this.englishGrade = englishGrade;
    }

    public void setScience(int scienceGrade) {
        this.scienceGrade = scienceGrade;
    }

    private double getAverage() {
        double result = 0;
        result = (this.mathGrade + this.scienceGrade + this.englishGrade) / 3;
        return result;
    }

    public boolean statusAkhir(){
        if (getAverage() >= 61){
            return true;
        }else return false;
    }

    public void displayMessage() {
        System.out.println("Siswa dengan nama : " + this.name);
        System.out.println("Beralamat di : " + this.address);
        System.out.println("Berumur : " + this.age);
        System.out.printf("Memiliki nilai rata-rata : %.2f\n", getAverage());
        System.out.println("Tidak perlu remedi : " + statusAkhir());
    }
}

public class Main {
    public static void main(String[] args) {
        Student anna = new Student("Anna", "Malang", 20);
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMathGrade(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.displayMessage();

        //menggunakan constructor lain
        System.out.println("===================");
        Student chris = new Student("Chris", "Kediri", 21);
        chris.setMathGrade(70);
        chris.setScience(60);
        chris.setEnglish(90);
        chris.displayMessage();

        //siswa dengan nama anna dirubah informasi alamat danumurnya melalui constructor
        System.out.println("===================");
        anna = new Student("anna", "Batu", 18);
        anna.displayMessage();

        //siswa denagan nama chris dirubah informasi alamat danumurnya melalui method
        System.out.println("===================");
        chris.setAddress("Surabaya");
        chris.setAge(22);
        chris.displayMessage();



    }
}
