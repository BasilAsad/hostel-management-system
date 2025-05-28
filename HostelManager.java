import java.util.ArrayList;
import java.util.List;
class HostelManager {
    private List<Student> students = new ArrayList<>();
    private List<Room> rooms = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added: " + student.getName());
    }

    public void addRoom(Room room) {
        rooms.add(room);
        System.out.println("Room added: " + room.getRoomNumber());
    }

    public void assignRoom(int studentId, int roomNumber) {
        Student student = findStudentById(studentId);
        Room room = findRoomByNumber(roomNumber);

        if (student != null && room != null && room.isAvailable()) {
            student.setRoom(room);
            room.setAvailable(false);
            System.out.println("Room " + roomNumber + " assigned to " + student.getName());
        } else {
            System.out.println("Error: Room unavailable or student not found.");
        }
    }

    public void showAllStudents() {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void showAllRooms() {
        for (Room r : rooms) {
            System.out.println(r);
        }
    }

    private Student findStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id) return s;
        }
        return null;
    }

    private Room findRoomByNumber(int roomNumber) {
        for (Room r : rooms) {
            if (r.getRoomNumber() == roomNumber) return r;
        }
        return null;
    }
}