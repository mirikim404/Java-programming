package quiz4;

public class 엄마 extends 할머니 {
    private String 일기장;
    public 핸드폰 핸드폰압수bag;

    public void 요리하기(){
    	System.out.println("스파게티를 만들어요");
    }

    public void 청소하기(){
    	System.out.println("구석구석 깨끗해요");
    }

    public void 할머니처럼요리하기(){
    	super.요리하기();
    }

    public void 핸드폰뺏기(짱구 짱){
    	System.out.println("엄마가 짱구의 전화기를 뺏었습니다!");
    	this.핸드폰압수bag = 짱.getPhone();
    	짱.setPhone(null);
    }

}
