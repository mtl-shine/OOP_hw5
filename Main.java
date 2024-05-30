import controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        
        controller.createStudent("Shushkov", "Karim", "Afganovich", "01.02.1990");
        controller.createStudent("Maskin", "Rashid", "Rushanovich", "05.05.1998");
        controller.createStudent("Krotov", "Rinat", "Fahidovich", "06.08.1988");
        controller.createStudent("Alimov", "Farhad", "Raminovich", "15.03.2003");

        controller.createTeacher("Petrova", "Elena", "Nikolaevna", "28.02.1980");

        controller.createStudyGroup(controller.getTeacherById(1), controller.getStudentList());
        controller.printStudyGroup();


    }
}
