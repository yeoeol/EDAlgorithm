package do_it_java.CollectionFrameWork.generics;

public class Plastic extends Material{

    public String toString() {
        return "재료는 Plastic 입니다.";
    }

    @Override
    public void doPrinting() {
        System.out.println("Plastic 재료로 출력합니다.");
    }
}
