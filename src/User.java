public class User {

    //불변 객체 , 이미 가지고 있는 값을 변경 할 수 없게 하는 객체 아래의 코드와 같음
    private String email;
    private String password;
    private String name;

    //생성자를 하나라도 만들게 되면, 기본생성자가 자동으로 안 만들어진다.
    public User( String name, String email) {
//        this.email = email;
//        this.name = name;
        this(name, email, null);//this는 첫번째줄에 있어야함
    }

    //생성자 오버로딩, 파마매트 순서도 똑같이 해야
    public User(String name,String email, String password){
        this.email = email;
        this.password = password;
        this.name = name;

    }

        public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
