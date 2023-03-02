package demo.annotation;

import java.lang.annotation.Annotation;

public class AnnotationParser {
    public static void parseTypeAnnotation() throws ClassNotFoundException {
        Class clazz = Class.forName("demo.annotation.ImoocCourse");
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations){
            CourseInfoAnnotation courseInfoAnnotation = (CourseInfoAnnotation) annotation;
            System.out.println("课程名:" + courseInfoAnnotation.courseName() + "\n" +
                    "课程标签：" + courseInfoAnnotation.courseTag() + "\n" +
                    "课程简介：" + courseInfoAnnotation.courseProfile() + "\n" +
                    "课程序号：" + courseInfoAnnotation.courseIndex() );        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        AnnotationParser annotationParser = new AnnotationParser();
        annotationParser.parseTypeAnnotation();
    }
}
