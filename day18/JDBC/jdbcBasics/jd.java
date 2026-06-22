package day18.JDBC.jdbcBasics;

import java.sql.*;

public class jd {
    private static final String url="jdbc:mysql://localhost:3306/sms2";
    private static final String userName="root";
    private static final String password="Shaik@5747";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection(url,userName,password);
        Statement st=con.createStatement();

        //Retrive data from the table//

//        String query="select * from students";
//       ResultSet rs= st.executeQuery(query);
//       while(rs.next()){
//           int id=rs.getInt("id");
//           String name=rs.getString("name");
//           String email=rs.getString("email");
//           int marks=rs.getInt("marks");
//
//           System.out.println(id);
//           System.out.println(name);
//           System.out.println(email);
//           System.out.println(marks);
//           System.out.println("---------------------");
//
//       }

        //Inserting values//

//        String query=String.format("insert into students (id,name,email,marks) values (%d,'%s','%s',%d)",2,"rock","eri@gmail.com",90);
//        int MyRessult=st.executeUpdate(query);
//        if(MyRessult>0){
//            System.out.println("success");
//        }
//        else{
//            System.out.println("fail");
//        }

        // UPDATED QUERY//

//        String query=String.format("Update students set marks=%d where id=%d",70,2);
//       int res = st.executeUpdate(query);
//       if(res>0){
//           System.out.println("Successfully updated");
//       }
//       else{
//           System.out.println("Failed");
//       }

        String query=String.format("delete from students where id=%d",2);
        int rowsFull=st.executeUpdate(query);
        if(rowsFull>0){
            System.out.println("Deleted rows from table");
        }
        else{
            System.out.println("Failed to delete rows from table");
        }

    }
}
