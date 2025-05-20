class Student {
    private int id;
    private String name;
    private int age;
    private Room room; 

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public Room getRoom() { return room; }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name + ", Age: " + age +
               (room != null ? ", Room: " + room.getRoomNumber() : ", No room assigned");
    }
}
