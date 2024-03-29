import java.util.Comparator;

/*
Sorting by age
*/

public class AgeComparator implements Comparator<Student>
{
    @Override
    public int compare(Student student1, Student student2)
    {
        return   student2.getAge() - student1.getAge();
    }

}
