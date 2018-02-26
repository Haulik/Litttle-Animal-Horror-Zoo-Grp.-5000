public class Rabbit{


  private String name = "";
  private String species = "";
  private String color = "";
  private String sex = "";  
  private int age = 0;
   
   public Rabbit(){
      System.out.println("Loading Rabbit..." + "\n");
      name = "Jack";
      species = "Speeder";
      color = "black";
      sex = "girl/boy";
      age = 10;
   
   }
   
   public Rabbit(String name, String species, String color, String sex, int age){
   this.name = name;
   this.species = species;
   this.color = color;
   this.sex = sex;
   this.age = age; 
   }
   public void setRabbit(String name, String species, String color, String sex, int age){
      this.name = name;
      this.species = species;
      this.color = color;
      this.sex = sex;
      this.age = age;
   }
   public void printRabbitInfo(){
   System.out.println("Name:      " + name);
   System.out.println("Species:   " + species);
   System.out.println("Color:     " + color);
   System.out.println("Sex:       " + sex);
   System.out.println("Age:       " + age + "\n");




  
   

   

}
}