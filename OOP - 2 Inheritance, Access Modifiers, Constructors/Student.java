public class Student {
String name;
int age;
int rollNo;
Exam exam;
Student(){
    this.name = "Sid";
    this.age = 18;
    this.rollNo = 5;
}
Student (Student other){
    this.name = other.name;
    this.age = other.age;
    this.rollNo = other.rollNo;
    this.exam = new Exam();
    this.exam.exam_id = other.exam.exam_id;
}

}


