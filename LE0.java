/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class juet{
    String name;
    int age;
    public void set(String n, int a){
      this.name=n;
      this.age=a;
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
}
public class Main
{
	public static void main(String[] args) {
	    juet obj = new juet();
	    obj.set("dee", 2);
	    System.out.println(obj.getname());
	    System.out.println(obj.getage());
		
	}
}