/*
  10th Lab
  @team International(Talgat Bokeshov, Hussein Alhaj)
  @university BNTU
  @group number 10701117
 */

package by.bntu.fitr.povt.InternationalTeam.JavaLabs.Lab13.model.entity;

public class Man {
    
    protected String name;
    protected String surname;
    
    public void setName(String newName){
        name = newName;
    }
    
    public String getName(){
        return name;
    }
    public void setSurname(String newSurname){
        surname = newSurname;
    }
    public String getSurname(){
        return surname;
    }
}