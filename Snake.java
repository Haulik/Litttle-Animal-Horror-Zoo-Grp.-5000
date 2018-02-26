public class Snake{

  private String name = "";
  private String species = "";
  private String color = "";
  private String sex = "";  
  private int age = 0;
   
   public Snake(){
      System.out.println("Loading Snake..." + "\n");
      name = "Jonny";
      species = "Snog";
      color = "black";
      sex = "girl/boy";
      age = 10;
   
   }
   
   public Snake(String name, String species, String color, String sex, int age){
   this.name = name;
   this.species = species;
   this.color = color;
   this.sex = sex;
   this.age = age; 
   }
   public void setSnake(String name, String species, String color, String sex, int age){
      this.name = name;
      this.species = species;
      this.color = color;
      this.sex = sex;
      this.age = age;
   }
   public void printSnakeInfo(){
   System.out.println("Name:      " + name);
   System.out.println("Species:   " + species);
   System.out.println("Color:     " + color);
   System.out.println("Sex:       " + sex);
   System.out.println("Age:       " + age + "\n");
}}