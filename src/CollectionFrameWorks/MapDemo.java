package CollectionFrameWorks;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapDemo {

    public static void main(String[] args) {
        Teacher t1 = new Teacher(1,"Soumya");
        Teacher t2 = new Teacher(2,"Lechu");
        Teacher t3 = new Teacher(1,"Soumya");

        Map<Teacher,String>  map = new HashMap<>();
        map.put(t1,"Engineer");
        map.put(t2,"Developer");
        map.put(t3,"Manager");

        System.out.println(map);
    }

}


class Teacher{
    private int id;
    private String name;

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id,this.name);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass()!= obj.getClass()) return false;
        Teacher  teacher = (Teacher) obj;
        return this.id == teacher.getId() && Objects.equals(this.name, teacher.name);
    }
}