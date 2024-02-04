$(function() {

    /* 제품 가격 넣기 */
    /* 초기 가격 : 특, 5kg */
    let $productPrice = 45000;
    let $totalPrice = $('#total_price');

    $totalPrice.text($productPrice.toLocaleString('ko-KR'));

    /* 수량 선택에 + 눌렀을 때 */
    $('#plus').on('click', () => {
        let $number = $('input[name=number]');
        
        $number.val(parseInt($number.val()) + 1);
        $totalPrice.text(($productPrice * parseInt($number.val())).toLocaleString('ko-KR'));
    });

    /* 수량 선택에 - 눌렀을 때 */
    $('#minus').on('click', () => {
        let $number = $('input[name=number]');

        // 수량이 1보다 작거나 같으면 - 안되게
        if($number.val() <= 1) {
            return;
        }

        $number.val(parseInt($number.val()) - 1);
        $totalPrice.text(($productPrice * parseInt($number.val())).toLocaleString('ko-KR'));
    });

});