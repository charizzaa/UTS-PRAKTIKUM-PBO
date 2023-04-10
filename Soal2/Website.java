package Soal2;

public class Website {
    private int index;
    private String username;
    private String password;

    public Website(int index, String username, String password) {
        this.index = index;
        this.username = username;
        this.password = password;
    }
    public String makeAccount(String username, String password){
        return this.username + this.password;
    }
    public void login(String username, String password){

    }
}
