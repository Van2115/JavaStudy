public class UserExam {
    public static  void main (String[] args){
        User user = new User("반희빈","bani2115@gmail.com");

//        System.out.println(user.getName());
//        System.out.println(user.getEmail());

        System.out.println(user);

        User user2 = new User("반희빈", "hondff@gmail.com","1234");
        System.out.println(user2.getName());
        System.out.println(user2.getEmail());
        System.out.println(user2.getPassword());
    }
}
