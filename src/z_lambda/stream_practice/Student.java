package z_lambda.stream_practice;

import lombok.*;

import java.util.Objects;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private String gender;
    private int math;
    private int english;

    @Override
    public int compareTo(Student student) {
        return this.age - student.age;
    }
}
