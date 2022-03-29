package com.oop.solid;

public class solid_DIP_bad {

    public void coffee() {
        /* 월요일 */
        Developer man = new Developer();
        man.doDrink();
        
        /* 화요일은  Latte를 마시고 싶다. */   
    }

}

/* 특정 커피에 상속되면,, 다른 커피를 마실때는.. */
class Developer extends Americano {	

}

class Americano{
	void doDrink(){
		System.out.println("Americano를 마신다.");
	}
}

class Latte{
	void doDrink(){
		System.out.println("Latte를 마신다.");
	}
}

class Cappuccino{
	void doDrink(){
		System.out.println("cappuccino를 마신다.");
	}
}