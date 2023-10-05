public class CommadLineArgumentExam {
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("사용법 : CommadLineArgumentExam 값 값 ...");
            System.exit(0); //retrun; 으로 변경 가능 , exit는 이 프로그램을 끝내라는 뜻
        }

        for(String arg : args){
            System.out.println(arg);
        }
    }
}

/*
Hello.java 파일 작성하고
javac Hello.java

명령을 실행했을때 성공하면 아무런 메세지를 출력하지 않는다 -> Unix철학
Linux도 Unix의 게열임

작은 명령들을 조합해서 또 다른 명령을 만드는 경우가 많음 (쉘 스크립트 작성)

작은 명령들이 실행되고 종료될때, 잘되었는지 안되었는지 알려고 할때 System.exit하여 종료 시킴

*/
