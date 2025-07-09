import java.util.Scanner;

class NimTooShortExceptiion extends Exception{ //Untuk nim kurang dari 15 digit
    public NimTooShortExceptiion(String message){
        super(message);
    }
}

class NimTooLongException extends Exception{ // Untuk nim lebih dari 15 digit
    public NimTooLongException(String message){
        super(message);
    }
}

class NimInvalidException extends Exception{ //Untuk kode Nim yang tidak valid
    public NimInvalidException(String message){
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nim;

        while(true){
            System.out.print("Masukan NIM (15 digit, dengan kode “10370311): ");
            nim = scan.nextLine();

            try{
                valid(nim);
                break;
            }catch(NimTooShortExceptiion e){
                System.out.println("Eror: " + e.getMessage());
            }catch (NimTooLongException e){
                System.out.println("Eror: " + e.getMessage());
            }catch (NimInvalidException e){
                System.out.println("Eror: " + e.getMessage());
            }
            System.out.println("Silahkan coba kembali...");
        }
        System.out.println("NIM berhasil: " + nim);
        scan.close();
    }
    public static void valid(String nim) throws NimTooShortExceptiion, NimTooLongException, NimInvalidException{
        if(nim.length() < 15){
            throw new NimTooShortExceptiion("Nim kurang dari 15 digit.");
        }
        if(nim.length() > 15){
            throw new NimTooLongException("Nim lebih dari 15 digit.");
        }
        String kode = "10370311";
        if(!nim.startsWith(kode)){ //startWith() artinya kode harus dimulai dengan kode yang sudah ditentukan
            throw new NimInvalidException("Nim harus dimulai dengan kode: " + kode);
        }
    }
}


