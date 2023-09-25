package com.example.fw;

/*
Controller의 종류가 여러개더라
초기화 - 같은 코드
실행 - 다른 코드
마무리 - 같은 코드
*/
public abstract class Controller {

    protected final void init(){
        System.out.println("초기화 하는 코드");
    }
    //procteted는 같은 package이거나 싱속 받았을때만 접근 가능
    //protected void init(){
    //    System.out.println("초기화 하는 코드");
    //} 자식, 자손이 오버라이드 못하도록 막아주기 위해 final을 추가해줌


    protected void close(){
        System.out.println("마무리 하는 코드");
    }

    protected abstract void run();//매번 다른 코드

    //내가 가지고 있는 메ㅐ소드를 호출한다.
    //어떤 순서를 가지고 있음, 이런 메소드를 템플릿 메소드라고 함
    public void execute(){
        this.init();
        this.run();
        this.close();
        //초기화
        //마무리

    }
}
