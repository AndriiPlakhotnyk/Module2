package ua.com.alevel.moduletwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Passwords {

    Code codForPassword = new Code();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Map<String, String> map = new HashMap<>();

    String enteringOfPassword = "Введите пароль";
    String code = "Введите шифр";
    String dataBase = "База шифров:";


    public void introduce() throws IOException {
        System.out.println("Вы можете зашифровать пароль, для этого введите 1");
        System.out.println("Если вы хотите выйти из программы, введите 3");

        String numberOfOperation = reader.readLine();

        if (numberOfOperation.equals("1")) {
            System.out.println(enteringOfPassword);
            String firstPassword = reader.readLine();
            map.put(codForPassword.generateString(), firstPassword);
            System.out.println(dataBase);
            System.out.println(map.keySet());
        } else if (numberOfOperation.equals("3")) {
            System.exit(0);
        } else {
            System.out.println("Выберете номер операции 1 или 3");
        }
    }


    public void run() throws IOException {
        System.out.println("");
        System.out.println("Введите номер операции:");
        System.out.println("1 - для шифрования пароля");
        System.out.println("2 - для дешифрования пароля");
        System.out.println("3 - для завершения программы");
        while (true) {

            String numberOfOperation = reader.readLine();

            if (numberOfOperation.equals("3")) {
                System.exit(0);
            } else if (numberOfOperation.equals("1") || numberOfOperation.equals("2")) {
                String password = null;

                if (numberOfOperation.equals("1")) {
                    System.out.println(enteringOfPassword);
                    password = reader.readLine();
                    map.put(codForPassword.generateString(), password);
                    System.out.println(dataBase);
                    System.out.println(map.keySet());
                } else {
                    System.out.println(code);
                    String s = reader.readLine();
                    if (map.get(s) == null) {
                        System.out.println("Этого шифра нет в базе");
                    } else {
                        System.out.println("Расшифрованый пароль " + map.get(s));
                    }
                }
                run();
            } else {
                System.out.println("Введен некорректный номер операции");
                run();
            }
        }
    }
}
