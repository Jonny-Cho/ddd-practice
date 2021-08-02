## 요구 사항

- POS 시스템을 구현한다.
- 메뉴그룹
    - [ ] 메뉴 그룹을 추가할 수 있다
        - [ ] 메뉴 그룹 이름은 한글자 이상이어야 한다
        - [ ] 메뉴 그룹 이름은 중복될 수 있다
    - [ ] 메뉴 그룹 리스트를 조회할 수 있다

- 메뉴
    - [ ] 메뉴를 추가할 수 있다
        - [ ] 메뉴 그룹이 존재해야한다
        - [ ] 가격은 필수값이다
        - [ ] 가격은 0 이상이어야 한다
        - [ ] 하나 이상의 메뉴상품을 요청해야 한다
        - [ ] 메뉴 상품의 상품들은 모두 존재하는 상품이어야 한다
        - [ ] 메뉴 상품의 상품수량은 모두 0 이상이어야 한다
        - [ ] 메뉴 가격은 메뉴에 포함된 상품가격과 갯수를 곱해 모두 더한 가격보다 작거나 같아야 한다.
        - [ ] 메뉴 이름은 한글자 이상이어야 한다
        - [ ] 메뉴 이름은 중복될 수 있다
        - [ ] 메뉴 이름은 비속어가 포함될 수 없다

    - [ ] 메뉴의 가격을 수정할 수 있다
        - [ ] 메뉴 가격은 필수값이다 
        - [ ] 메뉴 가격은 0 이상이어야 한다
        - [ ] 메뉴 가격은 메뉴에 포함된 상품가격과 갯수를 곱해 모두 더한 가격보다 작거나 같아야 한다.

    - [ ] 메뉴가 노출 되도록 설정할 수 있다
        - [ ] 존재하는 메뉴여야 한다
        - [ ] 메뉴 가격은 메뉴에 포함된 상품가격과 갯수를 곱해 모두 더한 가격보다 작거나 같아야 한다.

    - [ ] 메뉴가 노출 되지 않도록 설정할 수 있다
        - [ ] 존재하는 메뉴여야 한다

    - [ ] 메뉴 리스트를 조회할 수 있다

- 주문 테이블
    - [ ] 주문 테이블을 추가할 수 있다
        - [ ] 주문 테이블 이름은 한글자 이상이어야 한다
        - [ ] 주문 테이블 이름은 중복될 수 있다

    - [ ] 주문 테이블에 손님이 앉을 수 있다(sit)
        - [ ] 존재하는 테이블이어야한다

    - [ ] 주문 테이블을 치울 수 있다(clear)
        - [ ] 존재하는 테이블이어야한다
        - [ ] 주문 상태가 모두 완료일 경우에만 치울 수 있다

    - [ ] 테이블의 앉은 손님의 수를 변경할 수 있다
        - [ ] 변경할 손님의 수는 0 이상이어야 한다
        - [ ] 존재하는 테이블이어야한다
        - [ ] 테이블에 손님이 앉아 있는 상태인 경우에만 가능하다

    - [ ] 테이블 리스트를 조회할 수 있다

