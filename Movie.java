/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package movie;


import java.sql.*;
import java.util.*;

/**
 *
 * @author vengat
 */
public class Movie {
/*public void getMoviesList(String name, String actor,String actrs, String yor, String dirname)
{
    System.out.println("Movies List");
    System.out.println(name+" "+actor+" "+actrs+" "+yor+" "+dirname);
}
 public void getMoviesByName(String name, String actor,String actrs, String yor, String dirname, String movname)
{
    if(movname==name)
    {
    System.out.println("Selected Movies is"+name+" "+actor+" "+actrs+" "+yor+" "+dirname);
    }
    else
    {
        System.out.println("No Movies found");
    }
}   /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        
        try{
           
            String str="SELECT * FROM Movies";
           
           
            Scanner s=new Scanner(System.in);
            String movname;
            movname=s.next();
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/movies","prathiba","prathiba");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(str);
    
            while(rs.next())
            {
                String name=rs.getString("m_name");
                String actor=rs.getString("m_actor");
                String actrs=rs.getString("m_actrs");
                String yor=rs.getString("m_yor");
                String dirname=rs.getString("m_dirname");
                System.out.println(name+" "+actor+" "+actrs+" "+yor+" "+dirname);
                if(movname==name)
    {
    System.out.println("Selected Movies is"+name+" "+actor+" "+actrs+" "+yor+" "+dirname);
    }
    else
    {
        System.out.println("No Movies found");
    }
                
            }
            
        }
        catch(Exception e)
        {
            System.out.println("Error"+e);
        }
    }
}
