import java.io.*;

class ZeroException extends Exception{ }
class OvfException extends RuntimeException{ }

class GetN{
    int get_n() throws ZeroException, IOException{
        int n;
        n = System.in.read() - '0';
        if(n == 0){
            throw new ZeroException();
        }

        return n;
    }
}

class AddN{
    GetN gn;

    AddN(GetN gn){
        this.gn = gn;
    }

    int get_addn() throws IOException, ZeroException{
        int n = gn.get_n();
        n += 1;
        if(n > 5){
            throw new OvfException();
        }

        return n;
    }
}


class Exception_9{
    public static void main(String[] args) throws IOException{
        int n;
        AddN adn = new AddN(new GetN());
        try{
            n = adn.get_addn();
            System.out.println("--> " + n);
        }catch(ZeroException e){
            System.out.println("ZeroException !!");
            System.exit(1);
        }
    }
}