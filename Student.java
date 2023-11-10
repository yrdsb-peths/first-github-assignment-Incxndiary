public class Student(){
  private String firstname;
  private String lastname;
  private int volunteerHours;
  
  public Student(String f, String l, int vH){
    firstname = f;
    lastname = l;
    volunteerHours = vH;
  }
  public String toString(){
    return firstname + ", " + lastname "goes to P.E.T.H.S. has " + volunteerHours " volunteer hours";
  }
}
