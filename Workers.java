public class Workers {
    private String full_name;
    private String post;
    private int age;
    private String email;
    private String phone;

    public Workers(String full_name, String post, int age, String email, String phone) {
        this.full_name = full_name;
        this.post = post;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }
    public void printInfo(){
        System.out.println("Full name - "+ full_name + "; Post - "+ post + "; Age - "+age+ "; email: "+ email + "; Phone: "+ phone);
    }
}

