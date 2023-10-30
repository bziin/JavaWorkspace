package chap_11;


import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class _Quiz_11 {
    //에러코드
    // 0 ( 에러없음), 1 (판매시간아님), 2 ( 매진)

    // 0 인경우? 상품 구매를 완료하였습니다.
    // 1 인경우? 상훔 구매 가능 시간이 아닙니다. / 상품 구매는 20 시부터 가능합니다.
    // 2 인경우? 해당 상품은 매진되었습니다. / 다음 기회에 이용해주세요.
    public static void main(String[] args) {
        int errorCode = 2;
        try {
            if(errorCode == 0) {
                System.out.println("상품구매를 완료하였습니다.");
            } else if (errorCode ==1) {
                throw new NotOnSaleException(" 상품구매 가능 시간이 아닙니다.");
                
            } else if (errorCode == 2) {
                throw new SoldOutException("해당 상품은 매진되었습니다.");

            }

        }catch (NotOnSaleException e) {
            System.out.println(e.getMessage());
            System.out.println("상품구매는 20시부터 가능합니다.");

        }catch (SoldOutException e) {
            System.out.println(e.getMessage());
            System.out.println("다음기회에 이용해주세요.");

        }


    }

}


class NotOnSaleException extends Exception {
    public NotOnSaleException(String message) {
        super(message);
    }
}

class SoldOutException extends Exception {
    public SoldOutException(String message) {
        super(message);
    }
}