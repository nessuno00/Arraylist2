import java.util.ArrayList;

import java.util.Collections;
import  java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Student> Lista = new ArrayList<>();
        Random random = new Random();


        for ( int i = 0; i < 12; i ++) {

            String randName = "Student" + (i + 1);

            int randAge = random.nextInt(8) + 12;

            Lista.add(new Student(randName,randAge));

        }

        System.out.println(Lista);

        Collections.sort(Lista, (s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()));

        System.out.println("\nList ordinato per età: " + Lista);

    }
}