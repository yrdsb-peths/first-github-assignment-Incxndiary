public class Student(){
  private String firstname;
  private String lastname;
  
  public Student(String f, String l){
    firstname = f;
    lastname = l;
  }
  public String toString(){
    return firstname + ", " + lastname "goes to P.E.T.H.S.";
  }
}
