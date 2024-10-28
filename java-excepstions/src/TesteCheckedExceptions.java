import java.io.FileNotFoundException;

public class TesteCheckedExceptions {

    public static void main(String[] args){
        try {
            exemploChecked();

        } catch (FileNotFoundException ex) {
            System.out.println("Movitivo do erro: " + ex.getMessage());
        }
    }

    public static void exemploChecked () throws FileNotFoundException{
        throw new FileNotFoundException("deu");
    }

    public static void exemploUnchecked() {
        throw new RuntimeException("deu ruim");
    }
}
