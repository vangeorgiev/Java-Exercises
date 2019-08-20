import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Weapon bow = new Weapon("Bow", 35);
        Weapon sword = new Weapon("Sword", 50);
        Weapon axe = new Weapon("Axe", 60);

        java.lang.Character troll = new java.lang.Character(50, "Troll",bow);
        java.lang.Character elf = new java.lang.Character(35, "Elf", sword);
        java.lang.Character wizard = new java.lang.Character(35, "Wizard", bow);

        try {
            FileOutputStream fileStream = new FileOutputStream("MyGame.ser");

            ObjectOutputStream os = new ObjectOutputStream(fileStream);

            os.writeObject(troll);
            os.writeObject(elf);
            os.writeObject(wizard);

            os.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            FileInputStream fileStream = new FileInputStream("MyGame.ser");

            ObjectInputStream os = new ObjectInputStream(fileStream);

            java.lang.Character oneRestore = (java.lang.Character) os.readObject();
            java.lang.Character secondRestore = (java.lang.Character) os.readObject();
            java.lang.Character thirdRestore = (java.lang.Character) os.readObject();

            System.out.println(oneRestore.getPower());
            System.out.println(secondRestore.getType());

            os.close();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }


    }
}