- 주문
    - [ ] 주문할 수 있다
        - [ ] 주문 타입은 필수값이다
        - [ ] 주문 타입종류는 배달, 포장, 매장 내 식사가 있다
        - [ ] 주문 상품은 필수값이다
        - [ ] 주문 타입이 배달, 포장인 경우 주문 상품 수량은 0 이상이어야 한다
        - [ ] 주문 상품의 메뉴는 모두 존재해야한다
        - [ ] 주문 상품의 메뉴는 모두 노출된 상태여야 한다
        - [ ] 주문 상품의 메뉴 가격과 실제 메뉴 가격이 같아야 한다
        - [ ] 주문 타입이 배달인경우 배달 주소가 필수값이다
        - [ ] 주문 타입이 매장 내 식사인경우 주문 테이블이 존재해야한다
        - [ ] 주문 타입이 매장 내 식사인경우 주문 테이블에 손님이 앉은 상태여야한다
        - [ ] 주문 상태를 대기로 변경한다
    
    - [ ] 주문을 승인할 수 있다
        - [ ] 존재하는 주문이어야한다
        - [ ] 주문 상태가 대기여야한다
        - [ ] 주문 타입이 배달인 경우 배달기사에게 주문 요청사항을 전달해야 한다.
        - [ ] 주문 상태를 승인으로 변경한다
    
    - [ ] 서빙할 수 있다
        - [ ] 존재하는 주문이어야 한다
        - [ ] 주문 상태가 승인이어야 한다
        - [ ] 주문 상태를 서빙완료로 변경한다
    
    - [ ] 배달을 시작할 수 있다
        - [ ] 존재하는 주문이어야 한다
        - [ ] 주문 타입이 배달이어야 한다
        - [ ] 주문 상태가 서빙완료여야 한다
        - [ ] 주문 상태를 배송중으로 변경한다
    
    - [ ] 배달을 완료할 수 있다
        - [ ] 존재하는 주문이어야 한다
        - [ ] 주문 타입이 배달이어야 한다
        - [ ] 주문 상태가 배송중이어야 한다
        - [ ] 주문 상태가 배송완료로 변경한다
    
    - [ ] 완료할 수 있다
        - [ ] 존재하는 주문이어야 한다
        - [ ] 주문 타입이 배달이라면 배송완료 상태여야한다
        - [ ] 주문 타입이 포장이나 매장 내 식사라면 서빙완료 상태여야한다
        - [ ] 주문 상태를 완료로 변경한다
        - [ ] 주문 타입이 매장 내 식사라면 주문 테이블을 치운다
    
    - [ ] 주문 리스트를 조회할 수 있다
    
- 상품
    - [ ] 상품을 추가할 수 있다
        - [ ] 상품 가격은 필수값이다
        - [ ] 상품 가격은 0 이상이어야 한다
        - [ ] 상품 이름은 한글자 이상이어야 한다
        - [ ] 상품 이름은 비속어가 포함될 수 없다

    - [ ] 상품의 가격을 수정할 수 있다
        - [ ] 상품 가격은 필수값이다
        - [ ] 상품 가격은 0 이상이어야 한다
        - [ ] 존재하는 상품이어야 한다
        - [ ] 상품가격 수정으로 인해 메뉴가격이 메뉴에 포함된 상품가격과 갯수를 곱해 모두 더한 가격보다 같거나 비싸진다면 해당 메뉴를 노출시키지 말아야 한다

    - [ ] 상품 리스트를 조회할 수 있다

## 용어 사전

| 한글명 | 영문명 | 설명 |
| --- | --- | --- |
| 메뉴 그룹 | Menu Group | 메뉴 그룹 |
| 메뉴 | Menu | 주문 가능한 메뉴 |
| 주문 테이블 | Order Table | 손님이 앉을 수 있는 테이블 |
| 앉다 | Sit | 테이블에 손님이 앉는 행위 |
| 치우다 | Clear | 테이블을 치우는 행위 |
| 상품 | Product | 상품 |
| 주문 | Order | 주문 |
| 주문 타입 | Order Type | 배달, 포장, 매장 내 식사가 있다 |
| 배달 | Delivery | 주문 타입 |
| 포장 | Takeout | 주문 타입 |
| 매장 내 식사 | EAT_IN | 주문 타입 |
| 주문 상태 | Order Status | 대기, 승인, 서빙완료, 배송중, 배송완료, 완료 상태가 있다 |
| 대기 | Waiting | 손님이 주문한 직후의 상태 |
| 승인 | Accepted | 대기주문을 매장에서 승인한 상태 |
| 서빙완료 | Served | 주문 타입이 포장 혹은 매장 내 식사인 경우 상품이 손님에게 전달 된 상태, 주문 타입이 배달인 경우 상품이 준비된 상태 |
| 배송중 | Delivering | 주문 타입이 배달인경우 배달이 출발한 상태 |
| 배송완료 | Delivered | 주문 타입이 배달인경우 배달이 완료된 상태 |
| 완료 | Completed | 결제 완료된 상태 |
| 비속어 | Profanity | 비속어 |
| 배달기사 | Kitchen rider | 배달기사 |

## 모델링
