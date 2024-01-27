package CollectionFrameWorks;

public class Student implements Comparable{
    private Integer totalMarks;
    private String name;

    public Student(String name, Integer totalMarks) {
        this.name = name;
        this.totalMarks = totalMarks;
    }
    public Integer getTotalMarks() {
        return totalMarks;
    }
    public void setTotalMarks(Integer totalMarks) {
        this.totalMarks = totalMarks;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int compareTo(Object o) {
        if (this.totalMarks > ((Student) o).totalMarks)
            return 1;
        else
            return 0;
    }
    
    @Override
    public String toString() {
        return "Student [totalMarks=" + totalMarks + ", name=" + name + "]";
    }

    
}
