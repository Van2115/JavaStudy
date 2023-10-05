public class ObjectBox {
    private Object object;

    public void set(Object obj){ // 오브젝트 뿐만 아니라 오브젝트의 후손들을 다 들어 올 수 있음
        this.object = obj;
    }

    public Object get(){ //자기가 가지고 있는 object 자체를 반환 해줌
        return this.object;
    }
}
