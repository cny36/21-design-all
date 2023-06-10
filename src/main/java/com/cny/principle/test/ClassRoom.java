package com.cny.principle.test;

import lombok.*;

import java.util.List;

/**
 * @author : chennengyuan
 */
@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ClassRoom extends Base {

    private String classRoomId;

    private String classRoomName;

    private Teacher teacher;

    private List<Student> studentList;
}
