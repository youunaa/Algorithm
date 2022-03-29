package com.oop.solid;

public class solid_DIP_good {

    public void coffee() {
        /* 월요일 */
		Developer2 man = new Developer2();
		man.doCoffee();
        /* 화요일은  Latte를 마시고 싶다. */   
    }

}

class Developer2 {
	/* 월요일 */
	// Coffee coffee = new Americano2();	
	
	/* 화요일 */
	Coffee coffee = new Latte2();	
	
	void doCoffee() {
		coffee.doDrink();
	}
}

interface Coffee {
	// 1) 규칙이기 때문에 무조건 공개 메서드이고 추상 메서드이다.
	public abstract void m1();
	// 2) public을 생략해도 내부적으로 public으로 간주한다.
	abstract void m2();

	// 4) 구현 메서드를 가질 수 없지마 자바 8부터default 라는 키워드로 메서드 구현이 가능
  	default void m4() {} // 컴파일 오류!
	// void m4() {} // 컴파일 오류!

	// [필드 선언 규칙]
	// 1) 규칙이기 때문에 무조건 공개 필드이고, 스태틱 필드이다 그리고 값을 바꿀 수 없는 상수 필드이다.
	public static final int v1 = 200;
 
	// 2) public을 생략하면 내부적으로 public으로 간주한다.
	static final int v2 = 200;
   
	// 3) static을 새약하면 내부적으로 static으로 간주한다.
	final int v3 = 200;
   
	// 4) final을 생략하면 내부적으로 final로 간주한다.
	int v4 = 200;

	String doDrink();
}

class Americano2 implements Coffee {
	// Coffee의 수퍼 인터페이스는 Americano2의 메서드 구현
	public void m1() {}
	public void m2() {}
	
	/*public abstract */ 
	public String doDrink(){
		return "아메를 마신다.";
	}
}

class Latte2 implements Coffee {
	// Coffee의 수퍼 인터페이스는 Latte2의 메서드 구현
	public void m1() {}
	public void m2() {}
	public String doDrink(){
		return "라떼를 마신다.";
	}
}

class Cappuccino2 implements Coffee {
	// Coffee의 수퍼 인터페이스는 Cappuccino2의 메서드 구현
	public void m1() {}
	public void m2() {}
	public String doDrink(){
		return "카푸치노를 마신다.";
	}
}