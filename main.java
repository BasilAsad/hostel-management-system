public class main {
    public static void main(String[] args) {
        HostelManager manager = new HostelManager();

        
        manager.addRoom(new Room(101, "Single"));
        manager.addRoom(new Room(102, "Shared"));

        
        manager.addStudent(new Student(1, "BASIL ASAD", 18));
        manager.addStudent(new Student(2, "Abdullah khalid", 19));
        manager.addStudent(new Student(2, "ABDUL BASIT", 18));

      
        manager.assignRoom(1, 101);

        System.out.println("\n--- All Students ---");
        manager.showAllStudents();

        System.out.println("\n--- All Rooms ---");
        manager.showAllRooms();
    }
}
