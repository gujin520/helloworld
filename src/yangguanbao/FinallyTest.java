package yangguanbao;

public class FinallyTest {
    public static void main(String[] args) {
   get();
    }

    static String get(){
        try {
            return "try";
        }finally{
            return "finally";
        }
    }
}
