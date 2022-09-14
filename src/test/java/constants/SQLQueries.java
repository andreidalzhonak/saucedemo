package constants;

public class SQLQueries {
    public static  final String SELECT_FROM = "select * from %s";
    public static  final String SELECT_STUDENT_BY_ID = "select * from %s where id=%s";

    public static final String ADD_STUDENTS = "INSERT INTO  AQA15.students (name, group_id) VALUES ('%s', '%d')";
}
