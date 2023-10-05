public class EmptyCommandLineArgumentExam {
    public static void main(String[] agrs){
        System.out.println(agrs.length);
    }
}
//String[] agrs = new String[0[;
//main(args);
//javac EmptyCommandLineArgumentExam.java
//java EmptyCommandLineArgumentExam a b c d e (공백을 기준으로 잘라지기 때문에 문자열 배열이 args에 들어옴)
//java -javaagent:어떤설정 EmptyCommandLineArgumentExam a b c