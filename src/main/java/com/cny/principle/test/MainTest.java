package com.cny.principle.test;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : chennengyuan
 */
public class MainTest {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Teacher teacher = new Teacher("t1", "teacher_t1");
        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(new Student(1, "zs", 14, new BigDecimal(100)));
        studentList1.add(new Student(2, "ls", 15, new BigDecimal(300)));
        ClassRoom baseData = new ClassRoom("c1", "教室1", teacher, studentList1);

        Teacher teacher2 = new Teacher("t1", "teachert1");
        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(new Student(1, "zss", 24, new BigDecimal(1001)));
        studentList2.add(new Student(2, "lss", 25, new BigDecimal(3001)));
        ClassRoom updateData = new ClassRoom("c1", "教室-1", teacher2, studentList2);

        ClassRoom cr = new ClassRoom();

        cr = copyABObjDifferentFieldToCObj(baseData, updateData, cr.getClass());


        System.out.println(cr);

    }

    private static <T> T copyABObjDifferentFieldToCObj(Object baseData, Object updateData, Class<T> targetClazz) throws IllegalAccessException, InstantiationException {
        T targetObj = targetClazz.newInstance();
        Field[] allFields = targetClazz.getDeclaredFields();
        for (Field field : allFields) {
            field.setAccessible(true);
            Object oldObjFieldValue = field.get(baseData);
            Object modifyObjFieldValue = field.get(updateData);

            if(modifyObjFieldValue != null) {
                if(oldObjFieldValue == null) {
                    //初始值为空，修改后值不为空
                    field.set(targetObj, modifyObjFieldValue);
                } else {
                    //初始值不为空，修改后值不为空
                    boolean equals = oldObjFieldValue.equals(modifyObjFieldValue);
                    if(!equals) {
                        field.set(targetObj, modifyObjFieldValue);
                    }
                }
            }
        }
        return targetObj;
    }

}
