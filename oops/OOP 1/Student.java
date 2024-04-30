public class Student {
    String name;
    int age;
     int marks;
//     Student(){
//         this.name = "Varun";
//         this.age= 22;
//         this.marks= 78;
//     }
     Student(String name, int age, int marks){
         this.name = name;
         this.age= age;
         this.marks= marks;
     }
     Student(){ // Calling constructor from another constructor
         this("Varun", 22,78);
     }
     Student(Student other){
         this.name = other.name;
         this.age= other.age;
         this.marks=other.marks;
     }
}
