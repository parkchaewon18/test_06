package com.ll;

public class Main {
    public static void main(String[] args) {
        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();

        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();
        //출력 : 저는 날 수 없어요. ㅜㅜ
    }
}

class 오리 {
    void 날다() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
}

class 청둥오리 extends 오리 {
}

class 흰오리 extends 오리 {
}
class 고무오리 extends 오리 {
    void 날다() {
        System.out.println("저는 날 수 없어요. ㅜㅜ");
    } //오버라이드 : 자신이 가지고 있는 날다를 우선적으로 적용
}

